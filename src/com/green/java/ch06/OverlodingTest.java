package com.green.java.ch06;

public class OverlodingTest {
    public static void main(String[] args) {
        //sum{1,2,3,4,5,6,7,8,9,10,11,12};
    }
    public static void sum(int n1,int n2){
        System.out.println(n1+n2);
    }
    public static void sum(int n1, int n2, long n3){
        System.out.println(n1+n2+n3);
    }
    public static int sum(int n1, int n2, int n3) {
        return n1 + n2 +n3;
    }
}
