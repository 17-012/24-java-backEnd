package com.green.day10;

import java.util.Arrays;

public class MissionArray3 {
    public static void main(String[] args) {
        int[] numArr = {10, 20, 30};
        int temp = numArr[0];
        System.out.println(Arrays.toString(numArr));
        numArr[0] = numArr[2];
        numArr[2] = temp;
        System.out.println(Arrays.toString(numArr));
    }
}