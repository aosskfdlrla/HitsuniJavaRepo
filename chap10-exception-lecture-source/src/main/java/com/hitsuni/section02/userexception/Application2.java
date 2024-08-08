package com.hitsuni.section02.userexception;

import com.hitsuni.section02.exception.MoneyNegativeException;
import com.hitsuni.section02.exception.NotEnoughMoneyException;
import com.hitsuni.section02.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        /* 사용자 정의 예외 클래스를 사용할 수 있다. */
        ExceptionTest exceptionTest = new ExceptionTest();

        /* 예외 상횡별로 try-catch 문으로 사용할 수도 있고 상위 Exception으로 통합적으로
         * 처리를 할 수도 있드아.
         *  */
        try {
            exceptionTest.checkEnoughMoney(-30000, 20000);
        } catch (PriceNegativeException | MoneyNegativeException | NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } finally {
            /* 예외 발생 여부와 상관없이 실행할 내용 */
            System.out.println("finally 블록의 내용이 동작함.");
        }
    }
}
