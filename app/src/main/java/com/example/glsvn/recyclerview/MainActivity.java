package com.example.glsvn.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CustomClass> item = new ArrayList<>();
        for (int i=0;i<15;i++)
            item.add(new CustomClass(i+"",R.mipmap.ic_launcher));

        CustomAdapter adapter = new CustomAdapter(item,getApplicationContext());
        recyclerView=findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        recyclerView.setAdapter(adapter);
    }
}