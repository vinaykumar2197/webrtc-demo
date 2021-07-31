package com.developerspace.webrtcsample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.developerspace.webrtcsample.test.CustomTextView;

public class TestDemoActivity extends AppCompatActivity {

    EditText editText;
    Button btChangeText;
    CustomTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_demo2);

        editText = (EditText) findViewById(R.id.et_text);
        btChangeText = (Button) findViewById(R.id.bt_change_text);
        textView = (CustomTextView) findViewById(R.id.text_view);

        btChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString());
            }
        });

    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

    }



}