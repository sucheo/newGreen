package com.green.java.Test;

public class ArgumentStudy0 {

}


class Product0{
    protected int price;
    protected int bonusPoint;

    Product0(int price){
        this.price = price;
        this.bonusPoint = (int)(price * 0.1);
    }

    public int getPrice() {
        return price;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }
}

class Tv0 extends Product0 {
    public Tv0(){
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}
class Computer0 extends Product0 {
    public Computer0(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}
class Audio0 extends Product0 {
    public Audio0() {super(50);}
    public String toString() {return "Audio";}
}
