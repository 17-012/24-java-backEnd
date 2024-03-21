package com.green.day6.ch3;

import java.util.UUID;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        System.out.println(c);

        int d = 1_000_000;
        System.out.println(d);

        long e = 1_000_000 * 1_000_000;
        long f = 1_000_000 * 1_000_000L;
        System.out.println(e);
        System.out.println(f);

        double g = 10 / 3;
        System.out.println(g);
        double g2 = (double) 10 / 3;
        System.out.println(g2);
    }
}