package com.example.url;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
Button button;
EditText url;
    Uri webpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText url=findViewById(R.id.url);
        Button button=findViewById(R.id.button);

     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             //  -->   To open Url   -->

             String urlText=url.getText().toString();
             Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
              webpage = Uri.parse(urlText);
             Intent intent=new Intent(Intent.ACTION_VIEW,webpage);
             if(intent.resolveActivity(MainActivity.this.getPackageManager())!=null) {
             startActivity(intent);



             //    -->   To print and send email   -->

//             String[] addresses={"meenupandey1100@gmail.com"};
//             String ulrText=url.getText().toString();

//             Intent intent = new Intent(Intent.ACTION_SEND);
//             intent.setType("*/*");
//             intent.putExtra(Intent.EXTRA_EMAIL, addresses);
//             intent.putExtra(Intent.EXTRA_SUBJECT, "Aayush's Mail");

//             intent.putExtra(Intent.EXTRA_TEXT,ulrText);
//             if (intent.resolveActivity(getPackageManager()) != null) {
//                 startActivity(intent);
            }


         }
     });

    }
}