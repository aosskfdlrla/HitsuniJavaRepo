package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_2480 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] diceArr = (br.readLine()).split(" ");
            int dice1 = Integer.parseInt(diceArr[0]);
            int dice2 = Integer.parseInt(diceArr[1]);
            int dice3 = Integer.parseInt(diceArr[2]);

            if(dice1==dice2 && dice1==dice3)
                System.out.println(10000 + (dice1) * 1000);
            else if((dice1==dice2) || (dice1==dice3))
                System.out.println(1000 + (dice1) * 100);
            else if(dice2 == dice3)
                System.out.println(1000 + (dice2) * 100);
            else
                System.out.println((Math.max((Math.max(dice1, dice2)), dice3)) * 100);

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
