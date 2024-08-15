package com.hitsuni.codingtest_backjoon;

import java.io.*;

public class CodingTest_2439 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int num = Integer.parseInt(br.readLine());
            for(int i=0; i<num; i++) {
                for(int j=i; j<num-1; j++){
                    bw.write(" ");
                }
                for(int k=0; k<=i; k++)
                    bw.write("*");

                bw.write("\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
