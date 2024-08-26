package com.hitsuni.codingtest.backjoon.String;

import java.io.*;

public class Main11654 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String str = br.readLine();
            int strNum = str.charAt(0);
            bw.write(String.valueOf(strNum));
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
