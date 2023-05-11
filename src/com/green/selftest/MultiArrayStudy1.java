package com.green.selftest;

public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] score = {
                {90,80,70},
                {95,33,12},
                {100,100,88},
                {100,100,100},
        };
//

//        int[] t1 =score[1];
//        System.out.println(t1[1]);
//        System.out.println(score[1][1]);
        for (int i = 0; i < score.length; i++) {
            System.out.print("{ ");
            int innerArrLen = score[i].length;
            if(innerArrLen > 0){
                System.out.print(score[i][0]);
            }
            for (int j = 1; j < score[i].length; j++) {
                    System.out.printf(", %s ", score[i][j]);
            }
            System.out.println("},");
        }

    }
}
