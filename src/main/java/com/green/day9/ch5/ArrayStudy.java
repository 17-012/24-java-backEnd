package com.green.day9.ch5;

public class ArrayStudy {
    public static void main(String[] args) {
        int[] numArr = new int[5];

        System.out.println(numArr[0]);
        numArr[0] = 11;
        System.out.println(numArr[0]);

        int[] numArr2 = {10,20,30,40,50};
        System.out.println(numArr2[1]);
        numArr2[1] = 25;
        System.out.println(numArr2[1]);

    }
}