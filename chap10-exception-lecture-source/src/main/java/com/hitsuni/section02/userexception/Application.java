package com.hitsuni.section02.userexception;

import com.hitsuni.section02.exception.MoneyNegativeException;
import com.hitsuni.section02.exception.NotEnoughMoneyException;
import com.hitsuni.section02.exception.PriceNegativeException;

public class Application {
    public static void main(String[] args) {
        /* 사용자 정의 예외 클래스를 사용할 수 있다. */
        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            exceptionTest.checkEnoughMoney(-30000, 20000);
        } catch (PriceNegativeException | MoneyNegativeException | NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }

    }
}
