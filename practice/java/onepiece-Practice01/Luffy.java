package com.ohgiraffers.Practice01;

/* tt. 밀짚모자 해적단 (StrawHatPirates) 을 상속 받음 */
public class Luffy extends StrawHatPirates {

    // 인터페이스1) Pirates
    @Override
    public void fight() {

        System.out.println("루피가 전투 중입니다. . . Fightttt!");
    }

    @Override
    public void run() {

        System.out.println("루피가 도망칩니다. . . Runnnn!");
    }

    // 인터페이스2) Berry
    @Override
    public void race() {
        System.out.println("루피는 악마의 열매 능력자입니다..!");
    }

    // Luffy만의 메소드
    public void skill() {
        System.out.println("루피가 악마의 열매 능력을 씁니다. 고무 고무~~~~~~~~~~!!!!!!!!!");
    }
}
