package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_25304 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int total = Integer.parseInt(br.readLine());
            int typeNum = Integer.parseInt(br.readLine());
            int billCheck = 1, bill = 0;
            do {
                String[] str = (br.readLine()).split(" ");
                int result = Integer.parseInt(str[0]) * Integer.parseInt(str[1]);
                bill += result;
                billCheck++;
            } while(billCheck <= typeNum);

            if(total == bill)
                System.out.println("Yes");
            else
                System.out.println("No");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
