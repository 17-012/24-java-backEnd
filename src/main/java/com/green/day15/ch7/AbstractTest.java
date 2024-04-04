package com.green.day15.ch7;

public class AbstractTest {
    public static void main(String[] args) {
        KoreaShort koreaShort = new KoreaShort();
        AmericaCat americaCat = new AmericaCat();
        koreaShort.crying();
        americaCat.crying();

    }
}

abstract class Dog {

}

abstract class Cat {
    abstract void crying();
}

class KoreaShort extends Cat{
    @Override
    void crying(){
        System.out.println("야옹~ 야옹~");
    }
}
class AmericaCat extends Cat{
    @Override
    void crying() {
        System.out.println("미유~ 미유~");
    }
}