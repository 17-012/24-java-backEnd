package com.green.day15.ch7;

public class OverrideTest {
    public static void main(String[] args) {
        Parent p = new Parent(55);

        Child child = new Child(13);
//        child.attack();
//
//        System.out.println(p.age);
//        System.out.println(child.age);

        child.doubleAttack();

    }
}

class Parent {

    int age;

    Parent(int age) {
        this.age = age;
    }

    void attack() {
        System.out.println("부모가 적을 공격한다.");
    }

    public void defense(){
        System.out.println("부모가 적의 공격을 방어한다.");
    }

}

class Child extends Parent {

    int mzPower;

    Child(int age) {
        super(age);
    }

    Child(int age, int mzPower) {
        super(age);
        this.mzPower = mzPower;
    }

    @Override
    void attack() {
        System.out.println("자식이 적을 공격한다.");
//        super.attack();
    }

    public void doubleAttack() {
        this.defense();
        super.defense();
        System.out.println("-------------");
        this.attack();
        super.attack();
    }

}