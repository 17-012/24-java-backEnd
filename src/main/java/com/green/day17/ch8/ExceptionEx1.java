package com.green.day17.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("ㅁㄴㅇ");
        }
    }
}
