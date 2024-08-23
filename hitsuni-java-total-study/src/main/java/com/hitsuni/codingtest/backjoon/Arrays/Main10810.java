package com.hitsuni.codingtest.backjoon.Arrays;

import java.io.*;
import java.util.StringTokenizer;

/* backjoon 10810 번 공넣기 문제
* 바구니 N, M 개의 줄
* 공 넣는 방법 : 세 정수 i j k
* i 번 바구니부터 j 번 바구니
* k 번 번호가 적혀져 있는 공을 넣는다.
*
* 출력 : 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력, 공이 없으면 0 출력
* 예제 입력     예제 출력
* 5 4         1 2 1 1 0
* 1 2 3
* 3 4 4
* 1 4 1
* 2 2 2
* */
public class Main10810 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int[] bag = new int[Integer.parseInt(st.nextToken())];
            int num = Integer.parseInt(st.nextToken());
            for(int i=0; i<num; i++) {
                st = new StringTokenizer(br.readLine());
                int bagNum1 = Integer.parseInt(st.nextToken());
                int bagNum2 = Integer.parseInt(st.nextToken());
                int ballNum = Integer.parseInt(st.nextToken());
                // 1 번 바구니는 배열 특성상 0 번이기 때문에 - 1
                for(int j = bagNum1 - 1; j < bagNum2; j++) {
                    bag[j] = ballNum;
                }
            }

            for (int j : bag) {
                if (j != 0) {
                    sb.append(j);
                } else {
                    sb.append(0);
                }
                sb.append(" ");
            }

            // 마지막 뒤 공백 제거
            sb.deleteCharAt(sb.length() - 1);
            bw.write(sb.toString());
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
