package com.hitsuni.codingtest.backjoon.String;

import java.io.*;

/* 백준 - 2743번 문제 */
public class Main2743 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String str = br.readLine();
            bw.write(str.length()+"");
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
