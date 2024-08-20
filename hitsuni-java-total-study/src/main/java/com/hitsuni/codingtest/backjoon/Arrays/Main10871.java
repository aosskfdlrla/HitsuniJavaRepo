package com.hitsuni.codingtest.backjoon.Arrays;

import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

/* 백준 - 10871번 */
public class Main10871 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            int lowNum = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < num; i++) {
                int find = Integer.parseInt(st.nextToken());
                if(lowNum > find) {
                    bw.write(find+" ");
                }
            }
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
