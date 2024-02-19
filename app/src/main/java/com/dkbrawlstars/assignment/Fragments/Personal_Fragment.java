package com.dkbrawlstars.assignment.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dkbrawlstars.assignment.Adapters.ModelAdapter;
import com.dkbrawlstars.assignment.Models_for_profile.Model;
import com.dkbrawlstars.assignment.R;

import java.util.ArrayList;


public class Personal_Fragment extends Fragment {
    RecyclerView recyclerView;

    TextView profile;
    Context context;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personal_, container, false);
        recyclerView = view.findViewById(R.id.recyle);
        context = getContext();

        ArrayList<Model> list = new ArrayList<>();
        list.add(new Model("PK","Praveen Kumar","Marrige","feeling good"));
        list.add(new Model("SS","Sahil Sharma","Coffee","Travelling.."));
        list.add(new Model("RD","Ritik Dutta","Friendship","open to new connecttion..."));
        list.add(new Model("AC","Aman Chauhan","Job","Enjoying..."));

        ModelAdapter adapter = new ModelAdapter(list,context);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}