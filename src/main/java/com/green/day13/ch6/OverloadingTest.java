package com.green.day13.ch6;

public class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 myMath3 = new MyMath3();
        myMath3.add(1, 2);
        myMath3.add(1, 2.3);

    }
}

class MyMath3 {
    int add(int n1, int n2) {
        return n1 + n2;
    }

    int add(int n1, double n2) {
        return n1 + (int) n2;
    }
}