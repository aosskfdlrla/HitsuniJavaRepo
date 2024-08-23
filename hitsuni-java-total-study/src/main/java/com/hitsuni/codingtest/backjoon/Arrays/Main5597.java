package com.hitsuni.codingtest.backjoon.Arrays;

import java.io.*;
/* 백준 - 5596번 과제 안낸 사람 */
public class Main5597 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int[] studentNum = new int[30];

            // 출석부 초기화
            for(int i=0; i<30; i++) {
                studentNum[i] = i + 1;
            }

            // 입력 받아서 과제 수행 인원 제외 - 0 이 과제 수행
            while(true) {
                String str = br.readLine();
                if(str == null || str.isEmpty())
                    break;

                int doWork = Integer.parseInt(str) - 1;
                studentNum[doWork] = 0;
            }

            for(int student : studentNum)
                if(student != 0)
                    bw.write(student + "\n");

            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
