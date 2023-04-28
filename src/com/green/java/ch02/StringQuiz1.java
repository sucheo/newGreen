package com.green.java.ch02;

public class StringQuiz1 {
    public static void main(String[] args) {
        String fullFileNm = "newjeans.jpg";
        String fileNm, ext;
        int dotIdx = fullFileNm.indexOf(".");
        int dotIdx2 = fullFileNm.lastIndexOf(".");


        fileNm = fullFileNm.substring(0,dotIdx);
        ext = fullFileNm.substring(dotIdx+1);
        System.out.println("fileNm : " + fileNm);
        System.out.println("ext : " + ext);
        System.out.println();

    }
}
