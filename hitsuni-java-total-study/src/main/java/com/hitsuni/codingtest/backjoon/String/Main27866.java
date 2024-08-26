package com.hitsuni.codingtest.backjoon.String;

import java.io.*;

/* 백준 - 27866 번 문제 */
public class Main27866 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String str = br.readLine();
            int num = Integer.parseInt(br.readLine()) - 1;

            bw.write(str.charAt(num));
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
