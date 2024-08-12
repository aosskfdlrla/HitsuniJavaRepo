package com.hitsuni.codingtest_programers;

import java.util.Arrays;

public class StrangeMakeChar {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        String[] dumpArr = s.split("");
        int cnt = 0;
        String result = "";
        for(String str : dumpArr) {
            cnt = str.contains(" ") ? 0 : cnt + 1;
            if(cnt % 2 == 0)
                result += str.toLowerCase();
            else
                result += str.toUpperCase();
//            if(cnt % 2 == 0)
//                result += str.toUpperCase();
//            else
//                result += str.toLowerCase();
        }

        return result;
    }
}
