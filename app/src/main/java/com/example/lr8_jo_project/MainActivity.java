package com.example.lr8_jo_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnClick(View view){
        Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
        startActivityForResult(intent, 1);
    }
    @Override
    protected void onActivityResult(int reqCode, int resultCode, Intent data){
        String text = "Nothing chose";
        TextView tv = findViewById(R.id.forPrefer);
        switch (reqCode){
            case 1:
                switch(data.getExtras().getInt("Complexity")%3){
                    case 1: text = "Easy level"; break;
                    case 2: text = "Middle level"; break;
                    case 0: text = "Hard level"; break;
                }
        }
        tv.setText(text);
    }


}
