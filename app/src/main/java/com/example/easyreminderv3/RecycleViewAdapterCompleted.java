package com.example.easyreminderv3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class RecyclerViewAdapterCompleted extends RecyclerView.Adapter<RecyclerViewAdapterCompleted.MyViewHolder> {

    Context mContext;
    List<Task> mData;

    public RecyclerViewAdapterCompleted(Context mContext, List<Task> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v ;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_completed,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_taskname.setText(mData.get(position).getTask_name());
        holder.tv_desc.setText(mData.get(position).getDesc());
        holder.tv_date.setText(mData.get(position).getDate());
        holder.tv_time.setText(mData.get(position).getTime());
        holder.diff.setImageResource(mData.get(position).getDiff_img());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_taskname;
        private TextView tv_desc;
        private TextView tv_date;
        private TextView tv_time;
        private ImageView diff;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_taskname = (TextView) itemView.findViewById(R.id.name_task);
            tv_desc = (TextView) itemView.findViewById(R.id.desc);
            tv_date = (TextView) itemView.findViewById(R.id.date);
            tv_time = (TextView) itemView.findViewById(R.id.timetask);
            diff = (ImageView) itemView.findViewById(R.id.img_diff);
        }
    }

}
