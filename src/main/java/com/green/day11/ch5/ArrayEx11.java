package com.green.day11.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int len = 10;
        int[] numArr = new int[len];
        int[] counterArr = new int[len];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10.0);
        }

        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < counterArr.length; i++) {
            int count = 0;
            for (int j = 0; j < numArr.length; j++) {
                if (i == numArr[j]) {
                    count++;
                }
            }
            counterArr[i] = count;
        }

        System.out.println(Arrays.toString(counterArr));
    }
}