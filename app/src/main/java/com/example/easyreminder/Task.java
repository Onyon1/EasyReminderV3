package com.example.easyreminder;

public class Task {
    private String Task_name;
    private String Desc;
    private String Date;
    private String Time;
    private int Diff_img;

    public Task() {
    }

    public Task(String task_name, String desc, String date, String time, int diff_img) {
        Task_name = task_name;
        Desc = desc;
        Date = date;
        Time = time;
        Diff_img = diff_img;
    }
    //Getter
    public String getTask_name() {
        return Task_name;
    }

    public String getDesc() {
        return Desc;
    }

    public String getDate() {
        return Date;
    }

    public String getTime() {
        return Time;
    }

    public int getDiff_img() {
        return Diff_img;
    }


    //Setter
    public void setTask_name(String task_name) {
        Task_name = task_name;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setDiff_img(int diff_img) {
        Diff_img = diff_img;
    }
}
