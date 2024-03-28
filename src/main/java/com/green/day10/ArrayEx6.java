package com.green.day10;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }
            if (max < score[i]) {
                max = score[i];
            }
        }
        System.out.printf("Min : %d, Max : %d", min, max);
    }
}