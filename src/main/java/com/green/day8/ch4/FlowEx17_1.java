package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx17_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int input = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < input; i++) {
            for (int j = 1; j < input - i; j++) {
                System.out.print("_");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
