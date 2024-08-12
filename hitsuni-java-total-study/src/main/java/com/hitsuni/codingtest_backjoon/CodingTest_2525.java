package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class CodingTest_2525 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] timeStr = (br.readLine()).split(" ");
            int hour = Integer.parseInt(timeStr[0]);
            int min = Integer.parseInt(timeStr[1]);
            LocalTime setTime = LocalTime.of(hour, min);
            int cookTime = Integer.parseInt(br.readLine());
            System.out.println(setTime.plusMinutes(cookTime).getHour() + " " + setTime.plusMinutes(cookTime).getMinute());
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
