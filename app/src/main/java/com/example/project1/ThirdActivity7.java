package com.example.project1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class ThirdActivity7 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third7);

        Switch switch1 = (Switch) findViewById(R.id.switch1);
        ImageView orig1 = (ImageView)findViewById(R.id.orig1);
        ImageView orig2 = (ImageView) findViewById(R.id.orig2);
        ImageView orig3 = (ImageView) findViewById(R.id.orig3);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch1.isChecked() ==true) {
                    orig1.setVisibility(android.view.View.VISIBLE);
                    orig2.setVisibility(android.view.View.VISIBLE);
                    orig3.setVisibility(android.view.View.VISIBLE);
                } else {
                    orig1.setVisibility(View.GONE);
                    orig2.setVisibility(View.GONE);
                    orig3.setVisibility(android.view.View.GONE);
                }
            }
        });
    }
}
