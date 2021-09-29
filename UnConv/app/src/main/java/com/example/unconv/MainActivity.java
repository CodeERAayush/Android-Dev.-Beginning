package com.example.unconv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button,button2,button3;
private EditText editText;
private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.Number);
        textview=findViewById(R.id.value);
button2=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "DONE!!", Toast.LENGTH_SHORT).show();
                String s= editText.getText().toString();
                if(s.equals("")){
                    textview.setText("SYNTAX ERROR!");
                }else{
                int a=Integer.parseInt(s);
                Double pound=2.205*a;

                textview.setText(pound+" pounds");}

            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "DONE!!", Toast.LENGTH_SHORT).show();
                String st=editText.getText().toString();
                if(st.equals("")){
                    textview.setText("SYNTAX ERROR!");
                }else{
                int b=Integer.parseInt(st);
                double gram=1000*b;
                textview.setText(gram+" gram");
            }}
        });
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Done!!", Toast.LENGTH_SHORT).show();
                String st=editText.getText().toString();
                if(st.equals("")){
                    textview.setText("SYNTAX ERROR!");
                }else{
                int b=Integer.parseInt(st);
                double qu=0.01*b;
                textview.setText(qu+" quintals");
            }}
        });
    }
}