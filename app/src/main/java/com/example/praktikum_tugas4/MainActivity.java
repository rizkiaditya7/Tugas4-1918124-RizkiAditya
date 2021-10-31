package com.example.praktikum_tugas4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TniAdapter adapter;
    private ArrayList<tni> tniArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recycleview);

        adapter = new TniAdapter(tniArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }
    private void addData() {
        tniArrayList = new ArrayList<>();
        tniArrayList.add(new tni(R.drawable.hadi,"Hadi Tjahyanto ", "Malang", "Panglima TNI"));
        tniArrayList.add(new tni(R.drawable.andika,"Andika Perkasa ", "Bandung", "KASAD"));
        tniArrayList.add(new tni(R.drawable.yudo,"Yudo Margono ", "Madiun", "KSAL"));
        tniArrayList.add(new tni(R.drawable.yuyu,"Yuyu Sutisna ", "Bandung", "KSAU"));

    }
}