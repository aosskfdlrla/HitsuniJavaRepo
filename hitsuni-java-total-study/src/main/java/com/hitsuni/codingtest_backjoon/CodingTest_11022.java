package com.hitsuni.codingtest_backjoon;

import java.io.*;

public class CodingTest_11022 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int num = Integer.parseInt(br.readLine());
            for(int i=1; i<=num; i++){
                String[] srr = (br.readLine()).split(" ");
                int num1 = Integer.parseInt(srr[0]);
                int num2 = Integer.parseInt(srr[1]);
                bw.write("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
            }
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
