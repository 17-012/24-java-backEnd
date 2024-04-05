package com.green.day17.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) {
        divTry(10, 0);

        try {
            divThrows(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void div(int n1, int n2) {
        System.out.println(n1 / n2);
    }

    public static void divTry(int n1, int n2) {
        try {
            System.out.println(n1 / n2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void divThrows(int n1, int n2) throws Exception {
        System.out.println(n1 / n2);
    }
}
