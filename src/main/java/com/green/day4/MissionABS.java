package com.green.day4;

public class MissionABS {
    public static void main(String[] args) {
        int val = (int)(Math.random()*21) -10;
        System.out.println(val < 0 ? -val : val);
    }
}
