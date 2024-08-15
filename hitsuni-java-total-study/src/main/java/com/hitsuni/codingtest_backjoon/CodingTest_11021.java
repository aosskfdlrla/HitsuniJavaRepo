package com.hitsuni.codingtest_backjoon;

import java.io.*;

public class CodingTest_11021 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int num = Integer.parseInt(br.readLine());
            for(int i=1; i<=num; i++){
                String[] srr = (br.readLine()).split(" ");
                bw.write("Case #" + i + ": " + (Integer.parseInt(srr[0]) + Integer.parseInt(srr[1])) + "\n");
            }
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
