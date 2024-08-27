package com.hitsuni.codingtest.backjoon.String;

import java.io.*;

public class Main11720 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int length = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int result = 0;
            for(int i = 0; i < length; i++) {
                result += str.charAt(i) - '0';
            }
            bw.write(result +"");
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
