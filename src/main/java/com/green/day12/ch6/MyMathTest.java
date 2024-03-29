package com.green.day12.ch6;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();

        int n1 = 1, n2 = 2;

        myMath.add(n1, n2);
        myMath.sub(n1, n2);
        myMath.mul(n1, n2);
        myMath.div(n1, n2);

        System.out.println("----------------");

        System.out.printf("%d + %d = %d\n", n1, n2, myMath.returnAdd(n1, n2));
        System.out.printf("%d - %d = %d\n", n1, n2, myMath.returnSub(n1, n2));
        System.out.printf("%d * %d = %d\n", n1, n2, myMath.returnMul(n1, n2));
        System.out.printf("%d / %d = %.2f\n", n1, n2, myMath.returnDiv(n1, n2));

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

    int returnAdd(int n1, int n2) {
        return n1 + n2;
    }

    int returnSub(int n1, int n2) {
        return n1 - n2;
    }

    int returnMul(int n1, int n2) {
        return n1 * n2;
    }

    double returnDiv(int n1, int n2) {
        return (double) n1 / n2;
    }

}