package com.example.part2_4;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Test4_LinearLayout extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test4_linear_layout);

        imageView = findViewById(R.id.linearLayout_imageView);

        imageView.setClipToOutline(true);
    }
}