package com.ohgiraffers.section03.Practice01;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* 프로그램 개요
         *   - 리모컨으로 기능을 제어할 수 있는 '스마트 램프 시스템'
         *
         *  시스템 요구사항
         *   1) 리모컨 : 전원켜기, 밝기 증가, 밝기 감소, 조명 변경 전원 끄기
         *   2) 램프 : 전원켜기, 밝기 증가, 밝기 감소, 조명 변경 전원 끄기
         *     - 램프는 꺼진 상태로 대기
         *     - 사용자가 램프의 전원을 킨다.
         *       이미 켜져있다면 다시 켤 수 없다.
         *     - 사용자가 밝기를 증가하면, 전원이 켜진 경우에만 밝기 증가가 가능하다.
         *     - 사용자가 밝기를 감소하면, 전원이 켜진 경우에만 밝기 증가가 가능하다.
         *     - 사용자가 조명 변경을 하면, 전원이 켜진 경우에만 조명 변경이 가능하다.
         *     - 사용자가 전원을 끄면, 전원켜기 외의 아무런 동작을 하지 않는다.
         *     - 밝기의 최소값은 0, 최대값은 100으로 벗어나는 동작을 했을 경우, 이미 밝기가 최소/최대라고 출력한다.
         * */

        /* 프로그램 설계하기
         *   1. 필요한 객체 도출
         *     - 사용자, 리모컨, 램프
         *
         *   2. 객체간 상호 작용
         *     - 리모컨(=램프)이 수신할 수 있는 메세지 (리모컨이 해야하는 일)
         *       1) 전원 켜기
         *       2) 밝기 증가
         *       3) 밝기 감소
         *       4) 조명 변경
         *       5) 전원 끄기
         * */

        RemoteControl remote = new RemoteControl();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("💡💡💡💡💡스마트 램프 연동 어플 💡💡💡💡💡");
            System.out.println("1. 전원 켜기");
            System.out.println("2. 밝기 증가");
            System.out.println("3. 밝기 감소");
            System.out.println("4. 조명 변경");
            System.out.println("5. 전원 끄기");
            System.out.println("10. 어플 종료");
            System.out.println("메뉴 선택 : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 :
                    remote.turnOn();
                    break;

                case 2 :
                    remote.upBrightness();
                    break;

                case 3 :
                    remote.downBrightness();
                    break;

                case 4 :
                    remote.changeColor();
                    break;

                case 5 :
                    remote.turnOff();
                    break;

                case 10 :
                    System.out.println("스마트 램프 어플을 종료합니다.");
                    break;

                default :
                    System.out.println("잘못된 번호를 선택하셨습니다.");
                    break;
            }

            if (choice == 10) {
                break;
            }
        }

    }
}
