package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {

    Button usd, khr, eur, kh;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kh = (Button) findViewById(R.id.kh);
        kh.setOnClickListener(v -> openActivity2());

        usd = (Button) findViewById(R.id.usd);
        usd.setOnClickListener(v -> openActivity3());

        khr = (Button) findViewById(R.id.khr);
        khr.setOnClickListener(v -> openActivity4());
/*anonymous function
/*      khr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });*/

        eur = (Button) findViewById(R.id.eur);
        eur.setOnClickListener(v -> openActivity5());
    }
    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}