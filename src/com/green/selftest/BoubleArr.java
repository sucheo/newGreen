package com.green.selftest;

import java.util.Arrays;

public class BoubleArr {

    public static void main(String[] args) {
        //버블 정렬
        int[] num = {8,5,4,7,1,4,3,6};
        int temp = 0;
        int answer = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-i-1; j++) {
                if(num[j]>num[j+1]){
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(num)); //- 배열확인문
        answer = num[num.length/2];//중간값 구하기
        System.out.println("중간값 : " +answer);
        answer = num[num.length-1];
        System.out.println("최대값 : " +answer); //최대값 구하기
        answer = num[0];
        System.out.println("최소값 : " +answer);//최소값 구하기
    }


}
