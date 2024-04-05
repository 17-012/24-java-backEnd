package com.green.day16.ch7;

public class PloyArgumentTest {
    public static void main(String[] args) {

//        Product p = new Product(1000);
//        Product p2 = new Product(500);
//
//        System.out.println(p);
//        System.out.println(p2);

//        Tv tv = new Tv();
//        Computer computer = new Computer();
//        Sofa sofa = new Sofa();

        Buyer buyer = new Buyer(20000);

        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Sofa());

        buyer.showMeTheMoney();

    }
}

class Buyer {
    private int haveMoney;
    private int haveBonusPoint;

    Buyer(int haveMoney) {
        this.haveMoney = haveMoney;
    }

    public void showMeTheMoney() {
        System.out.printf("haveMoney : %s\thavePoint : %s\n", haveMoney, haveBonusPoint);
    }

    public void buy(Product product) {
        this.haveMoney -= product.getPrice();
        this.haveBonusPoint += product.getBonusPoint();
        System.out.printf("%s를 구입 하셨습니다.\n", product);
    }
}

class Sofa extends Product {
    Sofa() {
        super(80);
    }

    @Override
    public String toString() {
        return String.format("Sofa %s", super.toString());
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return String.format("Computer %s", super.toString());
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return String.format("Tv %s", super.toString());
    }

}

class Product {

    private final int price;
    private final int bonusPoint;

//    @Override
//    public String toString() {
//        String result = "Price : " + price + ",\tBonusPoint : " + bonusPoint;
//        return result;
//    }

    @Override
    public String toString() {
//        String.format() printf와 동일하게 사용하면 됨
        return String.format("Price : %,d \t BonusPoint : %,d", price, bonusPoint);
    }

    Product(int price) {
        this.price = price;
        this.bonusPoint = price / 10;
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

}