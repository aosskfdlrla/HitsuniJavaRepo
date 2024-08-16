package com.hitsuni.assertions.section01.jupiter;

public class NumberValidation {
    public void checkDivideableNumbers(int firstNumber, int secondNumber) {
        if(secondNumber == 0) throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
    }
}
