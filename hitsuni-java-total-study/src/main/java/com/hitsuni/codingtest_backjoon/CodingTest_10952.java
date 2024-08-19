package com.hitsuni.codingtest_backjoon;

import java.io.*;

public class CodingTest_10952 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            boolean runState = true;
            while(runState) {
                String[] str = (br.readLine()).split(" ");
                int num1 = Integer.parseInt(str[0]);
                int num2 = Integer.parseInt(str[1]);
                if(num1 == 0 && num2 == 0)
                    runState = false;
                else
                    bw.write((num1 + num2) +"\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
