package com.green.day9.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (true) {
            if (sum > 100) {
                break;
            }
            else {
                i++;
                sum += i;
            }
        }
        System.out.println("결과 => 합 : " + sum + "\tindex : " + i);
    }
}
