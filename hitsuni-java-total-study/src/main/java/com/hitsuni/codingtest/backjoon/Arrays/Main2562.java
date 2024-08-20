package com.hitsuni.codingtest.backjoon.Arrays;

import java.io.*;

public class Main2562 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int[] numArr = new int[9];
            int max = 0, index = 0;
            for(int i=0; i< numArr.length; i++) {
                numArr[i] = Integer.parseInt(br.readLine());
                if(max < numArr[i]) {
                    max = numArr[i];
                    index = i + 1;
                }
            }
            bw.write(max + "\n");
            bw.write(index+"");
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
