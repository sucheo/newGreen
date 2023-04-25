package com.green.java.ch07.poly;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class PolyQuiz1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("뽀삐");
        Bulldog bd1 = new Bulldog();
        Cat cat1 = new Cat();
        Duck duck1 = new Duck();

        animalCryingCall(dog1);
        animalCryingCall(bd1);
        animalCryingCall(cat1);
        animalCryingCall(duck1);

    }
    static void animalCryingCall(Animal ani1) {
        ani1.crying();
       if(ani1 instanceof Dog){
           Dog dog =(Dog)ani1;
           dog.jump();
       }
    }
}
