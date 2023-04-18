package com.green.java.ch04test;

public class ForTest6 {
    public static void main(String[] args) {
        int star = 5;


        for(int i=star; i>0; i--){
            for(int z=1; z<=star; z++){
                if(z<i){
                    System.out.print("_");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for (int i = 1; i <= star; i++) {
        for(int j = 0; j < star; j++){
            if(i+j<star){
                System.out.print("_");
            }else{
                System.out.print("*");
            }
        }
            System.out.println();
        }
    }
}