package com.ohgiraffers.practice01;

public class Application {

    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.checkMethod();

        int result;
         result = c.sum1to10();
        System.out.println(result);


        int result4 = c.sumTwoNumber(10, 20);
        System.out.println("10과 20의 합 : " + result4);


        int result5 = c.minusTwoNumber(10, 5);
        System.out.println("10과 5의 차이는 " + result5);
    }


}
