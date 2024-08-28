package com.hitsuni.codingtest.backjoon.stack;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

/* 백준 - 12789번 문제 */
public class Main12789 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;

            /* 사람 수 읽음 */
            int peopleNum = Integer.parseInt(br.readLine());

            /* 사람 수에 맞는 배열과
            * 문제에서의 공간 Stack 선언
            *  */
            ArrayList<Integer> waitPeople = new ArrayList<>();
            Stack<Integer> waitSpace = new Stack<>();

            /* 두번째줄 번호표 든 사람들 입력 받음 */
            st = new StringTokenizer(br.readLine());

            /* 입력받은 대로 줄 세움 */
            for(int i=0; i < peopleNum; i++)
                waitPeople.add(Integer.parseInt(st.nextToken()));

            /* 사람 수 만큼 줄 카운트
            *     i -> 대기열 첫번째 부터 시작
            * value -> 간식 받아야 할 번호표
            * */
            int i=0, value = 1;
            boolean state = true;
            while(state) {
                /* 수행 되고 waitPeople이 비었을 때 */
                if(waitPeople.isEmpty()) {
                    if(!waitSpace.isEmpty()) {
                        if(value == waitSpace.peek()) {
                            waitSpace.pop();
                            value++;
                        } else {
                            bw.write("Sad");
                            break;
                        }
                    }
                } else {
                    /* 1. 간식 받을 번호표와 대기열의 번호와 같은 경우 간식 받고 대기열에서 지움. */
                    if(value == waitPeople.get(i)) {
                        waitPeople.remove(i);
                        value++;
                    } else if(value < waitPeople.get(i)) {     // 2. 번호표보다 뒤에있는 번호일 경우
                        if(waitSpace.isEmpty()) {              // 대기 공간이 비어있는 경우
                            waitSpace.push(waitPeople.get(i)); // 그 번호를 대기 시킨다.
                            waitPeople.remove(i);              // 대기줄 이동했으므로 삭제
                        } else {                               // 비어있지 않는 경우
                            if(value == waitSpace.peek()) {    // 대기중인 사람이 간식 받을 번호와 같은지 확인
                                waitSpace.pop();               // 같으면 pop() 대기줄에서 제거
                                value++;                       // 번호표 증가
                            } else {
                                waitSpace.push(waitPeople.get(i)); // 같지 않으면 대기 공간에 할당
                                waitPeople.remove(i);              // 대기열에서 삭제
                            }
                        }
                    }
                }

                if(waitSpace.isEmpty() && waitPeople.isEmpty()) {
                    state = false;
                    bw.write("Nice");
                }
            }
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
