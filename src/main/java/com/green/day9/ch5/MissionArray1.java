package com.green.day9.ch5;

import java.util.Arrays;

public class MissionArray1 {
    public static void main(String[] args) {
        int[] numArr = {10, 20, 30, 40, 50, 60};
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
            if (i != numArr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}