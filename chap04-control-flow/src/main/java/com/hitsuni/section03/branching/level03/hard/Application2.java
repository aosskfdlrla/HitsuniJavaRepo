package com.hitsuni.section03.branching.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        // 정답 난수 생성
        int correctNum = (int)(Math.random() * 100) + 1;

        // 시도횟수
        int count = 0;

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("정수를 입력하세요 : ");
            int inputNum = sc.nextInt();

            if(inputNum < correctNum)
                System.out.println("입력하신 정수보다 큽니다.");
            else
                System.out.println("입력하신 정수보다 작습니다.");

            count++;

            if(inputNum == correctNum) {
                System.out.println("정답입니다." + count + "회만에 정답을 맞추셨습니다.");
                break;
            }
        }
    }
}
