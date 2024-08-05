package com.hitsuni.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해한다. */

        /* Monster 클래스 내부에서는 유지보수하면서 코드 변경이 일어나지만
         * 사용자의 호출 코드에서는 변경이 필요없다. 따라서 유지보수성이 향상된다.
         * */
        Monster monster1 = new Monster();
        monster1.setName("두치");
        monster1.setHp(100);
        System.out.println("monster1 Info: " + monster1.getInfo());
        System.out.println("monster1 Hp: " + monster1.getHp());

        Monster monster2 = new Monster();
        monster2.setName("미친토마토");
        monster2.setHp(200);
        System.out.println("monster2 Info: " + monster2.getInfo());
        System.out.println("monster2 Hp: " + monster2.getHp());

        /* ----------------------------------------------------------*/
        monster2.kinds = "야채"; // 여전히 직접접근이 가능하므로 강제할 필요가 있다.
    }
}
