package com.hitsuni.section02.looping;

import java.util.Scanner;

public class LoopFor {
    public void testSimpleForState() {
        for(int i = 0; i < 10; i++){
            System.out.println("출력 : " + i);
        }
    }

    public void testForExample() {
        /* 1 ~ 10까지 합계 구하기 */
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }

        System.out.println("sum = " + sum);
    }

    public void testForExample2() {
        /* 5 ~ 10 사이의 난수를 발생시커 1부터 발생한 난수까지의 합 구하기 */
        int sum = 0;
        int random = (int)(Math.random() * 6) + 5;

        for(int i = 1; i <= random; i++) {
            sum += i;
        }

        System.out.println("1부터 " + random + "까지의 합계" + sum);
    }

    public void testForExample3() {
        /* 숫자 2개를 입력 받아 작은 수에서 큰 수까지의 합계를 구한다.
         * 동일한 숫자는 입력하지 않는다는 가정으로 해결된다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int firstNum = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int secondNum = sc.nextInt();
        int sum = 0;

        /* first, second 중 어떤 것이 작은 수이고 큰 수인지 먼저 판별한 뒤 합계를 구한다. */
        int max = 0;
        int min = 0;

        if(firstNum > secondNum) {
            max = firstNum;
            min = secondNum;
        } else {
            max = secondNum;
            min = firstNum;
        }

        for(int i = min; i <= max; i++) {
            sum += i;
        }

        System.out.println(min + "에서부터 " + max + "까지의 합계는 " + sum);
    }

    public void printSimpleGugGuDan() {
        /* 사용자가 입력하는 단의 구구단을 출력하기 */
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 수 : ");
        int danNum = sc.nextInt();

        if(danNum >= 2 && danNum <= 9) {
            for(int i = 1; i <= 9; i++){
                System.out.println(danNum + " * " + i + " = " + danNum * i);
            }
        } else {
            System.out.println("반드시 2 ~ 9 사이의 양수를 입력하셔야 합니다.");
        }
    }
}
