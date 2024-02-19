package com.dkbrawlstars.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.dkbrawlstars.assignment.Adapters.FragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class My_main_file extends AppCompatActivity{

    TabLayout tabLayout;
    ImageView checklist;
    ViewPager viewPager;

    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_my_main_file);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));

        tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
        toolbar = findViewById(R.id.tbTool);
        checklist = toolbar.findViewById(R.id.checklist);

        checklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(My_main_file.this,MainActivity.class);
                startActivity(intent);
            }
        });








    }
}