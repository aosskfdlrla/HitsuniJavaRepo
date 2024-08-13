package com.hitsuni.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */
        String[] inputWord;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            inputWord = (br.readLine()).split(" ");
            String[] uniqueWord = new String[inputWord.length];
            int[] uniqueWordCount = new int[inputWord.length];
            int uniqueIndex = 0;

            // 영문자만 골라내기, 대소문자 구별 안하도록 소문자로 통일
            for(int i = 0; i < inputWord.length; i++) {
                inputWord[i] = inputWord[i].toLowerCase().replaceAll("[^a-zA-z]", "");
                boolean found = false;
                if(!inputWord[i].isEmpty()) {
                    for (int j = 0; j < uniqueIndex; j++) {
                        if (uniqueWord[j].equals(inputWord[i])) {
                            uniqueWordCount[j]++;
                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        uniqueWord[uniqueIndex] = inputWord[i];
                        uniqueWordCount[uniqueIndex] = 1;
                        uniqueIndex++;
                    }
                }
            }

            String mostFrequentWord = null;
            int maxCount = 0;

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < uniqueIndex; i++) {
                result.append(uniqueWord[i]).append(": ").append(uniqueWordCount[i]).append("\n");

                if (uniqueWordCount[i] > maxCount) {
                    maxCount = uniqueWordCount[i];
                    mostFrequentWord = uniqueWord[i];
                }
            }

            /* 확인을 위한 출력문 */
            System.out.println("Arrays.toString(words) : " + Arrays.toString(inputWord));
            System.out.println("Arrays.toString(uniqueWords) : " + Arrays.toString(uniqueWord));
            System.out.println("Arrays.toString(wordCounts) : " + Arrays.toString(uniqueWordCount));

            System.out.println("===== 단어 빈도 =====");
            System.out.println(result);
            System.out.println("가장 빈도 높은 단어 : " + mostFrequentWord + " (" + maxCount + " 번)");

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
