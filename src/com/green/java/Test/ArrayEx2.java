package com.green.java.Test;
//연습문제1
//거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
//ex) 거스름돈 : 2860원 / 500원 : 5개 / 100원 : 3개 / 50원 : 1개 / 10원 : 1개
public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for(int i=0; i<arr.length; i++){
            arr[i] =(int)(Math.random()*100)+1;
                    }
        for (int i = 0; i < args.length ; i++) {
            System.out.print(arr[i]);
        }

    }
}
