package com.green.java.ch07.arraylist;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        int sum = 0;
        MyArrayList myList = new MyArrayList();
       myList.add(10);
       myList.add(20);
       myList.add(30);
       myList.add(40);
       myList.add(3, 100);

       System.out.println(myList);

       System.out.println(myList);
        //myList.remove(4);
        System.out.println(myList.size());

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));

        }
        System.out.println("-----------------------");
        for (int i = 0; i < myList.size(); i++) {
            sum = sum + myList.get(i);
        }
        System.out.println("값 : " + sum);
    }
}