package com.hitsuni.section01.exception;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();

        /*  try : 예외 발생 가능성이 있는 코드를 호출
        * catch : try 블럭 안에서 예외 발생 시 catch 블럭의 코드가 실행 된다.
        * try-catch 문의 실행시 의의
        * 예외 발생시 비정상 종료가 아닌 조치를 취하고 프로그램이 정상적으로 수행하고
        * 종료될 수 있도록 할 수 있다.
        * */
        try {
            exceptionTest.checkEnoughMoney(10000, 50000);
            exceptionTest.checkEnoughMoney(50000, 10000);
            System.out.println("===== 상품 구입 가능 =====");
        } catch (Exception e) {
            System.out.println("===== 상품 구입 불가 =====");
            e.printStackTrace();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
