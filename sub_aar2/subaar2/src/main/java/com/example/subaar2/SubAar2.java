package com.example.subaar2;

import android.app.Activity;
import android.content.Context;

import androidx.annotation.NonNull;

public class SubAar2 {
	private final Context appContext;

	public SubAar2(@NonNull Context context) {
		if (context instanceof Activity) {
			this.appContext = context.getApplicationContext();
		} else {
			this.appContext = context;
		}
	}

	public String getText() {
		return appContext.getResources().getString(R.string.sub_aar_2_text);
	}
}
