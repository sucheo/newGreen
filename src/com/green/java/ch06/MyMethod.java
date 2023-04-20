package com.green.java.ch06;

public class MyMethod {

    //void -> return type
    //sum -> method 명
    //(int n1, int n2) -> parameter파라미터
    void sum(int n1, int n2){//선언부

        if(n1==20){
            return;
        }
        System.out.println(n1+n2);
    }
    int sum2(int n1,int n2){
        return n1+n2;
    }
    //{+@}구현부
}
