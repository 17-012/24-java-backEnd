package com.green.day3;

import java.util.Scanner;

public class MissionIf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 키를 입력해 주세요 ==> ");
        int height = scanner.nextInt();

        if(height < 161){
            System.out.println("당신은 평균보다 작습니다.");
        } else if (height > 161) {
            System.out.println("당신은 평균보다 큽니다.");
        }
        else{
            System.out.println("당신은 평균입니다.");
        }
    }
}