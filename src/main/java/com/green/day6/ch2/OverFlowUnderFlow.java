package com.green.day6.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args) {
        int i = 128;
        byte b = 0;
        b = (byte) i;
        System.out.println(b);


        int i2 = -129;

        if (Byte.MAX_VALUE >= i) {
            b = (byte) i;
            System.out.println(b);

        }
        if (Byte.MIN_VALUE <= i2) {
            byte b2 = (byte) i2;
            System.out.println(b2);
        }
    }
}