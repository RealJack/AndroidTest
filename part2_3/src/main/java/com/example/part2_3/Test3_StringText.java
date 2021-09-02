package com.example.part2_3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Test3_StringText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3_string_text);

        TextView textView = findViewById(R.id.stringTest);
        textView.setText(R.string.test_message);
    }
}