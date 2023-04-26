package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(1,100);
        list.add(0,300);
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        System.out.println(list1);
        list1.add(0,"abc");
        System.out.println(list1);

        int removeValue = list.remove(4);
        System.out.println("removeValue : " + removeValue);
        System.out.println();
    }
}
