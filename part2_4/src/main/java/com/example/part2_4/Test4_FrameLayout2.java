package com.example.part2_4;

import android.os.Bundle;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class Test4_FrameLayout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test4_frame_layout2);

        TabHost host = findViewById(R.id.host);
        host.setup();

        //각 TabSpec을 만들 때 매개변수의 문자열은 각 TabSpec의 식별자 문자열
        TabHost.TabSpec spec1 = host.newTabSpec("tab1");
        TabHost.TabSpec spec2 = host.newTabSpec("tab2");
        TabHost.TabSpec spec3 = host.newTabSpec("tab3");
        //tab button 구성
        spec1.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.sample_background, null));
        spec2.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.sample_background, null));
        spec3.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.sample_background, null));
        //tab 본문 구성
        spec1.setContent(R.id.tab_content1);
        spec2.setContent(R.id.tab_content2);
        spec3.setContent(R.id.tab_content3);
        host.addTab(spec1);
        host.addTab(spec2);
        host.addTab(spec3);

    }
}