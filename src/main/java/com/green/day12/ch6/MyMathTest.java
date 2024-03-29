package com.green.day12.ch6;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        myMath.add(1,2);
        myMath.sub(1,2);
        myMath.mul(1,2);
        myMath.div(1,2);
    }
}

class MyMath {

    void add(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
    }

    void sub(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
    }

    void mul(int n1, int n2) {
        System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
    }

    void div(int n1, int n2) {
        System.out.printf("%d / %d = %.2f\n", n1, n2, (double) n1 / n2);
    }
}