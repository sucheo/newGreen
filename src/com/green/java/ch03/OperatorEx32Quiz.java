package com.green.java.ch03;

public class OperatorEx32Quiz {

    public static void main(String[] args) {
     int x = 10, y= -5, z=0;
     int absX, absY, absZ;

     OperatorEx32Quiz oeq = new OperatorEx32Quiz();

     absX = oeq.getAbs(x);
     absY = oeq.getAbs(y);
     absZ = oeq.getAbs(z);

        System.out.println("absX : " + absX);
        System.out.println("absY : " + absY);
        System.out.println("absZ : " + absZ);
    }
    public int getAbs(int num){

        return num >=0 ? num : -num;
    }

}