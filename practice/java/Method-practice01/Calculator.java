package com.ohgiraffers.practice01;

import java.util.Scanner;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10() {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
//        System.out.println("1부터 10까지의 합 : " + sum);
    }

    public void checkMaxNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.println("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("두 수 중 큰 수는 " + num1 + "이다.");
        } else {
            System.out.println("두 수 중 큰 수는 " + num2 + "이다.");
        }
    }

    public int sumTwoNumber(int a, int b) {

        int sum = a + b;
        return sum;
    }



    public int minusTwoNumber(int a, int b) {

        int min = a - b;
        return min;
    }


//+ checkMethod():void                    // 함수 호출 확인용 메소드
//+ sum1to10():int                        // 1부터 10까지 수를 더하여 값을 리턴함
//+ checkMaxNumber(a:int, b:int):void     // 두 수를 입력받아 큰 수를 출력함
//+ sumTwoNumber(a:int, b:int):int        // 두 수를 입력받아 합을 리턴함
//+ minusTwoNumber(a:int, b:int):int      // 두 수를 입력받아 차를 리턴함
//
//    메소드 호출 확인
//1부터 10까지의 합 : 55
//    두 수 중 큰 수는 20이다.
//10과 20의 합은 : 30
//            10과 5의 차는 : 5
//
}
