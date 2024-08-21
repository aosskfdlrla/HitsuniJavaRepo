package com.hitsuni.codingtest_programers;

import java.util.HashMap;
import java.util.Map;

public class RunningGame {
    public static void main(String[] args) {
        String[] player = {"mumu", "soe", "poe", "kai", "mine"};
        String[] calling = {"kai", "kai", "mine", "mine"};
        String[] answer = solution(player, calling);

        for(String str : answer)
            System.out.print(str + " ");
    }

    public static String[] solution(String[] players, String[] calling) {
        // key 값으로 찾을 수 있는 map 활용....
        String[] answer = players;
        Map<String, Integer> playerMap = new HashMap<>();
        for(int i=0; i < answer.length; i++) playerMap.put(answer[i], i);

        for(int j=0; j < calling.length; j++) {
            int rank = playerMap.get(calling[j]); // 이름이 불린 선수의 원래 등수
            String name = answer[rank-1]; // 이름이 불린 선수의 앞에 있던 사람
            answer[rank-1] = calling[j]; // 앞 등수에 이름이 불린 선수가 앞서게 되고
            answer[rank] = name; // 원래 등수에는 앞서 있던 선수의 이름을 붙여준다.
            playerMap.put(answer[rank-1], rank-1); // map 반영
            playerMap.put(answer[rank], rank); // map 반영
        }

        return answer;
    }
}
