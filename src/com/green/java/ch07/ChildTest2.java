package com.green.java.ch07;

public class ChildTest2 {
    public static void main(String[] args) {
        Child cd = new Child(10);
        cd.age=20;
        System.out.printf("super : %d\n",cd.getSuperAge());
        System.out.printf("this : %d\n",cd.getThisAge());
    }
}
