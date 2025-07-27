package com.ohgiraffers.Practice.Practice02;

public class practice1 {

    public static void main(String[] args) {

//        85, 90, 78

        int[] scores = {85, 90, 78};
        int average = 0;

        for (int i = 0; i < scores.length; i++) {

            System.out.println("학생 " + (i + 1) + " : " + scores[i] + "점");
            average += scores[i];
        }

        System.out.println("평균 점수는 " + (average / 3) + "점입니다.");
    }
}
