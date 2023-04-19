package com.green.java.ch06;

public class FlowEx13Method {
    public static void main(String[] args) {
        //최소값~최대값 사이의 값을 전부 더하고 출력
        //min값 ~max값 sum = 값
        printAllSum(1,100);
    //1~100 sum = 5050

        printAllSum(2,3);
        //2 ~3 sum =5
        }
    public static void printAllSum(int n1, int n2){

        int sum =0;
        for (int i = n1; i <= n2; i++) {
            sum = sum+i;

        }
        System.out.printf("min:%d max :%d\n",n1,n2);
        System.out.printf("sum =%d\n",sum);
    }
}
