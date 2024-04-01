package com.green.day13.ch6;

import java.util.Arrays;

public class ReferenceParamEx2 {
    public static void change(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i]++;
        }
    }

    public static void main(String[] args) {
        int[] intArr = {10, 20};
        System.out.println("intArr = " + Arrays.toString(intArr));
        change(intArr);
        System.out.println("intArr = " + Arrays.toString(intArr));
    }
}
