package com.green.day4;

public class MissionGrade {
    public static void main(String[] args) {
        int score = (int)(Math.random()*101.0);

        System.out.println(score);
        if(score >= 90){
            System.out.println("A");
        }
        else if(score >= 80){
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        }
        else {
            System.out.println("F");
        }

    }
}
