package com.example.subaar1;

import android.content.Context;
import android.util.Log;

public class SubAar1 {
    private final static String TAG = SubAar1.class.getSimpleName();

    private Context context = null;

    public SubAar1(Context context) {
        this.context = context;
    }

    public String getText() {
        if (context == null) {
            Log.i(TAG, "context is null, please set valid context..");
            return "";
        }
        return context.getResources().getString(R.string.sub_aar_1_text);
    }
}
