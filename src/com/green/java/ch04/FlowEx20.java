package com.green.java.ch04;

public class FlowEx20 {
    public static void main(String[] args) {

        int count1 = 0, count2 = 0;

        for (count1 = 1; count1 <= 3; count1++)
        {
            for(count2 = 1; count2<=3; count2++){
                System.out.printf("[ %d, %d ] ", count1, count2);
            }
            System.out.printf("\n");
        }
    }
}
