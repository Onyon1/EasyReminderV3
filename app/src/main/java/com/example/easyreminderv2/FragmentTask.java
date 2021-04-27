package com.example.easyreminderv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class    FragmentTask extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<Task>firsttask;
    public FragmentTask() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.task_fragment,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.task_recyclerview);
        RecyclerViewAdapterTask recyclerAdapter = new RecyclerViewAdapterTask(getContext(),firsttask);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);

        ImageButton btnAdd = (ImageButton) v.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),AddTaskActivity.class));
            }
        });


        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firsttask = new ArrayList<>();
        firsttask.add(new Task("PPB", "Membuat Mockup","31-April-2021","10.00 PM",R.drawable.easy));
        firsttask.add(new Task("PPL","Membuat Logbook","31-Mei-2021","6.00 PM",R.drawable.medium ));
        firsttask.add(new Task("APSI","Membuat Analisis","31-Mei-2021","10.00 PM",R.drawable.hard ));
        firsttask.add(new Task("APSI","Membuat Analisis","31-Mei-2021","10.00 PM",R.drawable.hard ));
    }
}
