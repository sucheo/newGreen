package com.green.java.ch04test;

public class ForTest413 {
    public static void main(String[] args) {

        for(int i =0; i<4; i++){

            for(int j = 1; j<4; j++){
                if(j==i){
                    System.out.printf("[%d,%d]",i,j);
                }else if(i!=j){
                    System.out.print("\t");
                }

            }System.out.println();

        }
    }
}
