import java.util.Scanner;

public class Practice_4 {

    public static void main(String[] args) {

        Practice_4 p = new Practice_4();
//        p.practice1();
//        p.practice2();
//        p.practice3();
//        p.practice4();
//        p.practice5();
//        p.practice6();
//        p.practice7();
//        p.practice8();
        p.practice9();
    }

    public void practice1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }

    public void practice2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int num2 = sc.nextInt();

        if (num2 > 0) {
            if (num2 % 2 == 0) {
                System.out.println("양수이면서, 짝수");
            } else {
                System.out.println("양수이면서, 홀수");
            }
        } else {
            System.out.println("양수가 아님");
        }
    }

    public void practice3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        int num3 = sc.nextInt();

        if (num3 != 0) {
            if (num3 > 0) {
                System.out.println("양수");
            } else {
                System.out.println("음수");
            }
        } else {
            System.out.println("0");
        }
    }

    public void practice4() {

        Scanner sc = new Scanner(System.in);
        System.out.println("이름 입력 : ");
        String name = sc.nextLine();

        System.out.println("점수 입력 : ");
        int point = sc.nextInt();

        String grade = "";

        if (point >= 90) {
            grade = "A";
            if (point >= 95) {
                grade += "+";
            }
        } else if (point >= 80) {
            grade = "B";
            if(point >= 85) {
                grade += "+";
            }
        } else if (point >= 70) {
            grade = "C";
            if (point >= 75) {
                grade += "+";
            }
        } else if (point >= 60) {
            grade = "D";
            if (point >= 65) {
                grade += "+";
            }
        } else {
            grade = "F";
        }

        System.out.println(name + " 학생의 점수는 " + grade + "입니다.");
    }

    public void practice5() {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력 : ");
        int first = sc.nextInt();

        System.out.println("두번째 숫자 입력 : ");
        int second = sc.nextInt();

        System.out.println("연산 기호 입력 : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op) {
            case '+' :
                result = first + second;
                break;

            case '-' :
                result = first - second;
                break;

            case '*' :
                result = first * second;
                break;

            case '%' :
                result = first % second;
                break;
        }
        System.out.println(first + "" + op + "" + second + " = " + result);
    }

    public void practice6() {

        System.out.println("apple, banana, orange, melon 중 과일을 선택하시오.");
        Scanner sc = new Scanner(System.in);
        String select = sc.nextLine().toLowerCase();    /* tt. tolowercase() : 소문자로 변환 */

        int price = 0;

        String order = "";

        switch (select) {
            case "apple" :
                order = "apple";
                price = 1000;
                break;

            case "banana" :
                order = "banana";
                price = 2000;
                break;

            case "orange" :
                order = "orange";
                price = 3000;
                break;

            case "melon" :
                /* tt. case "Melon" : 혹은 이렇게 써도 됨 */
                order = "melon";
                price = 4000;
                break;
        }
        System.out.println("선택하신 " + order + "(는)은 " + price + "입니다.");
    }

    public void practice7() {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "번째 학생 이름 입력 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생 이름은 " + student + "입니다.");
        }
    }

    public void practice8() {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1~10의 합계 : " + sum);
    }

    public void practice9() {

        // 10~21 사이의 정수인 난수를 생성 -> 1부터 난수까지의 합계

        int random = (int) (Math.random() * 12) + 10;

        int sum = 0;

        for (int i = 1; i <=random; i++) {
            sum += i;
        }
        System.out.println("1부터 " + random + "까지의 합은 " + sum);
    }
}


