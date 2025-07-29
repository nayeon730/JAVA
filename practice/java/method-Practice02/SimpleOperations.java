package com.ohgiraffers.Practice02;

import java.util.Scanner;

public class SimpleOperations {

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

    // 함수 호출 확인용 메소드
    public void printMessage() {

        System.out.println("메소드 호출 확인");
    }

    // start부터 end까지의 숫자들의 합을 리턴함
    public int sumNumbers(int start, int end) {

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    // 주어진 숫자가 짝수이면 true, 아니면 false를 리턴함
    public boolean isEvenNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 하나를 입력하세요.");
        int num = sc.nextInt();

        return num % 2 == 0;
        // 맞으면 true, 틀리면 false;

    }


    // 주어진 문자열에서 특정 문자의 개수를 리턴함
    public int countingCharacter() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\"안녕, 친구!\"를 영어로 작성하세요.");
        String input = sc.nextLine();

        System.out.println("");
        char ch = sc.next().charAt(0);  // 한 단어 중 첫 글자만 가져옴

        int count = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }


    // 주어진 문자열을 뒤집어서 리턴함
    public String reverseString() {

        Scanner sc = new Scanner(System.in);

        System.out.println("문자를 입력하세요.");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);    // () 안에 입력 받은 문자열 input을 넣음

        String re = "";

        for (int i = 0; i < input.length(); i++) {
            re += sb.reverse();
        }

        return re;
}



}
