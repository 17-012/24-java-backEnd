package com.green.day5;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력해 주세요 (남 , 여) ==> ");
        String gender = scanner.nextLine();
        String result = "당신은 ";
        switch (gender){
            case "남", "남자" :
                result += "남성입니다.";
                break;
            case "여", "여자" :
                result += "여성입니다.";
                break;
            default:
                result += "성별을 잘못 입력하셨습니다.";
                break;
        };
        System.out.println(result);
    }
}