package com.hitsuni.section01.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {
        Stack<String> visitWebSite = new Stack<String>();
        boolean exit = true;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
                String inputWebSite = br.readLine();
                if(!inputWebSite.equals("exit")) {
                    visitWebSite.push(inputWebSite);
                    System.out.println(visitWebSite);
                } else {
                    exit = false;
                }
            } while(exit);

            for(int i=0; i < 5; i++)
                System.out.println(visitWebSite.get(i));
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
