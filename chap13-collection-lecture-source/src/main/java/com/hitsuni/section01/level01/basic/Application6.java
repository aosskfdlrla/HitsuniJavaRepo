package com.hitsuni.section01.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Application6 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        boolean state = true;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
                String inputStr = br.readLine();
                if(inputStr.equals("search")) {
                    System.out.print("검색할 이름 : ");
                    String search = br.readLine();
                    String getPhone = hashMap.get(search);
                    if(getPhone != null)
                        System.out.println(search + "씨의 휴대폰 번호 : " + getPhone);
                    else
                        System.out.println(search + "씨의 번호는 등록 되어 있지 않습니다.");
                } else if(inputStr.equals("exit")) {
                    state = false;
                } else {
                    String[] str = inputStr.split(" ");
                    if(str.length == 2) {
                        hashMap.put(str[0], str[1]);
                        System.out.println("추가 완료 : " + str[0] + " " + str[1]);
                    } else {
                        System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                    }
                }
            }while (state);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
