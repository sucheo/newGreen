package com.green.java.ch05;

public class ArrayStudy4 {
    public static void main(String[] args) {
        //배열: 같은 타입의 여러값을 저장하기 위한 공간

        int[] numArr = new int[] {10,20,30,40,50};
        int[] copyArr = numArr;

        numArr[0] = 123;

        for(int i = 0; i<copyArr.length; i++){
            System.out.printf("copyArr[%d] : %d\n", i, copyArr[i]);
        }
    }
}
