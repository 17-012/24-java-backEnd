package com.green.day14.ch6;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("white", "auto", 5);
        Car car2 = new Car("black", "manual", 3);

        System.out.printf("Color : %s,\n" +
                "GearType : %s,\n" +
                "Door : %s\n", car.color, car.gearType, car.door);

        System.out.println("----------------------");

        Car car3 = new Car();

        System.out.printf("Color : %s,\n" +
                "GearType : %s,\n" +
                "Door : %s\n", car3.color, car3.gearType, car3.door);

        System.out.println("----------------------");

        Car car4 = new Car(car2);

        System.out.printf("Color : %s,\n" +
                "GearType : %s,\n" +
                "Door : %s\n", car4.color, car4.gearType, car4.door);

        System.out.println("----------------------");


    }
}

class Car {
    String color;
    String gearType;
    int door;

    public Car() {
//        color = "red";
//        gearType = "manual";
//        door = 5;
//         Car ( "red" , "manual" , 5 ) 인 바로 아래 생성자 호출
        this("red", "manual", 5);

    }

    public Car(Car input) {
//        color = input.color;
//        gearType = input.gearType;
//        door = input.door;
        this(input.color, input.gearType, input.door);
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

}