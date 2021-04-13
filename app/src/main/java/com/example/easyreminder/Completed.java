package com.example.easyreminder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Completed extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<Task>completedtask;
    public Completed() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.completed_fragment,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.completed_recyclerview);
        RecyclerViewAdapterCompleted recyclerAdapter = new RecyclerViewAdapterCompleted(getContext(),completedtask);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        completedtask = new ArrayList<>();
        completedtask.add(new Task("PPB", "Membuat Mockup","31-April-2021","10.00 PM",R.drawable.easy));
        completedtask.add(new Task("PPL","Membuat Logbook","31-Mei-2021","6.00 PM",R.drawable.medium ));
        completedtask.add(new Task("APSI","Membuat Analisis","31-Mei-2021","10.00 PM",R.drawable.hard ));
        completedtask.add(new Task("APSI","Membuat Analisis","31-Mei-2021","10.00 PM",R.drawable.hard ));
    }
}
