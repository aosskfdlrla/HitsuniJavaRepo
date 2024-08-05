package com.hitsuni.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int inputNum = sc.nextInt();

        if(inputNum % 2 != 1)
            System.out.println("양수 혹은 홀수만 입력해야합니다.");
        else {
            int[] intArr = new int[inputNum];
            int center = (intArr.length) / 2 + 1;

            for(int i = 1, value = center; i <= intArr.length; i++) {
                if(i > center) {
                    intArr[i - 1] = --value;
                } else {
                    intArr[i - 1] = i;
                }
            }

            for(int c : intArr) {
                System.out.print(c + " ");
            }
        }
    }
}
