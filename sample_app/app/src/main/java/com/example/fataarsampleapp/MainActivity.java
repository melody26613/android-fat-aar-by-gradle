package com.example.fataarsampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.example.fataar.FatAar;
import com.example.fataarsampleapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ActivityMainBinding binding = ActivityMainBinding.inflate(LayoutInflater.from(MainActivity.this));
		setContentView(binding.getRoot());

		FrameLayout layout = binding.layoutForFatAar;
		FatAar fatAar = new FatAar(layout);
	}
}