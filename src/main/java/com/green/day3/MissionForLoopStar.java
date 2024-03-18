package com.green.day3;

public class MissionForLoopStar {
    public static void main(String[] args) {
        int star = (int)(Math.random()*8) + 3;
        System.out.println(star);
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = star; i > 0 ; i--) {
            System.out.print("*");
        }
    }
}