package com.green.day11.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};
        String tem = names[1];

        System.out.println(Arrays.toString(names));
        System.out.println(tem);

        names[0] = "Yu";
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            String val = names[i];
            System.out.printf("val : %s\n", val);
        }

        for (String data : names) {
            System.out.println(data);
        }
    }
}