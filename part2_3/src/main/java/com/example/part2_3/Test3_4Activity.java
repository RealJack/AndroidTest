package com.example.part2_3;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Test3_4Activity extends AppCompatActivity {
    TextView textView;
    Typeface typeface;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test34);

        textView = findViewById(R.id.test3_4TypeFace);
        typeface = Typeface.createFromAsset(getAssets(), "KoPub Dotum Bold.ttf");
        textView.setTypeface(typeface);

        checkBox = findViewById(R.id.test3_4CheckBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                checkBox.setText(isChecked ? "isChecked" : "is unChecked");
            }
        });
    }
}