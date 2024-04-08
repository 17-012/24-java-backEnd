package com.green.day18;

import java.util.Arrays;

public class ExamTest2 {
    public static void main(String[] args) {
//        Exam2.printGugudan(2, 4);

//        int sum = Exam2.getSumFromString("23223");
//        System.out.println(sum);

        int[] arr = new int[3];

        System.out.println(Arrays.toString(arr));
        Exam2.inputRandomValue(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Exam2 {

    public static void inputRandomValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int val = (int) (Math.random() * 9) + 1;
            arr[i] = val;

            for (int j = 0; j < i; j++) {
                if (arr[j] == val) {
                    i--;
                    break;
                }
            }
        }
    }

    static int getSumFromString(String input) {
        int result = 0;
        int k = Integer.parseInt(input);
        for (int i = 0; i < input.length(); i++, k /= 10) {
            result += k % 10;
        }
        return result;
    }

    static void printGugudan(int n1, int n2) {
        for (int i = 1; i <= 9; i++) {
            for (int j = n1; j <= n2; j++) {
                System.out.printf("%d * %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }
    }

}