package com.green.day13.ch6;

public class VarArgsEx {
    public static void main(String[] args) {
        MyMath3_1 myMath3_1 = new MyMath3_1();
        myMath3_1.sum(1, 2);
    }
}

class MyMath3_1 {
//    void sum(int n1, int n2) {
//        System.out.println(n1 + n2);
//    }


    //가변인자 => 파라미터, 매개변수를 탄력적으로 조정 가능
    // 몇개 들어 올지 모를때: => 배열의 길이만큼 for문 사용
    void sum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}