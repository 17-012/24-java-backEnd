package com.green.day15.ch7;

public class ConstructorTest {
    public static void main(String[] args) {

    }
}

class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }
}

class Tiger extends Animal {
    String name;

    Tiger(int age, String name) {
        super(age);
        this.name = name;
    }
    Tiger(int age){
        super(age);
    }
}