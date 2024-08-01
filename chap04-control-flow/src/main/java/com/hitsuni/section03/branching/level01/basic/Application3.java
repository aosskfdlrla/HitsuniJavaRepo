package com.hitsuni.section03.branching.level01.basic;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int inputNum = sc.nextInt();
        int i = 1;
        int sum = 0;

        while(true) {
            if(i % 2 == 0) {
                sum += i;
            }

            if(i > inputNum) {
                System.out.println("1부터 " + inputNum + "까지 짝수의 합 : " + sum);
                break;
            }

            i++;
        }
    }
}
