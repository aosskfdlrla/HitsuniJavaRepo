package com.hitsuni.codingtest.backjoon.String;

import java.io.*;
import java.util.StringTokenizer;

public class Main2675 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;

            int strNum = Integer.parseInt(br.readLine());
            for(int i = 0; i < strNum; i++) {
                st = new StringTokenizer(br.readLine());
                int repeatNum = Integer.parseInt(st.nextToken());

            }

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
