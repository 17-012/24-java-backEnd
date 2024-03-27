package com.green.day10;

import java.util.Arrays;

public class ArrayStudy3 {
    public static void main(String[] args) {
        //얕은복사 Shallow copy

        int[] nArr1 = {10, 20, 30};
        int[] nArr2 = nArr1;
        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));
        nArr2[1] = 50;
        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));

    }
}