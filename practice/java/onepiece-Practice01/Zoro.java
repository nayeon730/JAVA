package com.ohgiraffers.Practice01;

/* tt. 밀짚모자 해적단 (StrawHatPirates) 을 상속 받음 */
public class Zoro extends StrawHatPirates {

    // 인터페이스1) Pirates
    @Override
    public void fight() {
        System.out.println("조로가 전투 중입니다 . . . 삼도류!");
    }

    @Override
    public void run() {
        System.out.println("조로가 도망칩니다 . . . 어라? 길을 잃었습니다..");
    }

    // 인터페이스2) Berry
    @Override
    public void race() {
        System.out.println("조로는 악마의 열매 능력자가 아닙니다..!");
    }

    // 조로만의 메소드
    public void FamousLine() {
        System.out.println("등짝의 상처는 검사의 수치다...!!");
    }
}
