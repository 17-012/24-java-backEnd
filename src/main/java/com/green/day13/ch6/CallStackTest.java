package com.green.day13.ch6;

public class CallStackTest {
    public static void firstMethod() {
        System.out.println("Call FirstMethod!");
        CallStackTest.secondMethod();
    }

    public static void secondMethod() {
        System.out.println("Call SecondMethod!");

    }

    public static void main(String[] args) {
        firstMethod();
        CallStackTest.firstMethod();
    }
}
