package com.green.day13.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {

    public static void printIntArr(int[] input){

        if(input.length == 0){
            System.out.println("[]");
            return;
        }
        System.out.printf("[%d", input[0]);
        for (int i = 1; i < input.length; i++) {
            System.out.printf(", %d",input[i]);
        }
        System.out.println("]");

    }


    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};
//        System.out.println(Arrays.toString(arr));

        printIntArr(arr);

        int[] arr2 = {};
        printIntArr(arr2);

    }
}
