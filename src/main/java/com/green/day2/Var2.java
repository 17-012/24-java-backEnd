package com.green.day2;

public class Var2 {
    int globalNum;
    public static void main(String[] args) {
        int num = 10;
        int num2 = 11;
        int num3 = num + num2;
        System.out.println(num3);
        num3 += 3;
        System.out.println(num3);
        ++num3;
        System.out.println(num3);
        ++num3;
        System.out.println(num3);
        int num4 = num3 + num;
        System.out.println(num4);
        ++num3;
        System.out.println(num3);
        ++num3;
        System.out.println(num3);
    }
}