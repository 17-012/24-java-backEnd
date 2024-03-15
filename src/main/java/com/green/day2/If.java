package com.green.day2;
public class If {
    public static void main(String[] args) {
        int n1=10, n2=20;
        n2 = 30;
        if(n1 > n2){
            System.out.println("n1이 n2보다 초과 값입니다.");
        }
        else if(n1 == n2){
            System.out.println("n1과 n2가 같은 값입니다.");
        }
        else {
            System.out.println("n1이 n2 미만의 값입니다.");
        }
        System.out.println("-------------------------------------");
        
        n2 = 10;
        if(n1 < n2) {
            
        } else if (n1 > n2) {
            
        } else {
            
        }
    }
}