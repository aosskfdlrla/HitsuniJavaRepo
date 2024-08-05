package com.hitsuni.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String inputStr = sc.nextLine();

        System.out.print("검색할 문자를 입력하세요 : ");
        char inputCh = sc.next().charAt(0);

        printMessage(inputStr, inputCh, searchMethod(inputStr, inputCh));
    }

    public static int searchMethod(String str, char ch) {
        char[] carr = str.toCharArray();
        int searchCount = 0;
        for(char search : carr) {
            if(ch == search)
                searchCount++;
        }
        return searchCount;
    }

    public static void printMessage(String str, char ch, int count) {
        System.out.println("검색하진 문자열 " + str + "에서 찾으시는 문자 " + ch + "는 " + count + "개 입니다.");
    }
}
