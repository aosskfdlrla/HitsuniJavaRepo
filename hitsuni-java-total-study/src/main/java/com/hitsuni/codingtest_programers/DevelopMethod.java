package com.hitsuni.codingtest_programers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* 자료구조에 꼭 데이터만을 넣는 것이 아니라
* 계산해야 할 대상도 넣어서 풀 수 있는 방법도 있다.
* - 나는 progresses 와 speeds 를 class 로 묶어서
* Queue 에 담은 다음 반복문을 통해서 계산을 해보려고 한건데...
*
* 다른 사람들은 그게 아니라 오히려 개발 일정 완료하는데 필요한 Day 를
* Queue 에 넣어서 그 것을 가지고 이전 값이 현재 값보다 작으면 count ++
*
* 프로그래머스 - 기능 개발 문제
* Math.ceil : 올림 함수 (반올림 X)
*  */
public class DevelopMethod {
    public static void main(String[] args) {

    }

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<progresses.length; i++) {
            queue.offer((int)Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }

         // while 문으로 큐에 자료가 없어질때까지
        while(!queue.isEmpty()) {
            int current = queue.poll();
            int count = 1;
            while(!queue.isEmpty() && current >= queue.peek()) {
                count++;
                queue.poll();
            }
            result.add(count);
        }

        int[] answer = new int[result.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = result.get(i);

        return answer;
    }
}
