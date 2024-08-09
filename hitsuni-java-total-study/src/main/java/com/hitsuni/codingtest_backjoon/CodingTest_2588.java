package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_2588 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num1 = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int[] nums = new int[str.length()];
            for(int i = str.length() - 1; i >= 0; i--){
                nums[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
                System.out.println(num1 * nums[i]);
            }
            System.out.println(num1 * Integer.parseInt(str));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
