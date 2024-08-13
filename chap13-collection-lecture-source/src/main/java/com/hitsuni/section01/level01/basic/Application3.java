package com.hitsuni.section01.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Application3 {
    public static void main(String[] args) {
        Queue<String> customer = new LinkedList<>();
        boolean state = true;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            do {
                System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
                String inputName = br.readLine();
                if(inputName.equals("next")){
                    System.out.println(customer.poll() + " 고객님 차례입니다.");
                } else if(inputName.equals("exit")){
                    state = false;
                } else {
                    customer.offer(inputName);
                    System.out.println(inputName + " 고객님 대기 등록 되었습니다.");
                }
            } while(state);

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
