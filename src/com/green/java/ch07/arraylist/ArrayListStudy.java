package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {
        //list는 오브젝트값으로 들어가기에 형변환 해야 출력가능
    ArrayList list = new ArrayList<>();//1.객체 생성하기
    list.add(10); // 0번방 값 넣기       //2. add써서 값 넣어서 값 추가하기
    list.add(20); // 1번방 값 넣기       
    list.add("문자열가능"); // 2번방 값 넣기

        Object obj = 10;
        System.out.println(list.get(0));  // 0번방 호출
        System.out.println(list.get(1));  // 1번방 호출
        System.out.println(list.get(2));  // 2번방 호출

        int n1 = (int)list.get(0);         //변수 형변환 해주기
        int n2 = (int)list.get(1);
        String str1 = (String)list.get(2);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(str1);
     }
}
