package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 => ");
        long input = scanner.nextLong();
        int sum=0;
        while (input != 0){
            sum += input % 10;
            input /= 10;
        }
        System.out.println(sum);
    }
}
