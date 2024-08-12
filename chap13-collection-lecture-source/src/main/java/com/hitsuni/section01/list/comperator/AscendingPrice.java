package com.hitsuni.section01.list.comperator;

import com.hitsuni.section01.list.dto.BookDTO;

import java.util.Comparator;

/* Compartor 사용 시 제네릭 선언을 함께 했어야 compare 메소드의 매게변수 타입이 정의 된다.
* Object 타입인 경우 다운 캐스팅 해서 사용해야 하므로 불편하다.
*  */
public class AscendingPrice implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        /* 비교 대상 두 인스턴스의 가격이 오름차순 정렬 되기 위해서는 앞의 가격이 더 작은 가격이여야 한다
        * 만약 뒤의 가격이 더 작은 경우 두 인스턴스의 순서를 바꿔야 한다.
        * 드 떄 두 값을 바꾸라는 신로호 양수를 반환하면 정렬시 순서를 바꾸는 조건으로 사용 된다.*/
//        int result = 0;
//        if(o1.getPrice() > o2.getPrice()) {
//            result = 1;
//        } else if(o1.getPrice() < o2.getPrice()) {
//            result = -1;
//        }
//        return result;

        return o1.getPrice() - o2.getPrice();
    }
}
