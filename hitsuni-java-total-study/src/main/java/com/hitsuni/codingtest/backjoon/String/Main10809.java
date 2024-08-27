package com.hitsuni.codingtest.backjoon.String;

import java.io.*;

/* 백준 - 10809 번 문제 */
public class Main10809 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String str = br.readLine();

            for(int i = 'a'; i <= 'z'; i++) {
                int result = str.indexOf(i);
                bw.write(result + " ");
            }

            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
