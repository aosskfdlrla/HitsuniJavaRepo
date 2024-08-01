package com.hitsuni.section01.conditional;

import java.util.Scanner;

public class SwitchNum {
    public void testSimpleSwitchStatement() {
        /* Switch 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력: ");
        char op = sc.next().charAt(0);
        int result = 0;

        /* double switch 사용하기에는 부적합. */
        switch(op) {
            case '+':
                System.out.println("더하기 연산 실행");
                result = first + second;
                break;
            case '-': result = first - second;
                break;
            case '*': result = first * second;
                break;
            case '/': result = first / second;
                break;
            case '%': result = first % second;
                break;
            default:
                System.out.println("입력하신 값이 부정확합니다. 프로그램을 종료합니다.");
        }

        System.out.println(first + " " + op + " " + second + " = " + result);
    }

    public void improvedSwitchStatement() {
        /* java 14부터 적용된 개선 된 switch 문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력: ");
        char op = sc.next().charAt(0);

        /* double switch 사용하기에는 부적합.
         * -> 사용하면 break 빼고 사용이 가능함.
         * 한 줄 이상의 명령문을 작성하고 싶으면 { } 대괄호를 작성해야 함.
         * 값을 리턴할 수 있음 단, 반드시 default 있어야 함.
         * yield 키워드 : 값을 명시적으로 리턴
         * */
        int result = switch (op) {
            case '+' -> {
                System.out.println("더하기 연산 실행");
                yield first + second;
            }
            case '-' -> {
                System.out.println("뺴기 연산 실행");
                yield first - second;
            }
            case '*' -> first * second;
            case '/' -> first / second;
            case '%' -> first % second;
            default -> 0;
        };

        System.out.println(first + " " + op + " " + second + " = " + result);
    }
}
