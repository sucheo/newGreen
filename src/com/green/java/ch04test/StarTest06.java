package com.green.java.ch04test;

public class StarTest06 {//마름모
    public static void main(String[] args) {
        int star= 9;

        for(int i = 0; i <=star; i++){
            for(int j = 0; j<= star-i; j++){
                System.out.print("_");
            }
            for(int k = 0; k<=i; k++) {
                System.out.print("*");
            }
            for(int l = 0; l<i; l++){
                System.out.print("*");
            }
            System.out.println();
            }

            System.out.println();
        }

    }

