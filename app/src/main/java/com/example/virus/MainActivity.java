package com.example.virus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    // 페이지 이동 - PC
    public void openPcActivity(View view) {
        Intent intent = new Intent(MainActivity.this, PcActivity.class);
        startActivity(intent);
    }

    // 페이지 이동 - Mobile
    public void openMobileActivity(View view) {
        Intent intent = new Intent(MainActivity.this, MobileActivity.class);
        startActivity(intent);
    }

    // 페이지 이동 - Community
    public void openCommunityActivity(View view) {
        Intent intent = new Intent(MainActivity.this, CommunityActivity.class);
        startActivity(intent);
    }
}