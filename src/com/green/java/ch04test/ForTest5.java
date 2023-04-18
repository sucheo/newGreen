package com.green.java.ch04test;

public class ForTest5 {

    public static void main(String[] args) {
        int star = 5;

        for(int i = 1;  i<=star; i++ ){
            for(int j = 0; j<star-i; j++){
                System.out.print(" ");
            }for(int z = 0; z<i; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
