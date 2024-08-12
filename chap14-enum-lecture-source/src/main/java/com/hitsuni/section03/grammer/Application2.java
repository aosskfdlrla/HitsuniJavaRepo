package com.hitsuni.section03.grammer;

import java.util.EnumSet;

public class Application2 {
    public static void main(String[] args) {
        /* 열거 상수는 열거 객체이므로 생성자를 이용해 열거 상수에 여러 값을 넣을 수 있다.
        * */
        for(FoodsNum food : FoodsNum.values()) {
            System.out.println(food.getName() + ", " + food.getValue());
        }

        /* EnumSet 을 활용하여 enum을 Set 자료구조로 가져올 수 있다. */
        EnumSet<FoodsNum> foods = EnumSet.allOf(FoodsNum.class);

        /* 열거 타입 모든 상수를 Set에 추가 */
        EnumSet<FoodsNum> foods2 = EnumSet.of(FoodsNum.DRINK_WOOLUCK_SMOOTHIE, FoodsNum.MEAL_BUNGEOPPANG_SUSHI);

        /* 특정 상수 값만 제외하고 Set에 추가 */
        //EnumSet<FoodsNum> foods3 = EnumSet.complementOf(FoodsNum.DRINK_WOOLUCK_SMOOTHIE, FoodsNum.MEAL_BUNGEOPPANG_SUSHI);
    }
}
