package com.hitsuni.question.greedy.level02.normal;

public class Application {
    public static void main(String[] args) {
        RamdomMaker ramdomMaker = new RamdomMaker();

        // 첫 번째 인자의 최소값 부터 두 번째 인자까지 범위의 난수를 출력
        System.out.println(ramdomMaker.randomNumber(20, 30));

        // 인자로 전달한 정수 길이의 랜덤한 문자열을 출력함
        System.out.println(ramdomMaker.randomUpperAlpabet(10));

        // 가위, 바위, 보 중 한 가지를 출력함
        System.out.println(ramdomMaker.rockPaperScissors());

        // 앞면, 뒷면 중 한 가지를 출력함
        System.out.println(ramdomMaker.tossCoin());
    }
}
