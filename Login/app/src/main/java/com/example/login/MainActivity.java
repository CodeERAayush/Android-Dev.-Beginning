package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView text;
Button but;
EditText edit,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView) findViewById(R.id.text);
        but=(Button) findViewById(R.id.check);
        edit=(EditText) findViewById(R.id.password);
        res=(EditText) findViewById(R.id.res);
    }
    public void checkPass(View v){
        String stlog= edit.getText().toString();
        if(stlog.equals("up53ca4224")){
            res.setText("correct password");
        }
        else if(stlog.equals("")){
            res.setText("enter pass");
        }
        else{
            res.setText("incorrect pass!");
        }
    }
}