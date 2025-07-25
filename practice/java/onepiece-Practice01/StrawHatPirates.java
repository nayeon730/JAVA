package com.ohgiraffers.Practice01;

public class StrawHatPirates implements Pirates, Berry {

    // 해적단(인터페이스)에서 상속 받을 클래스


    @Override
    public void fight() {

        System.out.println("밀짚모자 해적단은 전투 중입니다 . . . Fight!");

    }

    @Override
    public void run() {

        System.out.println("밀짚모자 해적단이 도망칩니다 . . . Run!");

    }

    @Override
    public void race() {

        System.out.println("..!");
    }
}
