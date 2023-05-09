package com.green.programers;

public class test4 {
    public static void main(String[] args) {
        int num_list[] = {1,2,3,4,5,6,7};
        int[] answer = new int[num_list.length];
        for (int i = num_list.length; i >= 0; i--) {
            answer[i] = num_list[i];
        }
    }
}
