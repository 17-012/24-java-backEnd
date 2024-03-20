package com.green.day5.ch2;

public class PrintFormat {
    public static void main(String[] args) {
        char c = 'A';
        int finger = 10;
        long big = 100_000_000_000L;

        System.out.printf("c = %c, %d\n",c ,(int)c);
        System.out.printf("finger = [%5d]\n", finger);
        System.out.printf("finger = [%-5d]\n", finger);
        System.out.printf("finger = [%05d]\n", finger);
        System.out.println(big);

        int year = 2024;
        int mon = 3;
        int day = 20;
        System.out.printf("%4d-%02d-%02d\n", year, mon, day);

        String url = "www.green.com";
        float f1 = .10f;
        double d = 1.23456789;
        System.out.printf("url = %s\n",url);
        System.out.printf("f1 = %.1f\n",f1);
        System.out.printf("d = %.8f\n",d);

        System.out.printf("%s\n", url);
        System.out.printf("%20s\n", url);
        System.out.printf("%-20s\n", url);
        System.out.printf("%.8s\n", url);
    }
}
