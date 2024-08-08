package com.hitsuni.section01.exception;

public class ExceptionTest {

    /* thorws Exception
    * 이 메소드를 호출하게 되면 Exception 발생할 수 있는데
    * 호출하는 메소드가 처리해~!
    *  */
    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("가지고 계신 돈은 " + money + "입니다.");

        if(money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        } else {
            /* 강제로 예외를 발생 시킨다. 예외를 발생 시키면 예외 처리가 필요하다.
            * 바로 나를 호출했던 곳으로 돌아간다.
            * */
            throw new Exception();
        }

        System.out.println("즐거운 쇼핑하세요.");
    }
}
