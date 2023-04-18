package com.green.java.ch04test;

public class StarTest01 {
//사각형
    public static void main(String[] args) {
        int star = 5;
        for(int i = 0;  i< star; i++){
            for(int j = 0; j <star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
