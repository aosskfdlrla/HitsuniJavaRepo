package com.hitsuni.level04.advanced;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* 로또 배열 생성 */
        int[] lottoNum = new int[6];

        /* 로또 중복 숫자 판별 (기본 셋팅 : false) */
        boolean sameNum = false;

        /* 로또 배열 크기 만큼 번호 추첨.
         * 1. 번호 추첨을 한다.
         * 2. 나온 번호가 lottoNum 배열에 들어있는 번호와 같은지 검사한다.
         * 3. 같은 번호가 나오면 sameNum = true
         * 4. break; for 문 빠져나온 후
         * 5. 다시 추첨해야 하므로 i--
         * 6. 같은 번호가 아니라면 그대로 lottoNum 대입*/
        for(int i = 0, value = 0; i < lottoNum.length; i++) {
            value = (int)(Math.random() * 45 + 1);
            for(int j = 0; j < lottoNum.length; j++) {
                if(lottoNum[j] == value) {
                    sameNum = true;
                    break;
                }
            }

            if(sameNum) {
                i--;
                sameNum = false;
            } else {
                lottoNum[i] = value;
            }
        }

        for(int c : lottoNum) {
            System.out.print(c + " ");
        }
    }
}
