package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_10950 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int repeat = Integer.parseInt(br.readLine());
            for(int i=0; i<repeat; i++) {
                String[] numStr = (br.readLine()).split(" ");
                int num1 = Integer.parseInt(numStr[0]);
                int num2 = Integer.parseInt(numStr[1]);
                System.out.println(num1 + num2);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
