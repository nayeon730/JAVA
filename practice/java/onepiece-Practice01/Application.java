package com.ohgiraffers.Practice01;

import java.util.PrimitiveIterator;

public class Application {

    public static void main(String[] args) {

        // (부모 인터페이스) (참조변수) = new (자식 클래스)
        Pirates pirates = new StrawHatPirates();

        // 인터페이스 안의 추상메소드를 자식클래스에 오버라이딩 -> 동적바인딩
        System.out.println("========== 인터페이스 : 동적 바인딩 ==========");
        pirates.fight();
        pirates.run();


        System.out.println();

        // 상수 필드를 출력 : 인터페이스명.변수
        System.out.println("========== 인터페이스 : 상수 필드 출력 ==========");
        System.out.println("밀짚모자 해적단의 공격력은 " + Pirates.attack + "입니다. Strong ...!");



        System.out.println();
        /* tt. 루피는 밀짚모자해적단의 기능만 참조할 수 있다. -> 루피만의 메서드는 사용 불가 */
        System.out.println("========== 다형성 : 자식 인스턴스를 부모 타입으로 주소값 저장 ==========");
        StrawHatPirates Luffy1 = new Luffy();
        Luffy1.fight();
        Luffy1.run();
//        Luffy.skill();    ---> 루피의 고유 메서드는 사용 불가

        System.out.println();
        StrawHatPirates Zoro1 = new Zoro();
        Zoro1.fight();
        Zoro1.run();
//        Zoro.famousLine();    ---> 조로의 고유 메서드는 사용 불가



        System.out.println();
        /* tt. 타입 형변환 -> 루피는 밀짚모자해적단의 기능 + 루피만의 메서드도 사용 가능 */
        System.out.println("========== 타입 형변환 : 밀짚모자해적단 + 루피 모두의 기능 참조 ==========");
        ((Luffy) Luffy1).skill();
        // ㄴ> 부모(밀짚모자해적단)의 타입이었던 루피1을 자식(루피) 타입으로 형변환 : 부모/자식 타입 둘다 가짐

        ((Zoro) Zoro1).FamousLine();
        // ㄴ> 부모(밀짚모자해적단)의 타입이었던 조로1을 자식(조로) 타입으로 형변환 : 부모/자식 타입 둘다 가짐


        System.out.println();
        /* tt. instance of 연산자 사용하여 타입 확인 */
        System.out.println("========== instance of : 타입 확인 ==========");
        System.out.println("루피1이 Luffy 타입인지 확인 : " + (Luffy1 instanceof Luffy));
        System.out.println("루피1이 Luffy 타입인지 확인 : " + (Zoro1 instanceof Zoro));
        System.out.println("루피1이 Luffy 타입인지 확인 : " + (Luffy1 instanceof StrawHatPirates));


        System.out.println();
        /* tt. if + instance of + 형변환 사용 */
        System.out.println("========== if 형변환 ==========");
        // 만약 루피1(참조변수)이 루피(자식) 타입이면 -> 루피1을 루피 타입으로 형변환 -> 루피 고유의 메서드를 참조
        if (Luffy1 instanceof Luffy) {
            ((Luffy) Luffy1).skill();
        }

        // 조로1은 루피 타입이 아니므로, 아무 동작도 일어나지 않음
        if (Zoro1 instanceof Luffy) {
            ((Luffy) Zoro1).skill();
        }
    }
}
