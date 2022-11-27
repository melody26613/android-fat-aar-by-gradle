package com.example.fataar;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.subaar1.SubAar1;
import com.example.subaar2.SubAar2;

public class FatAar {
    private final static String TAG = FatAar.class.getSimpleName();

    private final FrameLayout rootLayout;
    private final Context context;

    public FatAar(@NonNull FrameLayout layout) {
        rootLayout = layout;
        context = rootLayout.getContext();

        initLayout();
    }

    private void initLayout() {
        ConstraintLayout layout = (ConstraintLayout) LayoutInflater.from(context).inflate(
                R.layout.layout_fat_aar_sample,
                rootLayout,
                false
        );

        SubAar1 subAar1 = new SubAar1(context);
        SubAar2 subAar2 = new SubAar2(context);

        TextView textView1 = layout.findViewById(R.id.text1);
        TextView textView2 = layout.findViewById(R.id.text2);

        textView1.setText(subAar1.getText());
        textView2.setText(subAar2.getText());

        rootLayout.addView(layout);
    }

}
