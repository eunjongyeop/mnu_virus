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
        // getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    // 페이지 이동 - 테스트
    public void openPcActivity(View view) {
        Intent intent = new Intent(MainActivity.this, PcActivity.class);
        startActivity(intent);
    }
}