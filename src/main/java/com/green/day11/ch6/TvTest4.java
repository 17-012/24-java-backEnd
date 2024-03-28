package com.green.day11.ch6;

import java.util.Arrays;

public class TvTest4 {
    public static void main(String[] args) {

        Tv[] tvArr = new Tv[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
        }

        System.out.println(Arrays.toString(tvArr));

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channel = 11 + i;
        }

        for (Tv tv : tvArr) {
            System.out.println(tv.channel);
        }
    }
}