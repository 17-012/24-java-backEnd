package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해 주세요 ==> ");
        int input = scanner.nextInt();
        System.out.println("점수는 : " + input);
        String grade = "C", detail = "";

        if (input < 0 || input > 100) {
            System.out.println("점수를 잘못 입력하셨습니다.");
            return;
        }
        if (input == 100 || input % 10 >= 7) {
            detail = "+";
            if (input >= 90) {
                grade = "A";
            } else if (input >= 80) {
                grade = "B";
            } else {
                grade = "C";
                if (input < 70) {
                    detail = "";
                }
            }
        } else if (input % 10 >= 3) {
            detail = "0";
            if (input >= 90) {
                grade = "A";
            } else if (input >= 80) {
                grade = "B";
            } else {
                grade = "C";
                if (input < 70) {
                    detail = "";
                }
            }
        } else {
            detail = "-";
            if (input >= 90) {
                grade = "A";
            } else if (input >= 80) {
                grade = "B";
            } else {
                grade = "C";
                if (input < 70) {
                    detail = "";
                }
            }
        }

        System.out.printf("당신의 학점은 %s%s", grade, detail);

    }
}
