package com.green.java.ch04test;

public class StarTest02 {
    //직각삼각형
    public static void main(String[] args) {
        int star = 5;
        for(int i = 1; i<star; i++)
        {
            for(int j = 0 ; j < i; j++){
                System.out.print("*");
            }System.out.println();

        }

    }
}
