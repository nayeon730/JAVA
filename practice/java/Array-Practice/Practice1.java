package com.ohgiraffers.Practice;

public class Practice1 {

    public static void main(String[] args) {

        System.out.println("*8번 문제*");
//   길이가 10인 정수형 배열을 선언 및 할당한 뒤
//   각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요.

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }

//        for (int i = 0, value = 1; i < arr.length; i++, value++) {
//            arr[i] = value;
//            System.out.println(arr[i]);
//        }

    }
}
