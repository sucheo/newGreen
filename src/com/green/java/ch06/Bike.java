package com.green.java.ch06;

public class Bike {
    String brand;
    String model;
    int price;
//
//Bike(){
//    this("야마하","H2-1",int price);
//}
//
    public Bike(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Bike(String 야마하) {
    }

    public Bike() {

    }

    void drive(){
        System.out.printf("%s브랜드 %s모델이 달린다.",brand,model);

    }
}
