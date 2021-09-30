package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView result;
EditText num1,num2;
Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a, b;
                String st = num1.getText().toString();
                String st2 = num2.getText().toString();
                if (st.equals("") || st2.equals("")) {
                    result.setText("Enter numbers in both spaces to get the sum!");
                } else {
                    a = Double.parseDouble(st);
                    b = Double.parseDouble(st2);
                    Double res = a + b;
                    result.setText(res + " ");
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a, b;
                String st = num1.getText().toString();
                String st2 = num2.getText().toString();
                if (st.equals("") || st2.equals("")) {
                    result.setText("Enter numbers in both spaces to get the difference!");
                } else {
                    a = Double.parseDouble(st);
                    b = Double.parseDouble(st2);
                    Double res = a - b;
                    result.setText(res + " ");
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a, b;
                String st = num1.getText().toString();
                String st2 = num2.getText().toString();
                if (st.equals("") || st2.equals("")) {
                    result.setText("Enter numbers in both spaces to get the product!");
                } else {
                    a = Double.parseDouble(st);
                    b = Double.parseDouble(st2);
                    Double res = a * b;
                    result.setText(res + " ");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a, b;
                String st = num1.getText().toString();
                String st2 = num2.getText().toString();
                if (st.equals("") || st2.equals("")) {
                    result.setText("Enter numbers in both spaces to get the factor!");
                } else {
                    a = Double.parseDouble(st);
                    b = Double.parseDouble(st2);
                    Double res = a / b;
                    result.setText(res + " ");
                }
            }
        });
//inte=findViewById(R.id.intent);
//inte.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//       openA();
//    }
//});
////public void openActivity2(){
////
////        }
////    }
//
//
//    }
//
//    public void openA() {
//        Intent intent=new Intent(this,Uncov.class);
//        startActivity(intent);
//    }
    }}