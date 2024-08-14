package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_8393 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int inputNum = Integer.parseInt(br.readLine());
            int result = 0;
            for(int i=1; i <=inputNum; i++)
                result += i;
            System.out.println(result);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
