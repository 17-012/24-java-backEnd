package com.green.day10;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i + 10;
        }
        for (int i = 0; i < numArr.length; i++) {
            int rand = (int)(Math.random()*10.0);
            int temp = numArr[i];
            numArr[i] = numArr[rand];
            numArr[rand] = temp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}