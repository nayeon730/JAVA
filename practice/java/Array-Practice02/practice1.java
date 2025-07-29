package com.ohgiraffers.Practice.Practice02;

public class practice1 {

    public static void main(String[] args) {

//        85, 90, 78

        int[] scores = {85, 90, 78};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {

            System.out.println("학생 " + (i + 1) + " : " + scores[i] + "점");
            sum += scores[i];
        }

        System.out.println("평균 점수는 " + (sum / 3) + "점입니다.");
    }
}
