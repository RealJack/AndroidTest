package com.example.part2_3;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Test3_TextView extends AppCompatActivity implements View.OnClickListener {
    Button btnTest1;
    Button btnTest2;
    Button btnTest3;
    Button btnTest4;
    Button btnTest5;
    Button btnTest6;
    Button btnTest7;
    View textTest1;
    View textTest2;
    View textTest3;
    View textTest4;
    View textTest5;
    View textTest6;
    View textTest7;
    TextView textView;
    Typeface typeFace;
    View allView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3_text_view);

        btnTest1 = findViewById(R.id.btn_textView1);
        btnTest2 = findViewById(R.id.btn_textView2);
        btnTest3 = findViewById(R.id.btn_textView3);
        btnTest4 = findViewById(R.id.btn_textView4);
        btnTest5 = findViewById(R.id.btn_textView5);
        btnTest6 = findViewById(R.id.btn_textView6);
        btnTest7 = findViewById(R.id.btn_textView7);

        textTest1 = findViewById(R.id.text_textView1);
        textTest2 = findViewById(R.id.text_textView2);
        textTest3 = findViewById(R.id.text_textView3);
        textTest4 = findViewById(R.id.text_textView4);
        textTest5 = findViewById(R.id.text_textView5);
        textTest6 = findViewById(R.id.text_textView6);
        textTest7 = findViewById(R.id.text_textView7);

        textView = (TextView) findViewById(R.id.text_textView3_fontFace);
        typeFace = Typeface.createFromAsset(getAssets(), "KoPub Batang Bold.ttf");
        textView.setTypeface(typeFace);

        btnTest1.setOnClickListener(this);
        btnTest2.setOnClickListener(this);
        btnTest3.setOnClickListener(this);
        btnTest4.setOnClickListener(this);
        btnTest5.setOnClickListener(this);
        btnTest6.setOnClickListener(this);
        btnTest7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btnTest1) {
            textTest1.setVisibility(textTest1.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        } else if(v == btnTest2) {
            textTest2.setVisibility(textTest2.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        } else if(v == btnTest3) {
            textTest3.setVisibility(textTest3.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        } else if(v == btnTest4) {
            textTest4.setVisibility(textTest4.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        } else if(v == btnTest5) {
            textTest5.setVisibility(textTest5.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        } else if(v == btnTest6) {
            textTest6.setVisibility(textTest6.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        } else if(v == btnTest7) {
            textTest7.setVisibility(textTest7.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        }

    }
}