package com.green.day3;

import java.util.Scanner;

public class MissionIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요 (남 / 여) ==> ");
        String gender = scanner.nextLine();


        if(gender.equals("남")){
            System.out.println("당신은 남자입니다.");
        }
        else if (gender.equals("여")) {
            System.out.println("당신은 여자입니다.");
        }
        else {
            System.out.println("성별을 입력해 주세요");
        }
    }
}