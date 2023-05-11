package com.green.selftest;

public class MultiArrayStudy2 {
    public static void main(String[] args) {
        int[][] score = {
                {90, 80, 70},
                {95, 33, 12},
                {100, 100, 88},
                {100, 100, 100},
        };
//

//        int[] t1 =score[1];
//        System.out.println(t1[1]);
//        System.out.println(score[1][1]);

//        for (int i = 0; i < score.length; i++) {
//            printArr(score[i]);
//        }
        printArrAll(score);
        int sum = sumArrAll(score);
        System.out.println("sum : " + sum);
    }
    public static int sumArrAll(int[][] num){
        int idx = num.length-1;
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < idx; j++) {
              sum = sum + num[i][j];//
            }
    }
        return sum;
}
    static void printArrAll(int[][] num2) {
        for (int i = 0; i < num2.length; i++) {
            printArr(num2[i]);

        }



    }


    public static void printArr(int[] num) {
        System.out.printf("{");
        int sum = num.length;
        if (sum > 0) {
            System.out.print(num[0]);
            for (int i = 1; i < num.length; i++) {
                System.out.printf(", %d",num[i]);
            }
        }
        System.out.println(" }, ");
    }
}
