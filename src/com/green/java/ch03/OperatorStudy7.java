package com.green.java.ch03;

public class OperatorStudy7 {
    public static void main(String[] args) {

        int i = 5, j = 0;

        j = i++;
        System.out.println("j=i++; 실행 후, i=" + i + " j="+j);

        int i2 = 5, j2 = 0;

        j2 = ++i2;
        System.out.println("j=++i; 실행 후, i=" + i2 + " j="+j2);


    }
}


