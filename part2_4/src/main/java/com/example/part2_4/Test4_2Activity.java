package com.example.part2_4;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Test4_2Activity extends AppCompatActivity {
    ImageView icon2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test42);

        icon2 = findViewById(R.id.icon2);
        icon2.setClipToOutline(true);
    }
}