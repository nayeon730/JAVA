package com.ohgiraffers.Practice;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        System.out.println("*9번 문제*");

        String[] fruits = {"딸기", "바나나", "복숭아", "키위", "사과"};

        Scanner sc = new Scanner(System.in);
        System.out.println("0부터 4까지의 정수 하나를 입력하세요. : ");
        int select = sc.nextInt();

        if (select > 0 && select < 5) {
            System.out.println(fruits[select]);
        } else {
            System.out.println("준비된 과일이 없습니다.");
        }
    }
}
