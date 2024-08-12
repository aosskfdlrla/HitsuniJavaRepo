package com.hitsuni.section02.enumtype;

import com.hitsuni.section01.intenum.Foods;
import com.hitsuni.section01.intenum.FoodsNum;

public class Application {
    public static void main(String[] args) {
        /* 열거형(enum)을 이용하여 상수 열거 패턴의 단저믈 해결하는 것을 이해할 수 있다. */

        /* 1. 열거 타입은 싱글톤 방식으로 구현되기 때문에 인스턴스의 생성이나 확장이 되지 않는다. */

        /* 2.컴파일 타입의 타입 안정성을 높여준다. */
        boolean isTrue = enumTest(FoodsNum.MEAL_AN_BUTTER_KIMCHI_STEW, FoodsNum.DRINK_RADISH_KIMCHI_LATTE);
        // boolean isTrue2 = enumTest(0, 3); -> 정수 상수 값과 일치하는 값을 전달해도 타입이 불일치해서 사용할 수 없다.

        /* 3. 상수 이름을 문자열로 출력할 수 있다. */
        System.out.println(FoodsNum.DRINK_RADISH_KIMCHI_LATTE);
        System.out.println(FoodsNum.DRINK_RAW_CUTTER);
        System.out.println(FoodsNum.MEAL_AN_BUTTER_KIMCHI_STEW);

        /* 4. 메소드나 필드를 추가할 수 있다. 근본적으로 불변이라 모든 칠드는 final 이여야만 한다. */
        /* 5. 클래스이기 때문에 toString() 오버라이딩이 가능하다. */

        /* 6. 열거 타입 내에 선언 된 상수들을 순회할 수 있다. */
        for(FoodsNum food : FoodsNum.values()) {
            System.out.println("food = " + food);
        }

        FoodsNum.DRINK_WOOLUCK_SMOOTHIE.printVar();
    }

    private static boolean enumTest(FoodsNum foodsEnum1, FoodsNum foodsEnum2) {
        if(foodsEnum1 == foodsEnum2) return true;
        return false;
    }
}
