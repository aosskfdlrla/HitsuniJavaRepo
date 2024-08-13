package com.hitsuni.section01.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Application4 {
    public static void main(String[] args) {
        HashSet<String> member = new HashSet<>();
        boolean state = true;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
                String inputID = br.readLine();
                member.add(inputID);
                System.out.println("ID가 추가되었습니다.");
                if(inputID.equals("exit"))
                    state = false;
            } while(state);
            System.out.println("모든 학생의 ID : " + member);
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
