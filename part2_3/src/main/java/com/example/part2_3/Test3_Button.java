package com.example.part2_3;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Test3_Button extends AppCompatActivity {
    CheckBox checkBox;
    String saveText;

    RadioGroup radioGroup;
    RadioButton radioBtn1;
    RadioButton radioBtn2;
    TextView radioReturn;
    String saveText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3_button);

        checkBox = findViewById(R.id.checkbox);
        saveText = (String)checkBox.getText();
        checkBox.setText(saveText + "is unChecked");

        radioGroup = findViewById(R.id.radioGroup);
        radioBtn1 = findViewById(R.id.radio1);
        radioBtn2 = findViewById(R.id.radio2);
        radioReturn = (TextView)findViewById(R.id.radio_return);
        saveText2 = (String)radioReturn.getText();

        radioGroup.setOnCheckedChangeListener(radioGroupButtonChangeListener);
        radioBtn1.setOnClickListener(radioButtonClickListener);
        radioBtn2.setOnClickListener(radioButtonClickListener);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                checkBox.setText(isChecked ? saveText + "isChecked" : saveText + "is unChecked");
            }
        });
    }

    RadioButton.OnClickListener radioButtonClickListener = new RadioButton.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    RadioGroup.OnCheckedChangeListener radioGroupButtonChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup rg, int i) {
            RadioButton result = findViewById(rg.getCheckedRadioButtonId());

            radioReturn.setText(saveText2 + result.getText());
        }
    };
}