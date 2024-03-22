package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해 주세요 ==> ");
        String input = scanner.nextLine();
        char test = input.charAt(0);
        if (Integer.parseInt(input) < 0 || Integer.parseInt(input) > 100) {
            System.out.println("잘못된 값 입력");
        } else {
            System.out.println("점수는 : " + input);
            if (input.equals("100")) {
                test = '9';
            }
            String grade = switch (test) {
                case '9' -> "A";
                case '8' -> "B";
                case '7' -> "C";
                default -> "F";
            };
            System.out.println("당신의 학점은 " + grade + "입니다.");
        }
    }
}
