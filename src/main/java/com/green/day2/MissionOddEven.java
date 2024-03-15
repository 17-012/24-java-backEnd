package com.green.day2;

public class MissionOddEven {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i < 100; i++) {
            num = (int)(Math.random() * 10) + 1;
            if(num % 2 == 0){
                System.out.println(num + "는(은) 짝수 입니다.");
            }
            else {
                System.out.println(num + "는(은) 홀수 입니다.");
            }
        }
    }
}