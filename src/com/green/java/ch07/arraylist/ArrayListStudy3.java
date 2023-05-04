package com.green.java.ch07.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1,100);
        list.add(4,300);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        System.out.println(list1);
        list1.add(0,"abc");
        System.out.println(list1);

        int removeValue = list.remove(4); //삭제후 값이 리턴되서 삭제된 값을 알수있음
        System.out.println("removeValue : " + removeValue);
        System.out.println(list);
        System.out.println(list.size());

        list.clear();
        System.out.println(list);

    }
}
