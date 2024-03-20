package com.green.day5.ch2;

import java.io.PrintStream;

public class Naming {
    public static void main(String[] args) {
        /*
        네이밍 규칙
        1. 변수 명명규칙
         */

        // 1) 대소문자가 구분, 길이 제한 X
        int abc, Abc, aBc, abC;
        int aaaaaaaaaaaaaaaaaaaa;

        // 2) 예약어 사용금지
        // int public;
        // int void;
        int String;  // String은 클래스명, 되긴하나 사용 안하는 것이 좋다.

        // 3) 숫자로 시작 X, 숫자가 시작만 아니면 어느 위치든 상관없음.
        // int 1abc;
        int a1bc;

        // 4) 특수기호는 '_', '$' 만 허용
        int _123, $123;

        //카멜 케이스
        // happySunday
        //파스칼 케이스
        // HappySunday
        final int LAST_INDEX_OF = 10;
        final String NAME = "홍길동";
        PrintStream ps = System.out;
        ps.println("test");
    }
}
