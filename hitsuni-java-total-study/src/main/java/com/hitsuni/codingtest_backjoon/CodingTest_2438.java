package com.hitsuni.codingtest_backjoon;

import java.io.*;

public class CodingTest_2438 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int num = Integer.parseInt(br.readLine());
            for(int i=0; i<num; i++) {
                for(int j = 0; j<=i; j++){
                    bw.write("*");
                }
                bw.write("\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
