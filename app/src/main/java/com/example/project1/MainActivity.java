package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton Calander,Menu1,Todolist,Call,Notice;

        Calander = (ImageButton)findViewById(R.id.calaner);
        Menu1 = (ImageButton)findViewById(R.id.menu1);
        Todolist = (ImageButton)findViewById(R.id.timetable);
        Call = (ImageButton)findViewById(R.id.call);
        Notice =(ImageButton) findViewById(R.id.notice);

        Calander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(getApplicationContext(),mainSubActivity5.class);
                startActivity(Intent);
            }
        });

        Menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(getApplicationContext(),mainSubActivity1.class);
                startActivity(Intent);
            }
        });

        Todolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(getApplicationContext(),mainSubActivity6.class);
                startActivity(Intent);
            }
        });

        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(getApplicationContext(),mainSubActivity3.class);
                startActivity(Intent);
            }
        });


        Notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sungkyul.ac.kr/skukr/342/subview.do"));
                startActivity(intent);
            }
        });

        }
    }
