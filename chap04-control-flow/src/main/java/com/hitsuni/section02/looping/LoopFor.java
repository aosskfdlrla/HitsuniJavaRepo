package com.hitsuni.section02.looping;

public class LoopFor {
    public void testSimpleForState() {
        for(int i = 0; i < 10; i++){
            System.out.println("출력 : " + i);
        }
    }

    public void testForExample() {
        /* 1 ~ 10까지 합계 구하기 */
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }

        System.out.println("sum = " + sum);
    }
}
