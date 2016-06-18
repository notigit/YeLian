package com.util.request;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author TangChao
 * @date 2014年12月3日 下午3:14:43
 */
public class LiteSharePreference {
    private SharedPreferences sharedPreferences;

    private SharedPreferences.Editor mEditor;

    public LiteSharePreference(Context mContext, String xmlName) {
        sharedPreferences = mContext.getSharedPreferences(xmlName, Activity.MODE_PRIVATE);
        mEditor = sharedPreferences.edit();
        mEditor.apply();
    }

    public void putBoolean(String key, boolean defaultValue) {
        mEditor.putBoolean(key, defaultValue);
        mEditor.commit();
    }

    public void putFloat(String key, Float defaultValue) {
        mEditor.putFloat(key, defaultValue);
        mEditor.commit();
    }

    public void putInt(String key, int defaultValue) {
        mEditor.putInt(key, defaultValue);
        mEditor.commit();
    }

    public void putLong(String key, long defaultValue) {
        mEditor.putLong(key, defaultValue);
        mEditor.commit();
    }

    public void putString(String key, String defaultValue) {
        mEditor.putString(key, defaultValue);
        mEditor.commit();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return sharedPreferences.getBoolean(key, defaultValue);
    }

    public Float getFloat(String key, Float defaultValue) {
        return sharedPreferences.getFloat(key, defaultValue);
    }

    public int getInt(String key, int defaultValue) {
        return sharedPreferences.getInt(key, defaultValue);
    }

    public long getLong(String key, long defaultValue) {
        return sharedPreferences.getLong(key, defaultValue);
    }

    public String getString(String key, String defaultValue) {
        return sharedPreferences.getString(key, defaultValue);
    }
}
