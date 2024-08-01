package com.hitsuni.section03.branching;

public class Continue {
    public void testSimpleContinueStatement() {
        /* continue 문 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 4의 배수이면서 5의 배수인 값 출력 */
        for(int i = 1; i <= 10; i++) {

            /* 4의 배수가 아니거나 5의 배수가 아님 */
            if(i % 4 == 0 || i % 5 == 0) continue;

            System.out.println(i);
        }
    }

    public void testSimpleContinueStatement2() {
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("===== " + dan + "단 =====");
            for(int su = 1; su <= 9; su++) {
                if(su % 2 == 0) continue;
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }
    }

    public void testJumpContinue() {
        /* 중첩 반복문 내 continue 문 사용시 Jump(goto)에 대한 흐름을 이해하고 적용할 수 있다. */
        label:
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("===== " + dan + "단 =====");
            for(int su = 1; su <= 9; su++) {
                if(su % 2 == 0) continue label;
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }
    }
}
