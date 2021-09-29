package com.example.dualscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent intent=new Intent(this,NewScreen.class);
//
//        startActivity(intent);
    }
    public void submitOrder(View v){
        Toast.makeText(this,
                "done!",
                Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,NewScreen.class);

        startActivity(intent);
    }
}