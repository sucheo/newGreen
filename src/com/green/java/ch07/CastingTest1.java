package com.green.java.ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireCar fc = new FireCar();
        FireCar fc2 = null;

        fc.water();
        car = fc;
        car.drive();
        //car.water();
        //car = new Car(); 자식은 부모의 객체를 받을 수 없어 false가 뜸
        if(car instanceof FireCar) {
            fc2 = (FireCar) car;//부모 -> 자식
            fc2.water();
        }
    }
}

class Car{
    void drive(){
        System.out.println("drive, Brrrrr~");
    }
    void stop(){
        System.out.println("stop!!!");
    }
}
class FireCar extends Car{
    void water(){
        System.out.println("water!!!");
    }
}
