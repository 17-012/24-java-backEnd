package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, input = -1;
        while (input != 0) {
            System.out.print("합계를 구할 숫자를 입력 (종료 : 0) =>");
            input = scanner.nextInt();
            sum += input;
        }
        System.out.println(sum);
    }
}
