package com.green.java.ch04;

public class FlowStudy2 {
    public static void main(String[] args) {

        //for문 이용
        // 1,2,3,4,5 (마지막 콤마 없게)

        /*
        for(int i=1; i<6; i++){
            if(i<5)
            {
                System.out.printf("%s,", i);
            }
            else{
                System.out.printf("%s",i);
            }
        }
        */

        for(int i=1; i<6; i++){
            if(i != 1) {
                System.out.print(", ");
            }
                System.out.print(i);
        }
    }
}
