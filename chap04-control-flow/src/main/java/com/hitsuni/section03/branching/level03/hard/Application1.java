package com.hitsuni.section03.branching.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
            int inputNum = sc.nextInt();
            boolean decimalStatus = false; // 소수가 아니라고 가정

            if(inputNum <= 2)
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            else {
                    for(int i = 2; i < inputNum; i++) {
                        if (inputNum % i != 0) // 입력한 정수까지 나머지 계산
                            decimalStatus = true; // 다 나머지가 있다면 true;
                        else if(inputNum % i == 0) {
                            decimalStatus = false;
                            break;
                        }
                    }
                }

            if(decimalStatus) {
                System.out.println("소수다.");
                break;
            }
        }
    }
}
