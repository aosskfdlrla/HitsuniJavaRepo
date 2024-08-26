package com.hitsuni.codingtest.backjoon.Arrays;

import java.io.*;
import java.util.StringTokenizer;

public class Main1546 {
    public static void main(String[] args) {
        /* 입출력 하기 위한 BufferedReader, Writer 선언 */
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            /* 첫 출 입력 받는 변수와 maxNum 선언 */
            int num = Integer.parseInt(br.readLine());
            int maxNum = 0;
            int[] intArr = new int[num];

            /* StringTokenizer 로 두 번째 줄 들어오는 숫자 하나씩 다 잘라냄 */
            StringTokenizer st = new StringTokenizer(br.readLine());

            /* 들어온 숫자들 배열로 저장 */
            for(int i = 0; i < num; i++) {
                intArr[i] = Integer.parseInt(st.nextToken());
            }

            /* 첫번째 숫자를 maxNum 에 넣음. */
            maxNum = intArr[0];

            /* 첫번째는 이미 넣었으므로 i 는 1부터 시작
            * 들어온 배열 중에 최대 값 찾기
            * */
            for(int i=1; i<num; i++){
                maxNum = Math.max(maxNum, intArr[i]);
            }

            /* 모든 점수를 문제와 같이 조작과 동시에 더해준다.
            * 점수/M*100
            * */
            double total = 0.0;
            double avg = 0.0;
            for(int i = 0; i < num; i++) {
                total = total + (((double)intArr[i] /maxNum) * 100);
            }

            /* 평균 계산 */
            avg = total / num;

            bw.write(avg+"");
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
