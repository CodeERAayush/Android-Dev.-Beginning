package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.security.auth.Subject;

public class MainActivity extends AppCompatActivity {
EditText Subject,body,address;
//Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Subject=findViewById(R.id.Subject);
        body=findViewById(R.id.Body);
        address=findViewById(R.id.to);


    }
    public void submitOrder(View v) {
//        Subject=findViewById(R.id.Subject);
//        body=findViewById(R.id.Body);
//        to=findViewById(R.id.to);
        String subject = Subject.getText().toString();
       String addresses = address.getText().toString();
        String message = body.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SENDTO);
//        intent.setType("*/*");
        intent.setData(Uri.parse("mailto:"));
//        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);

        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


}
