package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_10951 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str;
            while((str = br.readLine()) != null) {
                String[] str2 = str.split(" ");
                int num1 = Integer.parseInt(str2[0]);
                int num2 = Integer.parseInt(str2[1]);
                System.out.println(num1 + num2);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
