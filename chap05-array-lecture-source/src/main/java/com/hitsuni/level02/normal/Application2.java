package com.hitsuni.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        String inputCitizenNum = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("주민증록번호를 입력하세요 : ");
        inputCitizenNum = sc.nextLine();

        // 문자열 가공
        char[] tumpChArr = inputCitizenNum.toCharArray();
        for(int i = 8; i < tumpChArr.length; i++) {
            tumpChArr[i] = '*';
        }

        String outPutCitizenNum = "";
        for (char c : tumpChArr) {
            outPutCitizenNum += c;
        }

        System.out.println(outPutCitizenNum);
    }
}
