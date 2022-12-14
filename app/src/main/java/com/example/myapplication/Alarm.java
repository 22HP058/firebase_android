package com.example.myapplication;

public class Alarm {
    private long date;
    private long time;

    private Alarm() {

    }

    public Alarm(long date, long time){
        this.date = date;
        this.time = time;
    }

    public long getDate() {
        return date;
    }

    public long getTime() {
        return time;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
