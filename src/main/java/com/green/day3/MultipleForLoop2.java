package com.green.day3;

public class MultipleForLoop2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d - %d \n", i, j);
            }
            System.out.println();
        }
    }
}
