package com.hitsuni.codingtest_backjoon;

import java.io.*;
import java.nio.Buffer;

public class CodingTest_15552 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int testNum = Integer.parseInt(br.readLine());
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(int i=0; i < testNum; i++) {
                String[] sr = (br.readLine()).split(" ");
                bw.write(Integer.parseInt(sr[0]) + Integer.parseInt(sr[1]) + "\n");
            }
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
