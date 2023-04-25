package com.green.java.ch07.poly;

public class Poly2 {
    public static void main(String[] args) {
        Bulldog ani1 = new Bulldog();
        boolean r1 = ani1 instanceof Bulldog;
        System.out.println("r1 : " + r1);
        Bulldog bd1 = (Bulldog) ani1;


        //System.out.println("r2 : " +(ani1 instanceof Cat));
    }
}
