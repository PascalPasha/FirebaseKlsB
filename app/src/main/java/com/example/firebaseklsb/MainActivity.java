package com.example.firebaseklsb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Tvlihatdata, Tvtambahdata;
    Button Btlihatdata, Bttambahdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tvlihatdata = findViewById(R.id.Txlhtdata);
        Tvtambahdata = findViewById(R.id.Txtmbhdata);
        Btlihatdata = findViewById(R.id.BtnLhtData);
        Bttambahdata = findViewById(R.id.BtnTmbhData);

        Bttambahdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Tambahdata.class);
                startActivity(i);

            }
        });
        Btlihatdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LihatTeman.class);
                startActivity(intent);
                finish();
            }
        });

    }

}