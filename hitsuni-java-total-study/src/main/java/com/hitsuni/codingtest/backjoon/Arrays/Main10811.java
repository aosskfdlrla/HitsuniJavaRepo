package com.hitsuni.codingtest.backjoon.Arrays;

import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

/* 백준 10811번 문제 - 바구니 뒤집기
* 왜 while 문을 돌려서 할 생각을 못했을까 어차피 같은 반복문이라 그런가...
* */
public class Main10811 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int bagNum = Integer.parseInt(st.nextToken());
            int change = Integer.parseInt(st.nextToken());

            // 바구니 배열 셋팅
            int[] bags = new int[bagNum];
            for(int i=0; i<bags.length; i++)
                bags[i] = i + 1;

            // 바구니 뒤집기
            for(int i=0; i<change; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken()) - 1;
                int end = Integer.parseInt(st.nextToken()) - 1;

//                while(start < end) {
//                    int dump = bags[start];
//                    bags[start] = bags[end];
//                    bags[end] = dump;
//                    start++;
//                    end--;
//                }

                for(int j = start; j < end; j++, end--) {
                    int dump = bags[j];
                    bags[j] = bags[end];
                    bags[end] = dump;
                }
            }

            for(int arr : bags)
                bw.write(arr+" ");

            bw.flush();
            bw.close();

//            // 배열 뒤집는 거 샘플
//            for(int i = 0; i < (bags.length / 2); i++) {
//                int dump = bags[i];
//                bags[i] = bags[bags.length - 1 - i];
//                bags[bags.length - 1 - i] = dump;
//            }

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
