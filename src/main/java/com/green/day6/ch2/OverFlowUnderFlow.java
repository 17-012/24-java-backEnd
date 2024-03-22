package com.green.day6.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args) {
        int i = -2000;
        int i2 = -129;
        int n3 = 128;

        if (n3 < Byte.MIN_VALUE || n3 > Byte.MAX_VALUE) {
            System.out.println("잘못된 값입니다.");
        } else {
            System.out.println("형 변환이 완료되었습니다." + (byte) n3);
        }

        if (Byte.MAX_VALUE >= i) {
            byte b = (byte) i;
            System.out.println("b : " + b);
        }
        if (Byte.MIN_VALUE <= i2) {
            byte b2 = (byte) i2;
            System.out.println("b2 : " + b2);
        }
        System.out.println("------종료------");
    }
}