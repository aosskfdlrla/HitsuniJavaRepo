package com.hitsuni.question.greedy.level01.basic;

public class Calculator {
    // 메소드 호출 확인용
    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    // 챕터 3 에서는 아직 반복분을 배우지 않았음으로...
    public int sum() {
        int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        return sum;
    }

    public void checkMaxNumber(int a, int b) {
        System.out.println("두 수 중 큰 수는 " + (Math.max(a, b)) + "이다.");
    }

    public int sumTwoNumber(int a, int b) {
        return a + b;
    }

    public int minusTwoNumber(int a, int b) {
        return a - b;
    }

}
