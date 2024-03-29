package com.green.day12.ch6;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod myMethod = new MyMethod();

        myMethod.checkOddEven(10);
        myMethod.checkOddEven(11);
        myMethod.checkOddEven(100);
        myMethod.checkOddEven(13);

        int r = myMethod.abs(10);
        System.out.println(r);

        r = myMethod.abs(-8);
        System.out.println(r);

        int randomValue = myMethod.getRandomValue(10);
        System.out.println(randomValue);

        randomValue = myMethod.getRandomValue(100);
        System.out.println(randomValue);


    }
}

class MyMethod {
    void checkOddEven(int num) {
        System.out.println(num % 2 == 0 ? "짝수입니다." : "홀수입니다.");
    }

    int abs(int num) {
        int result = (num < 0 ? -num : num);
        return result;
    }

    int getRandomValue(int input) {
        return (int) (Math.random() * input);
    }

}
