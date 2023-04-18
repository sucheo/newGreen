package com.green.java.ch02;

public class VariableString {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "World";


        // 주소값이 복사된다, 대문자로 시작하는 변수들의 값은 주소값에 저장된다

        System.out.println(s1);
        System.out.println(s2);

        System.out.printf("%s, %s \n", s1, s2);

        String s3 = s1 + " " + s2  ;
        System.out.println(s3);
        System.out.printf("%s %s \n", s1, s2);

    }
}
