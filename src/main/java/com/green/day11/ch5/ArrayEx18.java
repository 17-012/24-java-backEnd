package com.green.day11.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 90, 80},
                {20, 25, 35},
                {30, 30, 30},
                {40, 40, 40},
        };

        int[] sum = new int[score[0].length];
        double[] avg = new double[sum.length];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                sum[j] += score[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            avg[i] = sum[i] / (double) score.length;
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.printf("sum : %d\tavg : %.2f\n", sum[i],avg[i]);
        }
    }
}