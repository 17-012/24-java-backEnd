package com.green.day4;

public class ContinueBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("break");
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("continue");
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
