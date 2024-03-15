package com.green.day2;

public class ConditionalOperator {
    public static void main(String[] args) {
        String s = "";
        int num = 0;

        for (int i = 0; i < 100; i++) {
            num = (int)(Math.random() * 10) + 1;
            s = num % 2 == 0
                    ? "짝"
                    : "홀";
            System.out.println(num + "는(은) " + s + "수 입니다.");
        }
    }
}