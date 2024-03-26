package com.green.day8.ch4;

public class FlowEx19 {
    public static void main(String[] args) {

        int st = 1, nd = 1, rd = 1;
        for (; st < 4; rd++) {
            if (rd == 4) {
                nd++;
                rd = 1;
            }
            if (nd == 4) {
                st++;
                nd = 1;
            }
            if (st == 4) break;
            System.out.printf("%d%d%d\n", st, nd, rd);
        }
    }
}
