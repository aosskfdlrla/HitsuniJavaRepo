package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_14681 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int xPos = Integer.parseInt(br.readLine());
            int yPos = Integer.parseInt(br.readLine());
            if(xPos > 0 && yPos > 0)
                System.out.println("1");
            else if(xPos < 0 && yPos > 0)
                System.out.println("2");
            else if(xPos < 0 && yPos < 0)
                System.out.println("3");
            else if(xPos > 0 && yPos < 0)
                System.out.println("4");

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
