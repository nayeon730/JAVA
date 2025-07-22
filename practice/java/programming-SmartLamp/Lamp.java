package com.ohgiraffers.section03.Practice01;

public class Lamp {


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

    private boolean isOn;       // 1) 전원
    private int brightness;     // 2) 밝기
    private String lightColor = "주광색";     // 3) 조명 종류


    /* tt. 1) 전원 켜기 */
    public void turnOn() {
        if (isOn) {
            System.out.println("이미 램프가 켜져있습니다.");
        } else {
            this.isOn = true;
            System.out.println("램프가 켜졌습니다.");
        }
    }

    /* tt. 2) 밝기 증가 */
    public void upBrightness() {
        if (isOn) {
            if (brightness < 100) {
                this.brightness += 10;
                System.out.println("밝기를 10 증가시켰습니다.");
                System.out.println("현재 램프의 밝기는 " + this.brightness + "입니다.");
            } else {
                System.out.println("이미 최대 밝기입니다.");
            }
        } else {
            System.out.println("전원이 켜져있지 않습니다. 전원을 켜주세요.");
        }
    }

    /* tt. 3) 밝기 감소 */
    public void downBrightness() {
        if (isOn) {
            if (brightness > 0) {
                this.brightness -= 10;
                System.out.println("밝기를 10 감소시켰습니다.");
                System.out.println("현재 램프의 밝기는 " + this.brightness + "입니다.");
            } else {
                System.out.println("이미 최소 밝기입니다.");
            }
        } else {
            System.out.println("전원이 켜져있지 않습니다. 전원을 켜주세요.");
        }
    }

    /* tt. 4) 조명 변경 */
    public void changeColor() {
        if (isOn) {
            if (lightColor.equals("주광색")) {
                this.lightColor = "전구색";
                System.out.println("램프 조명이 '전구색'으로 변경되었습니다.");
            } else {
                this.lightColor = "주광색";
                System.out.println("램프 조명이 '주광색'으로 변경되었습니다.");
            }
        } else {
            System.out.println("전원이 켜져있지 않습니다. 전원을 켜주세요.");
        }
    }

    /* tt. 5) 전원 끄기 */
    public void turnOff() {
        if (isOn) {
            System.out.println("램프의 전원을 끕니다.");
        } else {
            System.out.println("이미 램프의 전원이 꺼져있습니다.");
        }
    }

    /* tt. 6) 프로그램 종료 */
}


