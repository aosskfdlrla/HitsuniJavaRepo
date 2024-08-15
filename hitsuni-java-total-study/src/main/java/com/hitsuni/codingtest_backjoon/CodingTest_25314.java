package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_25314 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());
            String result = "";
            for(int i=(num/4); i >= 1; i--) {
                if(i == 1)
                    result += "long int";
                else
                    result += "long ";
            }
            System.out.println(result);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
