package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_2739 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num1 = Integer.parseInt(br.readLine());
            for(int i=1; i < 10; i++)
                System.out.println(num1 + " * " + i + " = " + num1 * i);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
