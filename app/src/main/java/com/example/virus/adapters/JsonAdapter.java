package com.example.virus.adapters;
import android.content.Context;

import com.example.virus.models.Item;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class JsonAdapter {

    // JSON 파일을 String으로 변환
    private static String getJsonFromAssets(Context context, String fileName) {
        String jsonString;
        try {
            // assets 폴더에서 파일 읽기
            InputStream is = context.getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            jsonString = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return jsonString;
    }

    // JSON 배열을 파싱하고 Item 객체 리스트로 반환
    public static List<Item> parseJsonToItemList(Context context, String fileName) {
        List<Item> itemList = new ArrayList<Item>();
        String jsonString = getJsonFromAssets(context, fileName);

        try {
            if (jsonString != null) {
                // JSONArray로 파싱
                JSONArray jsonArray = new JSONArray(jsonString);

                // 배열 내 각 객체를 Person 객체로 변환
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);

                    String imageName = jsonObject.getString("imageName");
                    String title = jsonObject.getString("title");
                    String content = jsonObject.getString("content");

                    // Item 객체 생성 및 리스트에 추가
                    Item item = new Item(imageName, title, content);
                    itemList.add(item);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return itemList;
    }
}
