package com.aayushpandey.hindikahani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button hindi,english;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        hindi=findViewById(R.id.hindi);
        english=findViewById(R.id.english);
        final String[] hindiUrl = new String[1];
        Intent intent=new Intent(this,Stories.class);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
hindiUrl[0] ="http://www.english-for-students.com/Moral-Stories.html";
intent.putExtra("Url", hindiUrl[0]);
startActivity(intent);
            }
        });
hindi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        hindiUrl[0] ="https://hindikahani.hindi-kavita.com/";
        intent.putExtra("Url", hindiUrl[0]);
        startActivity(intent);
    }
});
    }
}