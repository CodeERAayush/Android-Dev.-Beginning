package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class act2 extends AppCompatActivity {
public TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        res=findViewById(R.id.res);
        Intent intent=getIntent();
        String got=intent.getStringExtra(MainActivity.EXTRA_NAME);

        res.setText("hey "+got);
//        setContentView(R.layout.activity_act2);

    }

    private void OpenAA() {
        Intent intent=new Intent(this , MainActivity.class);
        startActivity(intent);
    }
}