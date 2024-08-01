package com.hitsuni.section03.branching.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        label:
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("문자열을 입력하세요 : ");
            String inputStr = sc.nextLine();

            for(int i = 0; i < inputStr.length(); i++) {
                char ch = inputStr.charAt(i);
                if(ch < 'A' || ch > 'z') {
                    System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                    continue label;
                }
            }

            System.out.print("숫자를 입력하세요 : ");
            int inputInt = sc.nextInt();
            String resultStr = "";

            for(int i = 0; i < inputStr.length(); i++) {
                char tumpCh = getTumpCh(inputStr, i, inputInt);
                resultStr += tumpCh;
            }

            System.out.println(resultStr);
            break;
        }
    }

    private static char getTumpCh(String inputStr, int i, int inputInt) {
        char tumpCh = inputStr.charAt(i);
        for(int j = 0; j < inputInt; j++) { // 해당 문자 입력한 숫자만큼 증가
            if(tumpCh >= 'A' && tumpCh <= 'Z'){ // 해당 문자 대문자일 경우
                tumpCh++; // 문자 증가
                if(tumpCh >'Z') tumpCh = 'A'; // Z 를 넘어가면 A로 맞춰준다.
            } else if(tumpCh >= 'a' && tumpCh <= 'z') { // 해당 문자 소문자일 경우
                tumpCh++; // 문자 증가
                if (tumpCh > 'z') tumpCh = 'a'; // z 를 넘어가면 a로 맞춰준다.
            }
        }
        return tumpCh;
    }
}
