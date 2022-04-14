package com.example.subaar2;

import android.content.Context;
import android.util.Log;

public class SubAar2 {
    private final static String TAG = SubAar2.class.getSimpleName();

    private Context context = null;

    public SubAar2(Context context) {
        this.context = context;
    }

    public String getText() {
        if (context == null) {
            Log.i(TAG, "context is null, please set valid context..");
            return "";
        }
        return context.getResources().getString(R.string.sub_aar_2_text);
    }
}
