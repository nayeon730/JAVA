import java.util.Scanner;

public class Practice_3 {

        public void ifTest1() {

            System.out.println("*1번 문제*");

            //  tt.  반복문을 사용하여 1부터 100까지 더한 합계를 출력하세요.

            int sum = 0;

            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("1부터 100까지 더한 합계는 " + sum + "입니다.");
        }


        public void ifTest2() {

            System.out.println("*2번 문제*");

            /* tt. 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요. */

            Scanner sc = new Scanner(System.in);
            System.out.println("정수 하나를 입력하세용");
            int num = sc.nextInt();

            int sum = 0;
            int i = 1;
            while (i <= num) {    // i가 num(입력한 숫자)보다 작거나 같을동안
                sum += i;
                i++;
            }

            System.out.println("1부터 " + num + "까지의 합 : " + sum );
        }

        public void ifTest3() {

            System.out.println("*3번 문제*");

            /* tt. 3. 반복문을 사용하여 7단 구구단을 출력하세요. */

            for (int dan = 1; dan < 8; dan++) {     // 단의 조건

                for (int su = 1; su < 10; su++) {   // 수의 조건
                    System.out.println(dan + " * " + su + " = " + (dan * su));
                }
                System.out.println();   // 1단 연산 끝나면 *개행* -> 다시 1번_for문으로 올라가 2단 연산되도록
            }
        }


        public void ifTest4() {

            System.out.println("*4번 문제*");

            /* tt. 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요. */

            Scanner sc = new Scanner(System.in);
            System.out.println("정수 하나를 입력해주세요. : ");
            int num2 = sc.nextInt();

            int sum = 0;
            int i = 1;
            while (i <= num2) {
                sum += i;
                i++;
            }
            System.out.println("1부터 입력 받은 정수 " + num2 + "까지의 합계는 " + sum + "입니다.");
        }


        public void ifTest5() {

            System.out.println("*5번 문제*");

            /* tt. 문자열을 입력 받아서 문자열을 각 인덱스별로 한 글자씩 출력하세요. */

            Scanner sc = new Scanner(System.in);
            System.out.println("문자열 입력 : ");
            String str = sc.nextLine();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                System.out.println(i + " : " + ch);
            }

            int i = 0;
            while (i < str.length()) {
                char ch = str.charAt(i);
                System.out.println(i + " : " + ch);
                i++;
            }
        }


        public void ifTest6() {

            System.out.println("*6번 문제*");
            /*  tt. 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요. */

            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.print(ch);
                // 개행 O -> println
                // 개행 X -> print
            }
        }

        public void ifTest7() {

            System.out.println("*7번 문제*");

        /* tt. 정수를 입력받아 1부터 입력받은 정수까지
           tt. 홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요. */

            Scanner sc = new Scanner(System.in);
            System.out.println("정수를 입력하세요. : ");
            int num7  = sc.nextInt();

            for (int i = 1; i <= num7; i++) {
                if (i % 2 == 1) {
                    System.out.print("토");
                } else {
                    System.out.print("마");
                }
            }

        }
    }
