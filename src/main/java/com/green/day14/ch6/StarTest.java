package com.green.day14.ch6;

public class StarTest {
    public static void main(String[] args) {
        Star star = new Star();
        star.singlePrint(5);
        System.out.println("----------");

        star.squarePrint(5);
        System.out.println("----------");

        star.trianglePrint(5);
        System.out.println("----------");

    }
}
class Star{
    public void singlePrint(int input){
        for (int i = 0; i < input; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public void squarePrint(int input){
        for (int i = 0; i < input; i++) {
            singlePrint(input);
        }
    }

    public void trianglePrint(int input){
        for (int i = 1; i <= input; i++) {
            singlePrint(i);
        }
    }
}