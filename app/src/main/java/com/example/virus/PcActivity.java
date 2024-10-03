package com.example.virus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.virus.adapters.ItemAdapter;
import com.example.virus.adapters.JsonAdapter;
import com.example.virus.models.Item;

import java.util.List;

public class PcActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter myAdapter;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pc);

        // 해더 설정
        HeaderView headerView = new HeaderView(findViewById(R.id.header_layout), "PC 보안사항");
        // 뒤로가기 버튼 클릭 리스너 설정
        headerView.setBackButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // 이전 액티비티로 돌아가기
            }
        });

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Item> itemList = JsonAdapter.parseJsonToItemList(this, "pcData.json");

        myAdapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(myAdapter);
    }
}