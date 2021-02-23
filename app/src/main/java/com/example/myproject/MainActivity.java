package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    List<Data> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        recyclerView = findViewById(R.id.r1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(list,this);
        recyclerView.setAdapter(adapter);
        prepareList();
    }
    private void prepareList(){
        Data data = new Data("First Exam",
                "May 23, 2015",
                "Best Of Luck");
        list.add(data);
        Data data1 = new Data("Second Exam",
                "May 24, 2015",
                "Best Of Luck");
        list.add(data1);
        Data data2 = new Data("Third Exam",
                "May 25, 2015",
                "Best Of Luck");
        list.add(data2);
    }
}