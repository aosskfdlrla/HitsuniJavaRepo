package com.hitsuni.codingtest.backjoon.String;

import java.io.*;

public class Main9086 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int repeatNum = Integer.parseInt(br.readLine());

            for(int i=0; i < repeatNum; i++) {
                String str = br.readLine();
                bw.write(str.charAt(0) + "" + str.charAt(str.length()-1) + "\n");
            }
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
