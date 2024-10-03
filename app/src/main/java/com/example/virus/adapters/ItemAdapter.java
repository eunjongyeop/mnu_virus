package com.example.virus.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.example.virus.R;
import com.example.virus.models.Item;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private List<Item> itemList;

    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ItemAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // ViewHodler 객체를 생성 후 리턴한다.
        return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ItemViewHolder holder, int position) {
        // ViewHolder 가 재활용 될 때 사용되는 메소드
        Item data = itemList.get(position);

        // 이미지명으로 Drawable ResId 가져오기
        int imageResId = holder.itemView.getContext().getResources().getIdentifier(
                data.getImageName(), "drawable", holder.itemView.getContext().getPackageName());

        holder.imageView.setImageResource(imageResId);
        holder.title.setText(data.getTitle());
        holder.content.setText(data.getContent());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    // 아이템 뷰를 저장하는 클래스

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView title;
        public TextView content;

        public ItemViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.itemImageView);
            title = itemView.findViewById(R.id.itemTitle);
            content = itemView.findViewById(R.id.itemContent);
        }
    }
}