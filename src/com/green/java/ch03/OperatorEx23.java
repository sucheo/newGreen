package com.green.java.ch03;

public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b\n", "abc"=="abc");
        System.out.printf(" str1==\"abc\" ? %b\n", str1=="abc");
        System.out.printf(" str2==\"abc\" ? %b\n\n", str2=="abc");

        System.out.printf("\"abc\"==\"abc\" ? %b \n\n", "abc" == "abc");

        System.out.printf("str1.equals(\"abc\") ? %b \n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b \n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b \n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase (\"ABC\") ? %b \n", str2.equalsIgnoreCase("ABC"));
    }
}


/*
1. == 비교를 위한 연산자
주소의 값을 비교합니다.(Call By Reference)
주소의 값이란 실제 내용의 값이 아닌 자료의 위치의 값이라고 생각하면 편하십니다.

2. equals() 메소드
equals() 메소드는 객체끼리 내용 비교합니다.(Call By value)

equalsIgnoreCase > 대소문자를 무시하고 비교


 */