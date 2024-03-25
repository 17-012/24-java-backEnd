package com.green.day8.ch4;

public class FlowEx26 {
    public static void main(String[] args) {
        int stop=0, sum=0;
        for (int i = 1; i < 1000; i++) {
            sum += i;
            if(sum < 100){
                stop = i;
            }
        }
        System.out.println(stop);
    }
}
