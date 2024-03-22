package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해 주세요 ==> ");
        int input = scanner.nextInt();
        System.out.println("점수는 : " + input);
        String grade = switch (input / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            default -> "D";
        };
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
