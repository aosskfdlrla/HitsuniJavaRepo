package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_1330 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] numStr = (br.readLine()).split(" ");
            int num1 = Integer.parseInt(numStr[0]);
            int num2 = Integer.parseInt(numStr[1]);

            if(num1 > num2)
                System.out.println(">");
            else if(num1 < num2)
                System.out.println("<");
            else if(num1 == num2)
                System.out.println("==");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
