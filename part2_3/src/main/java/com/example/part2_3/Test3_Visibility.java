package com.example.part2_3;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Test3_Visibility extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3_visibility);
    }

    public void onClickButton1(View v) {
        View result = findViewById(R.id.btn_visible_text1);

        if(result.getVisibility() == View.GONE) {
            result.setVisibility(View.VISIBLE);
        } else {
            result.setVisibility(View.GONE);
        }
    }

    public void onClickButton2(View v) {
        View result = findViewById(R.id.btn_visible_text2);

        if(result.getVisibility() == View.INVISIBLE) {
            result.setVisibility(View.VISIBLE);
        } else {
            result.setVisibility(View.INVISIBLE);
        }
    }

    public void onClickButton3(View v) {
        View result1 = findViewById(R.id.btn_visible_text1);
        View result2 = findViewById(R.id.btn_visible_text2);

        result1.setVisibility(View.GONE);
        result2.setVisibility(View.INVISIBLE);
    }
}