package com.hitsuni.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        String[] strArr = {"딸기", "바나나", "복숭아", "키위", "사과"};
        int inputNum = 0;

        while(true) {
            inputNum = inputNumMethod();
            if(inputNum == 999) break;
            printFruit(inputNum, strArr);
        }
    }

    public static int inputNumMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요(종료는 999 입력) : ");
        return sc.nextInt();
    }

    public static void printFruit(int inputNum, String[] strArr) {
        if(inputNum > strArr.length - 1 || inputNum < 0)
            System.out.println("준비된 과일이 없습니다.");
        else
            System.out.println(strArr[inputNum]);
    }
}
