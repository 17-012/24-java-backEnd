package com.green.day2;

public class test {
    public static void main(String[] args) {
        //랜덤한 100~700까지의 수 중 차례로 3개를 뽑아 가장 큰 수 부터 출력 하시오
        int data1=0, data2=0, data3=0;
        for (int i = 0; i < 3; i++) {
            int rand = (int)(Math.random()*800) + 100;
            if(i == 0){
                data1 = rand;
            }
            if (i == 1) {
                data2 = rand;
            }
            if( i == 2){
                data3 = rand;
            }
        }
        if(data1 <= data2){
            //321
            if(data2 <= data3){
                System.out.println(data3 + "->" + data2 + "->" + data1);
            }
            //213
            else if (data3 <= data1) {
                System.out.println(data2 + "->" + data1 + "->" + data3);
            }
            //231
            else{
                System.out.println(data2 + "->" + data3 + "->" + data1);
            }
        }
        else {
            //123 (data 1 > data2)
            if(data2 >= data3){
                System.out.println(data1 + "->" + data2 + "->" + data3);
            }
            //132
            else if (data1 >= data3) {
                System.out.println(data1 + "->" + data3 + "->" + data2);
            }
            //312
            else{
                System.out.println(data3 + "->" + data1 + "->" + data2);
            }
        }
        System.out.println("결과 값" + data1+"->"+data2+"->"+data3);




    }
}
