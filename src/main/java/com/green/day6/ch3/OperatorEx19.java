package com.green.day6.ch3;

public class OperatorEx19 {
    public static void main(String[] args) {
        int x = 10, y = 8;
        System.out.printf("x / y = %d (몫)\n", x / y);
        System.out.printf("x %% y = %d (나머지)\n", x % y);

        x = 7;
        System.out.printf("x / y = %d (몫)\n", x / y);
        System.out.printf("x %% y = %d (나머지)\n", x % y);

        System.out.println(10 % 8);
        System.out.println(-10 % 8);
        System.out.println(10 % -8);
        System.out.println(-10 % -8);
    }
}