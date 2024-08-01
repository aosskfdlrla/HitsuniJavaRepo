package com.hitsuni.section02.looping;

import java.util.Scanner;

public class NestLoopFor {
    public void printGugGugDanFromTwotoNine() {
        /* 구구단 2단부터 9단까지 출력하기 */
        for(int i = 2; i <= 9; i++) {
            System.out.println("==== 구구단 " + i + "단 ====");
            for(int j = 1; j <= 9; j++) {
                System.out.println("     " + i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }

    public void printStarInputRowTimes() {
        /* 입력받은 정수만큼 한 행에 '*' 5개씩 출력 */
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수 입력: ");
        int row = sc.nextInt();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangleStar() {
        /* 입력받은 정수만큼 한 행에 '*' 행의 번호개씩 출력
         * *
         * **
         * ***
         * ****
         * ***** */
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수 입력: ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}