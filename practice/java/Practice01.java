package com.ohgiraffers.practice.java;

public class Practice01 {
    public static void main(String[] args) {

        System.out.println("*1번 문제*");
        byte bnum1 = 20;
        byte bnum2 = 30;
        System.out.println("더하기 결과 : " + (bnum1 + bnum2));
        System.out.println("더하기 결과 : " + (bnum1 - bnum2));
        System.out.println("더하기 결과 : " + (bnum1 * bnum2));
        System.out.println("더하기 결과 : " + (bnum1 / bnum2));
        System.out.println("더하기 결과 : " + (bnum1 % bnum2));


        System.out.println("*2번 문제*");
        double width = 12.5;
        double height = 36.4;
        System.out.println("면적 : " + (width * height));
        System.out.println("둘레 : " + (2 * (width + height)));


        System.out.println("*3번 문제*");
        double kr = 80.5;
        double ma = 50.6;
        double en = 70.8;

        double sum = kr + ma + en;  // 합계 (실수)
        double average = sum / 3;   // 평균 (실수)

        int result1 = (int) sum;    // 실수인 sum을 정수(int)로 바꿀거야
        int result2 = (int) average;    // 실수인 average를 정수(int)로 바꿀거야

        System.out.println(result1);
        System.out.println(result2);
    }
        }

