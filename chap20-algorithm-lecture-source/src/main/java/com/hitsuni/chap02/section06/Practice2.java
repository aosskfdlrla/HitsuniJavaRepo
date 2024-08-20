package com.hitsuni.chap02.section06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Comparator;
import java.util.PriorityQueue;

/* 백준 - 보석도둑 */
public class Practice2 {
    public static class Bosuk implements Comparator<Bosuk> {
        int kg;
        int price;

        public Bosuk(int kg, int price) {
            this.kg = kg;
            this.price = price;
        }

        @Override
        public int compare(Bosuk o1, Bosuk o2) {
            return o2.kg - o1.kg;
        }

        /*
        * (보석의 갯수 N) 2 (가방의 갯수 K) 1
        * (보석의 무게) 5 (보석의 가격) 10
        * (보석의 무게) 100 (보석의 가격) 100
        * (가방에 담을 수 있는 최대 무게) 11
        * */
    }

    public long solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        PriorityQueue<Bosuk> maxHeap = new PriorityQueue<>();

        String[] str = (br.readLine()).split(" ");
        int bosukNum = Integer.parseInt(str[0]);
        int bagNum = Integer.parseInt(str[1]);

        for(int i=0; i<bosukNum; i++) {
            String[] dump = (br.readLine()).split(" ");
            int kg = Integer.parseInt(dump[0]);
            int price = Integer.parseInt(dump[1]);
            Bosuk bosuk = new Bosuk(kg, price);
            maxHeap.offer(bosuk);
        }

        System.out.println(maxHeap.peek());



        return 0;
    }
}
