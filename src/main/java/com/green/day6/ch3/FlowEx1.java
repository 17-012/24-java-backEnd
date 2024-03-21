package com.green.day6.ch3;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 1;
        System.out.printf("x = %d 일 때, 참인 것은?\n", x);

        String name = "가나";
        char bloodType = 'A';
        name = "슬랙";
        System.out.printf("%s의 혈액형은 %c 입니다.\n", name, bloodType);
        name = "가나";
        System.out.printf("%s의 혈액형은 %c 입니다.\n", name, bloodType);
        bloodType = 'B';
        System.out.printf("%s의 혈액형은 %c 입니다.\n", name, bloodType);
    }
}
