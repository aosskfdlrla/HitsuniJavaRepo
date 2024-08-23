package com.hitsuni.codingtest.backjoon.Arrays;

import java.io.*;
import java.util.StringTokenizer;

/* 백준 - 10813번 공 바꾸기 문제 */
public class Main10813 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int bagNum = Integer.parseInt(st.nextToken());
            int change = Integer.parseInt(st.nextToken());
            int[] bags = new int[bagNum];
            // 바구니 번호대로 배열 초기화
            for(int i=0; i < bags.length; i++)
                bags[i] = i + 1;

            // swap
            for(int i=0; i < change; i++) {
                st = new StringTokenizer(br.readLine());
                int num1 = Integer.parseInt(st.nextToken()) - 1;
                int num2 = Integer.parseInt(st.nextToken()) - 1;

                int dump = bags[num2];
                bags[num2] = bags[num1];
                bags[num1] = dump;
            }

            for(int bag : bags) {
                sb.append(bag);
                sb.append(" ");
            }

            sb.deleteCharAt(sb.length() - 1);
            bw.write(sb.toString());
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
