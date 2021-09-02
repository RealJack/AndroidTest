package com.example.part2_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Test3_ViewGroup extends AppCompatActivity implements View.OnClickListener {

    Button group1Btn;
    Button group2Btn;
    Button groupReset;
    View group1View;
    View group2View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3_view_group);

        group1Btn = findViewById(R.id.btn_view_group1);
        group2Btn = findViewById(R.id.btn_view_group2);
        groupReset = findViewById(R.id.btn_view_reset);

        group1View = findViewById(R.id.view_group1);
        group2View = findViewById(R.id.view_group2);

        group1Btn.setOnClickListener(this);
        group2Btn.setOnClickListener(this);
        groupReset.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v == group1Btn) {
            group1View.setVisibility(group1View.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        } else if(v == group2Btn) {
            group2View.setVisibility(group2View.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
        } else if(v == groupReset) {
            group1View.setVisibility(View.VISIBLE);
            group2View.setVisibility(View.VISIBLE);
        }
    }
}