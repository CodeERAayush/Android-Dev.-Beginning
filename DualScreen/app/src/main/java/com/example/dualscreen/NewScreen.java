package com.example.dualscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NewScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_screen);
    }
    public void submitOr(View view) {
        Toast.makeText(this, "Done!", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}