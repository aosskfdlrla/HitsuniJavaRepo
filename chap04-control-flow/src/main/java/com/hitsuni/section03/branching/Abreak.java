package com.hitsuni.section03.branching;

public class Abreak {

    public void testSimpleBreakStatement() {
        /* break 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        int sum = 0;
        int i = 1;
        while(true) {
            sum += i++;
            if(i > 100) break;
        }

        System.out.println("sum = " + sum);
    }

    public void testSimpleBreakStatement2() {
        /* 중첩 반복문 내 break 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        for(int i = 2; i <= 9; i++) {
            System.out.println("==== 구구단 " + i + "단 ====");
            for(int j = 1; j <= 9; j++) {
                if(j > 5) break;
                System.out.println("     " + i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }

    public void testJumpBreak() {
        /* 중첩 반복문 내에서 break 사용시 jump(goto)에 대한 흐름을 이해할 수 있다. */
        label:
        for(;;) {
            for(int i = 0; i < 10; i++){
                System.out.println(i);
                if(i == 3) break label;
            }
        }
    }
}
