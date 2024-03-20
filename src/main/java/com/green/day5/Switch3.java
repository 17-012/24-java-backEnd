package com.green.day5;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력해 주세요 (남 , 여) ==> ");
        String gender = scanner.nextLine();
        String result=switch (gender){
            case "남", "남자" -> "남성입니다.";
            case "여", "여자" -> "여성입니다.";
            default ->"성별을 잘못 입력하셨습니다.";
        };
        System.out.println(result);
    }
}