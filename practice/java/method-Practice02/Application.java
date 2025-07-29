package com.ohgiraffers.Practice02;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

    //+ printMessage():void                         // 함수 호출 확인용 메소드
    //+ sumNumbers(start:int, end:int):int          // start부터 end까지의 숫자들의 합을 리턴함
    //+ isEvenNumber(num:int):boolean               // 주어진 숫자가 짝수이면 true, 아니면 false를 리턴함
    //+ countCharacter(input:String, ch:char):int   // 주어진 문자열에서 특정 문자의 개수를 리턴함
    //+ reverseString(input:String):String          // 주어진 문자열을 뒤집어서 리턴함

            // 출력 예시
    //        메소드 호출 확인
    //        1부터 10까지의 숫자들의 합은 : 55
    //        10은 짝수입니다.
    //        "Hello World"에서 'o'의 개수는 : 2
    //        "Hello World"를 뒤집은 결과는 : dlroW olleH

        SimpleOperations so = new SimpleOperations();

        //        메소드 호출 확인
        so.printMessage();

        //        1부터 10까지의 숫자들의 합은 : 55
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력해주세요.");
        int start = sc.nextInt();

        System.out.println("두 번째 정수를 입력해주세요.");
        int end = sc.nextInt();

        int result = so.sumNumbers(start, end);
        System.out.println(start + "부터 " + end + "까지의 합은 : " + result);




        //        10은 짝수입니다.

        //        "Hello World"에서 'o'의 개수는 : 2

        //        "Hello World"를 뒤집은 결과는 : dlroW olleH

    }
}
