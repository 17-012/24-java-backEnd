package com.green.day4;

public class VarScope {
    public static void main(String[] args) {
        int num = 20;

        if(1 > 0){
            int num2 = 10;
            System.out.println(num2);
        }
        if(1 > 0){
            int num2 = 10;
            System.out.println(num2);
        }

        for (int i = 0; i < 10; i++) {
        
        }
    }
}
