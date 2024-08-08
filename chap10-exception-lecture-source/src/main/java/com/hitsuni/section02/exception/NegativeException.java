package com.hitsuni.section02.exception;

/* 사용자 Exception 만드는 법
* 1. Exception 상속 받기
* 2. 부모 클래스 생성자 호출
* */
public class NegativeException extends Exception {

    public NegativeException(String message) {
        super(message);
    }
}
