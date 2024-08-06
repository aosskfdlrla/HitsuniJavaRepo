package com.hitsuni.section01.ploymorphism;

public class Tiger extends Animal {
    
    @Override
    public void eat() {
        System.out.println("호랑이는 고기를 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 호다닥 달려갑니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울음소리를 냅니다 어흥어흥");
    }

    public void bite() {
        System.out.println("호랑이가 물어 뜯습니다 크아앙~!");
    }
}
