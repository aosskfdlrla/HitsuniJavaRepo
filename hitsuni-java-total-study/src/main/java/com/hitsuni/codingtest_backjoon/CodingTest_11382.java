package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_11382 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] str = (br.readLine()).split(" ");
            long num1 = Long.parseLong(str[0]);
            long num2 = Integer.parseInt(str[1]);
            long num3 = Integer.parseInt(str[2]);
            System.out.println(num1 + num2 + num3);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
