package com.hitsuni.question.greedy.level02.normal;

public class RamdomMaker {

    public int randomNumber(int min, int max) {
        return (int)(Math.random() * (max - min) + min);
    }

    public String randomUpperAlpabet(int length) {
        char tumpCh;
        String tumpStr = "";
        for(int i = 0; i < length; i++) {
            tumpCh = (char)(Math.random() * (90-65) + 65);
            tumpStr = tumpStr + tumpCh;
        }

        return tumpStr;
    }

    public String rockPaperScissors() {
        int tump = 0;
        String result = "";
        tump = (int)((Math.random() * 3) + 1);
        result = switch (tump) {
            case 1 -> "바위";
            case 2 -> "가위";
            case 3 -> "보";
            default -> "잘못되었습니다...";
        };

        return result;
    }

    public String tossCoin() {
        int tump = 0;
        String result = "";
        tump = (int)((Math.random() * 2) + 1);
        result = switch(tump) {
            case 1 -> "앞면";
            case 2 -> "뒷면";
            default -> "??? 동전이 섰어요??!!";
        };
        return result;
    }
}
