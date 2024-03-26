package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int sol = (int) (Math.random() * 100.0) + 1;
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (input != sol) {
            System.out.print("숫자를 입력해 주세요 => ");
            input = scanner.nextInt();
            if (input > sol) {
                System.out.println("Down");
            } else if (input < sol) {
                System.out.println("Up");
            }
        }
        System.out.println("정답은 : " + sol);
    }
}
