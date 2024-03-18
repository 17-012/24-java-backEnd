package com.green.day3;

public class IfMultiple {
    public static void main(String[] args) {
        int val1 = 10, val2 = 100;
        if(val1 % 2 == 0){
            if(val2 % 2 == 0){
                System.out.println(val2-val1);
            }
            else{
                System.out.println(val2);
            }
        }
        else {
            if(val2 % 2 == 0){
                System.out.println(val2-5);
            }
            else {
                System.out.println(val2);
            }
        }
    }
}