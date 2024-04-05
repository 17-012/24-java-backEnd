package com.green.day17.ch7;

public class EqualsStudy {
    public static void main(String[] args) {
        NumBox n1 = new NumBox(10);
        NumBox n2 = new NumBox(10);

        System.out.println(n1.getNum());
        System.out.println(n2.getNum());

        System.out.println(n1 == n2);
        System.out.println("-------------------");
        System.out.println(n1.equals(n2));
        System.out.println(n1.getNum() == n2.getNum());
    }
}

class NumBox {
    private int num;

    public int getNum() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NumBox numBox) {
            return numBox.num == this.num;
        }
        return false;
    }

    public NumBox(int num) {
        this.num = num;
    }
}