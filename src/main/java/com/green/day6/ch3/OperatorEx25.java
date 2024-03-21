package com.green.day6.ch3;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';
        System.out.println("문자를 하나 입력하세요 ==> ");
        String input = scanner.nextLine();

        ch = input.charAt(0);
        if ('0' <= ch && ch <= '9') {
            System.out.println("입력하신 문자는 숫자 입니다.");
        } else if ('a' <= ch && ch <= 'z') {
            System.out.println("입력하신 문자는 소문자 입니다.");
        } else if ('A' <= ch && ch <= 'Z') {
            System.out.println("입력하신 문자는 대문자 입니다.");
        }
//        System.out.println(ch);

    }
}