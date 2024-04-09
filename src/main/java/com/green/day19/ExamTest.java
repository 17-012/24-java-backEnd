package com.green.day19;

import java.util.Arrays;

public class ExamTest {
    public static void main(String[] args) {
        String str = "1 2 3";
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));

        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        System.out.println(Arrays.toString(intArr));
    }
}
