package com.hitsuni.section02.userexception;

import com.hitsuni.section02.exception.MoneyNegativeException;
import com.hitsuni.section02.exception.NotEnoughMoneyException;
import com.hitsuni.section02.exception.PriceNegativeException;

public class ExceptionTest {

    /* throw 구문 작성시 여러 Exception 나열을 할 수 있으면 상위 타입의 Exception 만 기입이 가능하다. */
    public void checkEnoughMoney(int price, int money)
            throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        if(price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }

        if(money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }

        if(money < price) {
            throw new NotEnoughMoneyException("가지고 있는 돈보다 상품가격이 더 비쌉니다.");
        }

        System.out.println("즐거운 쇼핑하세요.");
    }
}
