package com.green.day6.ch2;

public class EncodeingDecoding {
    public static void main(String[] args) {
        char c = 'B';
        int i = c;
        char c2 = (char) i;
        System.out.printf("c : %c, i : %d, c2 : %c\n", c, i, c2);
    }
}
