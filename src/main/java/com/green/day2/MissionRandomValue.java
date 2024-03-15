package com.green.day2;

public class MissionRandomValue {
    public static void main(String[] args) {
        int result;

        for (int i = 0; i < 100; i++) {
            result = (int)(Math.random() * 9) + 1;
            System.out.println(result);
        }

        for (int i = 0; i < 100; i++) {
            result = (int)(Math.random() * 8) + 5;
            System.out.println(result);
        }



    }
}