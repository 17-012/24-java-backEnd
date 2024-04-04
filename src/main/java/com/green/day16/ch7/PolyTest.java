package com.green.day16.ch7;

// 다형성
public class PolyTest {
    public static void main(String[] args) {
        Animal ani_1 = new Dog();
        Animal ani_2 = new BullDog();
        Animal ani_3 = new Cat();
        Dog dog_1 = new BullDog();

//        Dog dog_2 = new Animal(); 컴파일 에러
//        Dog dog_3 = (Dog) new Animal(); 형변환 예외 에러

        System.out.println("----------------");
//        Dog dog_4 = (Dog) ani_1; ani_1에서 .sleep을 쓰고싶다면 형변환 필요
//        dog_4.sleep();
//        dog_4.crying();

    }
}

class Animal {
    void crying() {
        System.out.println("동물이 운다");
    }
}

class Dog extends Animal {
    void crying() {
        System.out.println("강아지가 멍멍");
    }

    void sleep() {
        System.out.println("강아지가 잔다");
    }
}

class Cat extends Animal {
    void crying() {
        System.out.println("고양이가 야옹");
    }
}

class BullDog extends Dog {
    void crying() {
        System.out.println("불독이 월월");
    }
    void sleep() {
        System.out.println("불독이 잔다");
    }
}