package com.hitsuni.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        /* 5명의 자바 점수를 입력 받아 합계의 평균을 실수로 구하는 프로그램 */
        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < scores.length; i++) {
            System.out.print((i+1) + "번쨰 학생의 점수 입력 : ");
            scores[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i : scores) {
            sum += i;
        }

        double avg = (double) sum / scores.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
