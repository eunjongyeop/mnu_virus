package com.example.virus;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HeaderView {
    private View headerView;
    private TextView headerTitle;
    private ImageButton backButton;

    public HeaderView(View headerView) {
        this.headerView = headerView;

        // 헤더의 뷰를 초기화합니다.
        headerTitle = headerView.findViewById(R.id.header_title);
        backButton = headerView.findViewById(R.id.back_button);
    }

    public HeaderView(View headerView, String headerTitleStr) {
        this(headerView);
        this.setHeaderTitle(headerTitleStr);
    }

    public void setHeaderTitle(String title) {
        headerTitle.setText(title);
    }

    public void setBackButtonClickListener(View.OnClickListener listener) {
        backButton.setOnClickListener(listener);
    }
}