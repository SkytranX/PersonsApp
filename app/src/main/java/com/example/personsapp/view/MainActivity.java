package com.example.personsapp.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.personsapp.R;
import com.example.personsapp.adapter.PeopleAdapter;
import com.example.personsapp.utils.Utils;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PeopleAdapter recyclerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.person_RecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        recyclerAdapter= new PeopleAdapter(Utils.getList());
        recyclerView.setAdapter(recyclerAdapter);



    }
}
