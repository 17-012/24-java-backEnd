package com.green.day8.ch4;

public class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.printf("%d 부터 %d 까지의 합 : %d\n", 1, i, sum);
        }

        System.out.println("정상 결과값 : " + 10 * 11 / 2);

    }
}
