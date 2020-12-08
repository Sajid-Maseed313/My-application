package com.my2ndapllication.google;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button byDefaultToast,simpleToast,nestedGravityToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        byDefaultToast=findViewById(R.id.byDefaultToast);
        simpleToast=findViewById(R.id.simpleToast);
        nestedGravityToast=findViewById(R.id.nestedGravityToast);
        byDefaultToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "By Default Toast", Toast.LENGTH_LONG).show();
            }
        });
        simpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(MainActivity.this,"Simple Toast",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            }
        });
        nestedGravityToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(MainActivity.this,"Nested Gravity Toast",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT,0,0);
                toast.show();
            }
        });
    }
}