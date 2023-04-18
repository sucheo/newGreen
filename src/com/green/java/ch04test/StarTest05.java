package com.green.java.ch04test;

public class StarTest05 {
    //트리
    public static void main(String[] args) {
        int star = 9;
    for(int i = 1; i<star; i++){

    for(int z = 0; z<star-i; z++){
        System.out.print("_");
    }
    for(int j =0; j<i; j++){
        System.out.print("*");
    }
    for(int a =1; a<i; a++){
            System.out.print("*");
        }

    System.out.println();
}
    }

}
