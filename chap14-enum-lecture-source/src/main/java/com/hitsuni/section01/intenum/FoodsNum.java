package com.hitsuni.section01.intenum;

public enum FoodsNum {
    MEAL_AN_BUTTER_KIMCHI_STEW(0),
    MEAL_MINT_SEAWEED_SOUP(1),
    MEAL_BUNGEOPPANG_SUSHI(2),
    DRINK_RADISH_KIMCHI_LATTE(3),
    DRINK_WOOLUCK_SMOOTHIE(4),
    DRINK_RAW_CUTTER(5);

    private final int value;
    private final int var = 10;

    FoodsNum(int value) {
        this.value = value;
    }

    public void printVar() {
        System.out.println("print var : " + var);
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}