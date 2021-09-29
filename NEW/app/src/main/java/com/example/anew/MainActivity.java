package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    EditText ent;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ent=findViewById(R.id.ent);
        Button b=findViewById(R.id.b);
        b.setLabelFor(R.id.ent);
    }
}