package com.hitsuni.codingtest_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class CodingTest_1202 {
    static class Bosuk implements Comparator<Bosuk> {
        int weight;
        int price;

        Bosuk(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        @Override
        public int compare(Bosuk o1, Bosuk o2) {
            return o2.weight - o1.weight;
        }
    }
    /*
     * (보석의 갯수 N) 2 (가방의 갯수 K) 1
     * (보석의 무게) 5 (보석의 가격) 10
     * (보석의 무게) 100 (보석의 가격) 100
     * (가방에 담을 수 있는 최대 무게) 11
     * */
    public static void main(String[] args) {
        int bosukNum = 0, bagNum = 0;
        PriorityQueue<Bosuk> bosukList = new PriorityQueue<>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            bosukNum = Integer.parseInt(st.nextToken());
            bagNum = Integer.parseInt(st.nextToken());

            for(int i=0; i<bosukNum; i++) {
                StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
                int weight = Integer.parseInt(stt.nextToken());
                int price = Integer.parseInt(stt.nextToken());
                Bosuk bosuk = new Bosuk(weight, price);
                bosukList.offer(bosuk);
            }

            System.out.println(bosukList);

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
