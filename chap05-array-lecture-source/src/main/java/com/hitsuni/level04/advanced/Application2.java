package com.hitsuni.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 숫자 야구 게임 */
        /* 1. 필요한 변수 선언 */
        int leftTryNum = 10;
        int countStrike = 0;
        int countBall = 0;
        boolean sameNum = false;
        String inputNumStr = "";
        int[] answerNumArr = new int[4];

        /* 2. 중복 없이 배열에 난수 삽입 */
        for(int i = 0, value = 0; i < answerNumArr.length; i++) {
            value = (int)(Math.random() * 9);
            for (int k : answerNumArr) {
                if (k == value) {
                    sameNum = true;
                    break;
                }
            }

            if(sameNum) {
                i--;
                sameNum = false;
            } else {
                answerNumArr[i] = value;
            }
        }

        while(leftTryNum > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("네 자리 숫자를 입력하세요 : ");
            inputNumStr = sc.nextLine();

            if(checkInputNum(inputNumStr)){
                System.out.println(resultNumBaseGame(inputNumStr, answerNumArr, countBall, countStrike));
            } else {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                System.out.println(leftTryNum + "회 남으셨습니다.");
            }
        }

    }

    public static boolean checkInputNum(String inputNumStr) {
        char[] checkChArr = inputNumStr.toCharArray();

        if(checkChArr.length != 4)
            return false;

        for(int ch : checkChArr) {
            if(ch < 48 || ch > 57)
                return false;
        }
        return true;
    }

    public static String resultNumBaseGame(String inputNumStr, int[] answerNumArr, int countBall, int countStrike) {
        char[] tumpArr = inputNumStr.toCharArray();
        int[] checkNumArr = new int[4];
        for(int i = 0; i < checkNumArr.length; i++) {
            checkNumArr[i] = Integer.parseInt(String.valueOf(tumpArr[i]));
        }

        /* 볼 판정 */
        for (int j : answerNumArr) {
            for (int k : checkNumArr) {
                if (j == k)
                    countBall++;
            }
        }

        /* 스트라이크 판정 */
        for(int i = 0; i < answerNumArr.length; i++) {
            if(answerNumArr[i] == checkNumArr[i])
                countStrike++;
        }

        return countStrike + "S" + countBall + "B";
    }
}
