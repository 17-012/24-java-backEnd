package com.green.day16.ch7;

public class PolyTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();

        doCrying(dog);
        doCrying(bullDog);
        doCrying(cat);
    }

    static void doCrying(Animal input) {
        input.crying();
//        if (input instanceof Dog){
//            ((Dog) input).sleep();
//        }
        if (input instanceof Dog dog) {
            dog.sleep();
        }
    }

    /*

    static void doCrying(Dog input) {
        System.out.println("강아지 멍멍");
    }

    static void doCrying(BullDog input) {
        System.out.println("불독이 월월");
    }

    static void doCrying(Cat input) {
        System.out.println("고양이가 야옹");
    }

    static void doCrying(Object input) {

        if (input.getClass().equals(Dog.class)) {
            System.out.println("강아지 멍멍");
        } else if (input.getClass().equals(BullDog.class)) {
            System.out.println("불독이 월월");
        } else if (input.getClass().equals(Cat.class)) {
            System.out.println("고양이가 야옹");
        }

    }
    */

}
