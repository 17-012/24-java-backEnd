package com.green.day16.ch7;

import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {
        Date date = new Date();

        Time time = new Time(date.getHours(),
                date.getMinutes(), date.getSeconds());

        System.out.println(time);



    }
}

class Time {

    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        String result = hour + "시 " + minute
                + "분 " + second + "초\n";
        return result;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}