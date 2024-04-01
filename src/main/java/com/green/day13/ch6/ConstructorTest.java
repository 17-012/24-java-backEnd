package com.green.day13.ch6;

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        Data2 data2 = new Data2(1);
        Data2 data2_1 = new Data2();

        System.out.println(data1.value);
        System.out.println(data2.value);
        System.out.println(data2_1.value);
    }
}

class Data1 {
    int value;

    public Data1() {
        System.out.println("Data1 생성자 호출");
    }
}

class Data2 {
    int value;

    public Data2(){
        value = 100;
    }

    public Data2(int param) {
        value = param;
    }
}