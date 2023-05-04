package com.green.java.ch07.arraylist;

import java.util.Arrays;

public class MyArrayList {

    private int[] items;

    public MyArrayList() {
        items = new int[0];
        System.out.println(items.length);
    }

    @Override
    public String toString() {
        String str = "[";
        if (items.length > 0) {
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += ", " + items[i];
            }
        }
        str += "]";

        return str;
    }

    public void add(int num) {
        int[] temp = new int[items.length + 1]; // 0->1 temp = 1 temp [4] = temp [3] =num
        temp[items.length] = num;
        for (int i = 0; i < items.length; i++) { //0-> x
            temp[i] = items[i];                   //1-> 10,0    2->10,20 3->10,20,30
        }
        items = temp;
//index = 1; items[index] ,
    }

    void add(int num1, int num2) {
        //if(num1> items.length){return;}
        int[] temp = new int[items.length + 1];
        temp[num1] = num2;
        for (int i = 0; i < items.length; i++) {
            if (i < num1) {
                temp[i] = items[i];
            } else {
                temp[i + 1] = items[i];
            }

        }
        items = temp;
    }

    public int size() {

        return items.length;
    }

//    int remove(int idx) {
//        for (int i = idx + 1; i < size() - 1; i++) {
//            items[i - 1] = items[i];
//        }
//    return size();
//    }

    public int get(int index) {
        return items[index];
    }

    public void bubbleSort() {
        int temp;

        for (int i = items.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (items[j] > items[j + 1]) {
                    temp = items[j];//item[0]번방일때 -> temp[0] 값을 복사해 준다.
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }

    public void set(int num1, int num2) {

        items[num1] = num2;


    }

    public boolean contains(int num) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == num) {
        return true;
            }
        }
        return  false;
    }
}


