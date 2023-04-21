package com.green.java.ch06;

public class MyMathTest {
    public static void main(String[] args) {
        int n1 = 10, n2 = 22;
        MyMathInstance sum1 = new MyMathInstance();//객체화 메소드를
        int r1 = sum1.sum(n1,n2);
        System.out.println(r1);

        int r2 = MyMathStatic.sum(n1,n2);
        System.out.println(r2);

        //MyMathInstance 클래스에 있는 sum 메소드를 이용하여
        //n1,n2값을 결과를 콘솔에 출력
    }
}
