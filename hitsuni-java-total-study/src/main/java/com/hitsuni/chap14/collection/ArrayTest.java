package com.hitsuni.chap14.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<Integer> scoreArr = new ArrayList<Integer>();
        boolean result = false;
        int totalScore = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.print("학생 성적 : ");
                scoreArr.add(Integer.parseInt(br.readLine()));
                System.out.print("추가 입력하려면 y : ");
                String str = br.readLine();
                result = str.equals("Y") || str.equals("y");
                ;
            } while(result);

            System.out.println("학생인원 : " + scoreArr.size());
            for(Integer arr : scoreArr)
                totalScore += arr;

            System.out.println("평균점수 : " + (float)(totalScore / scoreArr.size()));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램이 종료되었습니다.");
        }
    }
}
