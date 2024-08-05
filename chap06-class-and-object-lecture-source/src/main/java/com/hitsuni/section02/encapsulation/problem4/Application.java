package com.hitsuni.section02.encapsulation.problem4;

public class Application {
    public static void main(String[] args) {
        /* 접근 제한자에 대해 이해하고 직접 필드에 접근 못하게 강제화 할 수 있다. */
        Monster monster1 = new Monster();
        monster1.setName("미친토마도");
        monster1.setKinds("채소");
        monster1.setHp(200);
        System.out.println(monster1.getName());
        System.out.println(monster1.getKinds());
        System.out.println(monster1.getHp());

        /* private 로 접근을 제한하였으므로 직접 접근 코드는 complie error 발생
         * monster1.name = "미친토마토";
         * monster1.setKinds = "채소";
         * monster1.setHp = 200;
         * */
    }
}
