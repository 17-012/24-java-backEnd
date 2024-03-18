package com.green.day3;

public class MissionForLoopGugudan {
    public static void main(String[] args) {
        int gugudan = (int)(Math.random()*8) + 2;
        System.out.println(gugudan + "단의 내용입니다.");
        for (int i = 1; i < 10; i++) {
            int mul = gugudan * i;
            System.out.println(gugudan + " * " + i + " = " + mul);
        }
    }
}