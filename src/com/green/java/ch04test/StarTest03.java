package com.green.java.ch04test;

public class StarTest03 {
    public static void main(String[] args) {
        //역삼각형
        int star = 5;

        for(int i = 1; i<star; i++){
            for(int j = 5; j>i; j--){
                System.out.print("*");
            } System.out.println();
        }
    }
}
