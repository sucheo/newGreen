package com.green.java.ch05;
//p207, p.166(향상된 for문, foreach문)
public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi" };
            for (int i = 0; i < names.length; i++) {
            System.out.printf("names[%d]: %s\n",i,names[i]);
        }
            names[0] = "Yu";
            //전수조사 사용시 아래의 for each문
            for(String nm : names){
                System.out.println(nm);
            }
        
    }
}
