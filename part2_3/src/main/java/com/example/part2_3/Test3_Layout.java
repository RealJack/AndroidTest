package com.example.part2_3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Test3_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3_layout);

        //텍스트 변경 :: 아래 구문 제거 또는 주석처리 시 기본으로 설정한 텍스트가 출력됨
        TextView topTextView = findViewById(R.id.topText);
        TextView bottomTextView = findViewById(R.id.bottomText);

        topTextView.setText("위");
        bottomTextView.setText("아래");
    }
}