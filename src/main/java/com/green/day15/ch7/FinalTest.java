package com.green.day15.ch7;

public class FinalTest {
    public static void main(String[] args) {
        Car c = new Car(2200);
        Car c2 = new Car(2100);

        System.out.println(c.CC);
        System.out.println(c2.CC);

    }
}

class Car {
    final int CC; //생성자를 이용하면 Lazy 처리 가능

    Car(final int cc) { //파라미터도 final 가능
        this.CC = cc;
    }
}

final class Suv extends Car{ // final 을 붙이면 상속 불가
    Suv(int cc){
        super(cc);
    }

    final void start(){} // final 붙이면 override 불가
}
//class Tucson extends Suv{
// }