package com.green.java.ch07;

public class ChildTest {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.play();
        ch.age = 10;
        System.out.println(ch.age);
        ch.play();
        System.out.println();
        GrandChild gc = new GrandChild();
        gc.play();
        gc.age = 20;
        System.out.println();
        gc.play();
    }
}
