package com.green.day10;

import java.util.Arrays;

public class MissionArray2 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 21.0) + 10;
        }
        System.out.println(Arrays.toString(numArr));
    }
}