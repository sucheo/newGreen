package com.green.java.Test;
//전자제품, Tv, Computer, Phone,Camera
public class ArgumentStudy {
    public static void main(String[] args) {


    }
}
class Product10{
  protected int price;
  protected String name;


  Product10(int price){
    this.price = price;


  }
}
class Tv10 extends Product10{

    public Tv10() {
        super(100);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
class Computer10 extends Product10{

   public Computer10() {
        super(400);
    }
    @Override
    public String toString() {
        return super.toString();
    }

}

class Phone10 extends Product10 {

    public Phone10() {
        super(80);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Camera10 extends Product10{

    public Camera10() {
        super(30);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}