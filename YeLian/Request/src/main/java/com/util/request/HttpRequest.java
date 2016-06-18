package com.util.request;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestHandle;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.ResponseHandlerInterface;
import com.loopj.android.http.TextHttpResponseHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import cz.msebera.android.httpclient.Header;

/**
 * Created by tangchao on 15/8/23.
 */
public class HttpRequest {

    //    private static final boolean DEBUG = BuildConfig.DEBUG;
    private static final boolean DEBUG = false;//发布时改为false

    public static final String TAG = HttpRequest.class.getName();

    protected static AsyncHttpClient client = new AsyncHttpClient();

    public RequestHandle post(Context context, @NonNull String url, @NonNull OnResponseListener onResponseListener) {
        if (DEBUG)
            Log.d(TAG, "Request Url >>>>>>>>>>>> " + url);

        RequestParams requestParams = new RequestParams();
        packageParameters(context, requestParams);
        return client.post(context, url, requestParams, new Response(onResponseListener));
    }

    public RequestHandle post(Context context, @NonNull String url, @NonNull List<BasicKeyValue> parameters, @NonNull final OnResponseListener onResponseListener) {
        if (DEBUG)
            Log.d(TAG, "Request Url >>>>>>>>>>>> " + url);

        RequestParams requestParams = new RequestParams();
        for (BasicKeyValue item : parameters) {
            requestParams.put(item.getKev(), item.getValue());
        }
        packageParameters(context, requestParams);
        return client.post(context, url, requestParams, new Response(onResponseListener));
    }

    /**
     * 上传文件
     *
     * @param context
     * @param url
     * @param filePath
     * @param onResponseListener
     * @return
     */
    public RequestHandle post(Context context, @NonNull String url, @NonNull String filePath, OnResponseListener onResponseListener) {
        if (DEBUG)
            Log.d(TAG, "Request Url >>>>>>>>>>>> " + url);
        RequestParams rp = new RequestParams();
        try {
            rp.put("f1", new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        rp.put("pn", "ddkg");
        return client.post(context, url, rp, new Response(onResponseListener));
    }

    /**
     * 上传文件
     *
     * @param context
     * @param url
     * @param filePath
     * @param responseHandlerInterface
     * @return
     */
    public RequestHandle post(Context context, @NonNull String url, @NonNull String filePath, ResponseHandlerInterface responseHandlerInterface) {
        if (DEBUG)
            Log.d(TAG, "Request Url >>>>>>>>>>>> " + url);

        client.setTimeout(30 * 1000);
        client.setConnectTimeout(30 * 1000);
        client.setResponseTimeout(30 * 1000);

        RequestParams rp = new RequestParams();
        try {
            rp.put("f1", new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        rp.put("pn", "ddkg");
        return client.post(context, url, rp, responseHandlerInterface);
    }

    public void get(String url, ResponseHandlerInterface responseHandlerInterface) {
        client.get(url, responseHandlerInterface);
    }

    /**
     * 进一步处理响应
     */
    private class Response extends TextHttpResponseHandler {

        private OnResponseListener onResponseListener;

        public Response(OnResponseListener onResponseListener) {
            this.onResponseListener = onResponseListener;
        }

        @Override
        public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
            if (DEBUG)
                Log.e(TAG, "Request failure: error code >>>>>>>>>> " + statusCode + "\nException >>>>>>>>>> " + throwable.toString() + "\n");
            onResponseListener.onFailure();
        }

        @Override
        public void onSuccess(int statusCode, Header[] headers, String responseString) {
            if (200 == statusCode) {
                if (DEBUG)
                    Log.d(TAG, "Request success >>>>>>>>>> " + responseString + "\n");
                if (!TextUtils.isEmpty(responseString))
                    onResponseListener.onSuccess(responseString);
            }
        }
    }

    /**
     * 取出UserId
     *
     * @param context
     * @return
     */
    private int obtainUserId(Context context) {
        LiteSharePreference sp = new LiteSharePreference(context, Extra.USER_XML);
        return sp.getInt(Extra.USER_XML_USER_ID, 0);
    }

    /**
     * 添加固定 参数
     *
     * @param context
     * @param rp
     */
    private void packageParameters(Context context, RequestParams rp) {
        if (null != rp) {
            int userId = obtainUserId(context);
            rp.put("user", String.valueOf(userId));
            rp.put("apikey", MD5Tool.getMD5_32(String.valueOf("ddkg" + userId)));
        }
    }
}