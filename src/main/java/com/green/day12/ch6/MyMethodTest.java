package com.green.day12.ch6;

public class MyMethodTest {
    static void printGugudan(int num) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }
    public static void main(String[] args) {
        MyMethod myMethod = new MyMethod();

        myMethod.checkOddEven(10);
        myMethod.checkOddEven(11);
        myMethod.checkOddEven(100);
        myMethod.checkOddEven(13);

        System.out.println("-----------------------");

        int r = myMethod.abs(10);
        System.out.println(r);

        r = myMethod.abs(-8);
        System.out.println(r);

        System.out.println("-----------------------");

        int randomValue = myMethod.getRandomValue(10);
        System.out.println(randomValue);

        randomValue = myMethod.getRandomValue(100);
        System.out.println(randomValue);

        printGugudan(3);

        System.out.println("-----------------------");

        printGugudan(9);

        System.out.println("-----------------------");

        myMethod.printGugudan(3);

        System.out.println("-----------------------");

        int randomValue2 = myMethod.getRandomValue(10, 20);
        System.out.println(randomValue2);

        randomValue2 = myMethod.getRandomValue(5, 31);
        System.out.println(randomValue2);




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
    int getRandomValue(int min, int max) {
        int range = max-min;
        int data = (int)(Math.random()*range) + min;
        return data;
    }

    void printGugudan(int num) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }

}
