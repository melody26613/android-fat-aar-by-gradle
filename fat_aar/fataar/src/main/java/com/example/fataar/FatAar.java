package com.example.fataar;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.fataar.databinding.LayoutFatAarBinding;
import com.example.subaar1.SubAar1;
import com.example.subaar2.SubAar2;

public class FatAar {
    private final LayoutFatAarBinding binding;
    private final Context context;

    public FatAar(@NonNull FrameLayout layout) {
        this.context = layout.getContext();
        this.binding = LayoutFatAarBinding.inflate(LayoutInflater.from(context), layout, true);

        initLayout();
    }

    private void initLayout() {
        SubAar1 subAar1 = new SubAar1(context);
        SubAar2 subAar2 = new SubAar2(context);

        TextView textView1 = binding.text1;
        TextView textView2 = binding.text2;

        textView1.setText(subAar1.getText());
        textView2.setText(subAar2.getText());
    }

}
