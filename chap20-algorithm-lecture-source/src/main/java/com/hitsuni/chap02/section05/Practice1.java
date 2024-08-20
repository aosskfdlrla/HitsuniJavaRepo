package com.hitsuni.chap02.section05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.TreeMap;

public class Practice1 {

    public String solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));

        int t = Integer.parseInt(br.readLine());    // 테스트 케이스 수

        for(int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());    // 연산의 수
            TreeMap<Integer, Integer> map = new TreeMap<>();    // 이중 우선순위 큐의 역할을 할 TreeMap
        }



        return null;
    }
}