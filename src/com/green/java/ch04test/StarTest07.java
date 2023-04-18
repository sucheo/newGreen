package com.green.java.ch04test;

public class StarTest07 {
    public static void main(String[] args) {
        int star = 5;
//0~4
        //0~4
        //star>(i+j)+1){ 5>
        for(int i = 0; i<star;  i++){
            for(int j =0; j<star; j++){
                if(star>(i+j)+1){
                    System.out.print("_");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
