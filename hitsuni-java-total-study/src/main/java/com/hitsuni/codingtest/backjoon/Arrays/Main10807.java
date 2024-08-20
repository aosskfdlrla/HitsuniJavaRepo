package com.hitsuni.codingtest.backjoon.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* backjoon - 10807번 갯수 세기*/
public class Main10807 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());
            String numArr = br.readLine();
            int findNum = Integer.parseInt(br.readLine());

            System.out.println(solution(num, numArr, findNum));
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int solution(int num, String input, int find) {
        int count = 0;
        int[] numArr = new int[num];
        StringTokenizer stt = new StringTokenizer(input, " ");
        for(int i=0; i < numArr.length; i++){
            numArr[i] = Integer.parseInt(stt.nextToken());
            if(numArr[i] == find)
                count++;
        }
        return count;
    }
}
