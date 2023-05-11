package com.green.selftest;

public class forfor {

        public static void main(String[] args) {
            int[][] score = {
                    {90, 80, 70},
                    {95, 33, 12},
                    {100, 100, 88},
                    {100, 100, 100},
            };
            for (int i = 0; i < score.length; i++) {
              printArr(score[i]);
            };
        }
        public static void printArr(int[] num){
            int idx = num.length;

            if(idx >0){
                System.out.print("{ " + num[0]);
            for (int i = 1; i < num.length; i++) {
                System.out.printf(",%s",num[i]);

            }

                System.out.print("}\n");
            }
        }
}
