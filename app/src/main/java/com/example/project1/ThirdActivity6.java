package com.example.project1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ThirdActivity6 extends Activity {

    LinearLayout layout1, layout2;
    Button btnA, btnB, btnC1, btnC2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third6);

        btnA = (Button)findViewById(R.id.btnA);
        btnB = (Button)findViewById(R.id.btnB);
        btnC1 = (Button)findViewById(R.id.cancel1);
        btnC2 = (Button)findViewById(R.id.cancel2);
        layout1 = (LinearLayout)findViewById(R.id.linearLayout1);
        layout2 = (LinearLayout)findViewById(R.id.linearLayout2);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout1.setVisibility(View.VISIBLE);
            }
        });

        btnC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout1.setVisibility(View.GONE);
            }
        });


        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout2.setVisibility(View.VISIBLE);
            }
        });

        btnC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout2.setVisibility(View.GONE);
            }
        });
    }
}
