package com.green.day9.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int j = i / 10;
            int k = i % 10;
            System.out.printf("i = %d ", i);

            if (k == 3 || k == 6 || k == 9) {
                System.out.print("짝");
            }
            if (j == 3 || j == 6 || j == 9) {
                System.out.print("짝");
            }
            System.out.println();
        }




    }
}
