package com.green.day11.ch5;


import java.util.Arrays;

public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] score = new int[3][5];
        score[0][0] = 5;
        score[1][1] = 10;
        score[1][3] = 50;

        for (int i = 0; i < score.length; i++) {
            System.out.println(Arrays.toString(score[i]));
        }

        System.out.println("-----------------------");
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%d\t", score[i][j]);
            }
            System.out.println();
        }

        System.out.println("-----------------------");
        for (int[] ints : score) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }

    }
}