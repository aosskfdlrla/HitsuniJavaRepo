package com.hitsuni.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_10430 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] str = (br.readLine()).split(" ");
            int[] nums = new int[str.length];
            for(int i=0; i<nums.length; i++)
                nums[i] = Integer.parseInt(str[i]);
            System.out.println((nums[0]+nums[1])%nums[2]);
            System.out.println(((nums[0]%nums[2])+(nums[1]%nums[2]))%nums[2]);
            System.out.println((nums[0]*nums[1])%nums[2]);
            System.out.println(((nums[0]%nums[2])*(nums[1]%nums[2]))%nums[2]);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
