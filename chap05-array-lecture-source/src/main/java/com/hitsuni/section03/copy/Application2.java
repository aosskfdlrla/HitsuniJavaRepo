package com.hitsuni.section03.copy;

public class Application2 {
    public static void main(String[] args) {
        /* 얕은 복사를 활용하여 매개변수ㄹ와 리턴 값으로 활용할 수 있다. */

        String[] names = { "홍길동", "고길동", "콩순이" };
        print(names);
        String[] animals = getAnimals();

        System.out.println("리턴 받은 animals의 hashCode : " + animals.hashCode());
    }

    public static void print(String[] strArr) {
        System.out.println("strArr의 hashCode : " + strArr.hashCode());

        for(int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals(){
        String[] animals = {"낙타", "호랑이", "나무늘보"};

        System.out.println("animals의 hashCode : " + animals.hashCode());

        return animals;
    }

}
