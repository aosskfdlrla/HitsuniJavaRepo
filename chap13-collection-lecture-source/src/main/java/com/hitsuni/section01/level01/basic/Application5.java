package com.hitsuni.section01.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        boolean state = true;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.print("단어 입력 ('exit' 입력 시 종료): ");
                String inputStr = br.readLine();
                treeSet.add(inputStr);
                if(inputStr.equals("exit")) {
                    state = false;
                }
            } while(state);
            System.out.println("정렬된 단어 : " + treeSet);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
