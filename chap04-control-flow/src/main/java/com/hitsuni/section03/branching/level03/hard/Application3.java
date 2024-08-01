package com.hitsuni.section03.branching.level03.hard;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        label:
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("문자열 입력 : ");
            String inputStr = sc.nextLine();

            for(int i = 0; i < inputStr.length(); i++) {
                char ch = inputStr.charAt(i);
                if(ch < 'A' || ch > 'z') {
                    System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                    continue label;
                }
            }

            System.out.print("문자 입력 : ");
            char inputChar = sc.next().charAt(0);
            int charCount = 0;

            for(int i = 0; i < inputStr.length(); i++) {
                char ch = inputStr.charAt(i);
                if(ch == inputChar)
                    charCount++;
            }

            if(charCount != 0){
                System.out.println(inputChar + "가 포함된 갯수 : " + charCount + "개");
                break;
            }
        }
    }
}
