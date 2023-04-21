package com.green.java.ch06;
//재귀함수 쓰는이유..?
//폴더안에 폴더가 여러번 있을때 재귀함수로 표헌하면 좋다
public class FactorialTest {
    public static void main(String[] args) {

        int result = factorial(4);
        System.out.printf("result : %d\n",result);
    }
    static int factorial(int n){
        System.out.println(n);
        if( n == 1 ) {
            return 1;
        }
        return n * factorial(n-1);//재귀호출
    }
}
