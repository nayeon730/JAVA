import java.util.Scanner;

public class Practice_2 {

    public static void main(String[] args) {
        Practice_2 p = new Practice_2();  // 객체 생성

        p.practiceIf1();
        p.practiceIf2();
        p.practiceIf3();
        p.practiceIf4();
        p.practiceIf5();
        p.practiceIf6();
        p.practiceIf7();
    }

    public void practiceIf1() {
        System.out.println("*7번 문제*");

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 한 개를 입력하세요. : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("양수다.");
        } else {
            System.out.println("양수가 아니다.");
        }
    }

    public void practiceIf2() {
        System.out.println("*8번 문제*");

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 한 개를 입력하세요. :");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수다.");
        } else {
            System.out.println("홀수다.");
        }
    }

    public void practiceIf3() {
        System.out.println("*9번 문제*");

        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요.");
        String name = sc.nextLine();

        System.out.println("생일의 달을 숫자로 입력해주세요.");
        int month = sc.nextInt();

        System.out.println("생일의 일을 숫자로 입력해주세요.");
        int day = sc.nextInt();

        if (month <= 6) {
            if (day <= 15) {
                System.out.println(name + "님의 선물은 배민 쿠폰입니다.");
            } else {
                System.out.println(name + "님의 선물은 사탕입니다.");
            }
        } else if (month >= 7) {
            if (day >= 16) {
                System.out.println(name + "님의 선물은 스타벅스 쿠폰입니다.");
            } else {
                System.out.println(name + "님의 선물은 사탕입니다.");
            }
        }
    }

    public void practiceIf4() {
        System.out.println("*10번 문제*");

        Scanner sc = new Scanner(System.in);
        System.out.println("나이가 어떻게 되세요?");
        int age = sc.nextInt();

        if (age <= 19) {
            System.out.println("판매 불가능합니다.");
        } else {
            System.out.println("판매 가능합니다.");
        }
    }

    public void practiceIf5() {
        System.out.println("*11번 문제*");

        Scanner sc = new Scanner(System.in);
        System.out.println("당첨 번호가 어떻게 되세요?");
        int num = sc.nextInt();

        if (num >= 1 && num <= 10) {
            if (num % 2 == 1) {
                System.out.println("홀수네요, 인형 선물입니다!");
            } else {
                System.out.println("짝수네요, 모자 선물입니다!");
            }
        } else {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        }
    }

    public void practiceIf6() {
        System.out.println("*12번 문제*");

        Scanner sc = new Scanner(System.in);

        System.out.print("성실 점수 : ");
        int num1 = sc.nextInt();

        System.out.print("서비스 점수 : ");
        int num2 = sc.nextInt();

        System.out.print("미소 점수 : ");
        int num3 = sc.nextInt();

        int average = (num1 + num2 + num3) / 3;

        if (average >= 60) {
            if (num1 >= 40 && num2 >= 40 && num3 >= 40) {
                System.out.println("합격입니다!");
            } else if (num1 < 40) {
                System.out.println("성실 항목의 점수 미달로 불합격입니다.");
            } else if (num2 < 40) {
                System.out.println("서비스 항목의 점수 미달로 불합격입니다.");
            } else if (num3 < 40) {
                System.out.println("미소 항목의 점수 미달로 불합격입니다.");
            }
        } else {
            System.out.println("평균 점수 미달로 불합격입니다.");
        }
    }

    public void practiceIf7() {
        System.out.println("*13번 문제*");

        Scanner sc = new Scanner(System.in);

        System.out.print("월 급여 입력 : ");
        int salary = sc.nextInt();

        System.out.print("매출액 입력 : ");
        int sales = sc.nextInt();

        double bonus = 0.0;

        if (sales >= 50000000) {
            bonus = 0.05;
        } else if (sales >= 30000000 && sales < 50000000) {
            bonus = 0.03;
        } else if (sales >= 10000000 && sales < 30000000) {
            bonus = 0.01;
        } else {
            bonus = 0;
        }

        double total = salary + (sales * bonus);

        System.out.println("======================");
        System.out.println("매출액 : " + sales + "원");
        System.out.println("보너스율 : " + (int) (bonus * 100) + "%");
        System.out.println("월 급여 : " + salary + "원");
        System.out.println("보너스 금액 : " + (sales * bonus) + "원");
        System.out.println("======================");
        System.out.println("총 급여 : " + (int) total + "원");
    }
}