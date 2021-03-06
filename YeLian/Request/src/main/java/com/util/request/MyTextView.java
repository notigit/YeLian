package com.util.request;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 重写TextView 自动获取焦点，跑马灯无限循环
 * Created by nice on 2016/2/15.
 */
public class MyTextView extends TextView {

    public MyTextView(Context context) {
        super(context);
        createView();
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        createView();
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        createView();
    }

    private void createView() {
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setMarqueeRepeatLimit(-1);
        setFocusableInTouchMode(true);
    }

    @Override
    protected void onFocusChanged(boolean focused, int direction,
                                  Rect previouslyFocusedRect) {
        if (focused) {
            super.onFocusChanged(focused, direction, previouslyFocusedRect);
        }
    }

    @Override
    public void onWindowFocusChanged(boolean focused) {
        if (focused) {
            super.onWindowFocusChanged(focused);
        }
    }

    @Override
    public boolean isFocused() {
        return true;
    }

}
