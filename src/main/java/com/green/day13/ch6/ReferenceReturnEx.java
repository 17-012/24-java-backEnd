package com.green.day13.ch6;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        NumBox numBox = new NumBox();
        numBox.num = 10;
        NumBox numBox2 = myCopy(numBox);

        System.out.printf("numBox.num : %d\n", numBox.num);
        System.out.printf("numBox.num : %d\n", numBox2.num);

        System.out.println("----------------------");

        numBox.num = 100;
        System.out.printf("numBox.num : %d\n", numBox.num);
        System.out.printf("numBox.num : %d\n", numBox2.num);
    }

    public static NumBox myCopy(NumBox numBox) {
        NumBox temp = new NumBox();
        temp.num = numBox.num;
        return temp;
    }
}