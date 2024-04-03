package com.green.day14.ch6;

public class MyArrays {
    public static void printArr(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.printf("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");
    }

    static String toString(int[] arr) {
        String result = "[";

        if (arr.length != 0) {
            result += arr[0];
            for (int i = 1; i < arr.length; i++) {
                result += ", " + arr[i];
            }
        }

        result += "]";
        return result;
    }
}

class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4, 10};
        int[] test = {};
        MyArrays.printArr(arr);

        String str2 = MyArrays.toString(arr);
        System.out.println(str2);

    }
}