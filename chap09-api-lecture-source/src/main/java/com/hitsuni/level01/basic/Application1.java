package com.hitsuni.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */
        String[] str = null;
        StringBuilder strBuild= null;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("문자열 입력 : ");
            str = (br.readLine()).split(" ");
            strBuild = new StringBuilder();
            for(String word : str) {
                strBuild.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("빈환된 문자열 : " + strBuild);
        System.out.println("총 단어 개수 : " + str.length);
    }
}
