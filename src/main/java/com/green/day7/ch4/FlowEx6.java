package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("월 ( Month ) 를 입력해 주세요 ==> ");
        int input = scanner.nextInt();
        System.out.println("입력한 숫자는 : " + input);
        String data = "현재의 계절은 ";
        String result = switch (input){
            case 3,4,5 -> "봄";
            case 6,7,8 -> "여름";
            case 9,10,11 -> "가을";
            case 12,1,2 -> "겨울";
            default -> data = "잘못된 값을 입력 하셨습니다.";
        };
        if(result.equals(data)){}
        else {
            data += result;
        }

        System.out.println(data);
    }
}
