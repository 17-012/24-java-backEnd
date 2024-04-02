package com.green.day14.ch7;

public class CarTest {
    public static void main(String[] args) {
        //is-a => 아반떼 & 차 (아반떼 는 차, 차는 아반떼)
        //has-a => 차 & 스피커 (차는 스피커가 아님,
        //스피커는 차가 아님 but, 차 안에 스피커가 있음)
    }
}

class Car {
    int cc;
    String company;
    Speaker speaker;

    void drive() {
        System.out.println("자동차가 붕붕");
    }
}

class Speaker {
    int volume;

    void play() {
        System.out.println("음악이 흘러 나온다.");
    }
}

class Avante extends Car {

}

