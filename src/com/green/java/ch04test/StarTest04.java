package com.green.java.ch04test;

public class StarTest04 {
    //공백두고 직각삼각형
    public static void main(String[] args) {
        int star = 5;

        for(int i = 1; i<star; i++){
        for(int z = 0; z<star-i; z++){
            System.out.print(" ");
}
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
