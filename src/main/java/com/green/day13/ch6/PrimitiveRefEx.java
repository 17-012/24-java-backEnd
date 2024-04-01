package com.green.day13.ch6;

public class PrimitiveRefEx {

    public static void changeNum(int input) {
        input = 100;
    }
    public static void changeNum(NumBox input) {
//        input = new NumBox();
//        input.num = 100;
        System.out.println(input.num);
    }

    public static void main(String[] args) {
        int num = 10;

        NumBox numBox = new NumBox();
        numBox.num = 10;

        changeNum(num);
        System.out.println(num);

//        changeNum(numBox.num);
//        System.out.println(numBox.num);

        changeNum(numBox);
        System.out.println(numBox.num);

    }
}

class NumBox {
    int num;
}