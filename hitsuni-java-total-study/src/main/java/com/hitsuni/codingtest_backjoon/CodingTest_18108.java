package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_18108 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(Integer.parseInt(br.readLine()) - 543);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
