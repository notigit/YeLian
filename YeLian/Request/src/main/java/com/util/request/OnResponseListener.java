package com.util.request;

/**
 * Created by tangchao on 2015/12/09.
 */
public interface OnResponseListener {

    void onSuccess(String response);

    void onFailure();


}
