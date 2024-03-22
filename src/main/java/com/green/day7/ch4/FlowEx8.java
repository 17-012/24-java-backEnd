package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주민등록 번호를 입력해 주세요 " +
                "\n(012345-1234567) ==> ");
        String input = scanner.nextLine();
        System.out.println("입력한 주민등록 번호는 : " + input);

        String result = switch (input.charAt(7)) {
            case '1', '3' -> "당신은 남자 입니다.";
            case '2', '4' -> "당신은 여자 입니다.";
            default -> "유효하지 않은 주민등록 번호입니다.";
        };
        System.out.println(result);

    }
}
