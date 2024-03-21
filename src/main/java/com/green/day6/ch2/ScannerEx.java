package com.green.day6.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력해 주세요. ==> ");
        String input = scanner.nextLine();
        int format = Integer.parseInt(input);
        System.out.println(format);
        System.out.println(format+1);
    }
}
