package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class CodingTest_2884 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] timeStr = (br.readLine()).split(" ");
            int hour = Integer.parseInt(timeStr[0]);
            int min = Integer.parseInt(timeStr[1]);
            LocalTime setAlramTime = LocalTime.of(hour, min);
            setAlramTime = setAlramTime.minusMinutes(45);
            System.out.println(setAlramTime.getHour() + " " + setAlramTime.getMinute());
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
