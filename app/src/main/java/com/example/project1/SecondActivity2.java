package com.example.project1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class SecondActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second2);

        setTitle("탭호스트 예제");

        TabHost tabHost = findViewById(R.id.TabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpecFloor1 = tabHost.newTabSpec("Floor1").setIndicator("1층");
        tabSpecFloor1.setContent(R.id.floor1);
        tabHost.addTab(tabSpecFloor1);

        TabHost.TabSpec tabSpecFloor2 = tabHost.newTabSpec("Floor2").setIndicator("2층");
        tabSpecFloor2.setContent(R.id.floor2);
        tabHost.addTab(tabSpecFloor2);

        TabHost.TabSpec tabSpecFloor3 = tabHost.newTabSpec("Floor3").setIndicator("3층");
        tabSpecFloor3.setContent(R.id.floor3);
        tabHost.addTab(tabSpecFloor3);

        TabHost.TabSpec tabSpecFloor4 = tabHost.newTabSpec("Floor4").setIndicator("4층");
        tabSpecFloor4.setContent(R.id.floor4);
        tabHost.addTab(tabSpecFloor4);

        TabHost.TabSpec tabSpecFloor5 = tabHost.newTabSpec("Floor5").setIndicator("5층");
        tabSpecFloor5.setContent(R.id.floor5);
        tabHost.addTab(tabSpecFloor5);

        TabHost.TabSpec tabSpecFloor6 = tabHost.newTabSpec("Floor6").setIndicator("6층");
        tabSpecFloor6.setContent(R.id.floor6);
        tabHost.addTab(tabSpecFloor6);

        tabHost.setCurrentTab(0);
    }
}
