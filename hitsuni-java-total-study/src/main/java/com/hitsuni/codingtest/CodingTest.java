package com.hitsuni.codingtest;

import java.util.Scanner;

/* 최소값 최대값 구하기 - BackJoon */
public class CodingTest {
    public static void main(String[] args) {

        int max = 0, min = 0, index = 0;
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        int[] numbers = new int[inputNum];

        scan.nextLine();

        String nums = scan.nextLine();
        String[] numArr = nums.split(" ");

        scan.close();

        for(int i = 0; i < numArr.length; i++) {
            numbers[i] = Integer.parseInt(numArr[i]);
        }

        do {
            if(index != 0) {
                max = Math.max(max, numbers[index]);
                min = Math.min(min, numbers[index]);
            } else {
                max = numbers[0];
                min = numbers[0];
            }
            index++;
        }while(index < numbers.length);

        System.out.println(min + " " + max);
    }
}
