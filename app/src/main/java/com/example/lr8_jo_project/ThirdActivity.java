package com.example.lr8_jo_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioGroup;

public class ThirdActivity extends AppCompatActivity {
    RadioGroup rbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        rbtn = findViewById(R.id.rbtn);
        rbtn.clearCheck();
    }

    public void onClick(View v){
        Intent intent = new Intent();
        intent.putExtra("Complexity", rbtn.getCheckedRadioButtonId());
        setResult(RESULT_OK, intent);
        finish();
    }

}
