package com.hitsuni.section01.intenum;

public class Application {
    public static void main(String[] args) {
        /* 정수 열거 패턴과 이의 담점을 이해할 수 있다. */
        
        /* 1. 타입 안정성 보당 방법이 없이 디버깅이 어려움. */
        int food = Foods.MEAL_AN_BUTTER_KIMCHI_STEW;
        food = Foods.DRINK_RADISH_KIMCHI_LATTE;

        /* 2가지가 모두 상수 0이라는 점 때문에 정확한 구별이 어렵다. */
        if(food == Foods.MEAL_AN_BUTTER_KIMCHI_STEW) {
            System.out.println("식사 카테고리 - 앙버터 김치찜");
        }

        /* 2. 정수형 상수는 문자열로 출력하기 어렵다. */
        System.out.println(Foods.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(Foods.MEAL_MINT_SEAWEED_SOUP);
        System.out.println(Foods.MEAL_BUNGEOPPANG_SUSHI);

        /* 3. 정수 열거 그룹에 속한 모든 상수를 순화하는 방법도 쉽지 않다.
        *  4. 정수 열거 패턴으로 상수가 선언된 경우 변경이 발생하면 재컴파일이 팔요하다.
        * */
    }
}
