package com.hitsuni.section02.extend.run;

import com.hitsuni.section02.extend.Bunny;
import com.hitsuni.section02.extend.MethodFarm;
import com.hitsuni.section02.extend.Reptile;
import com.hitsuni.section02.extend.Snake;

public class Application2 {
    public static void main(String[] args) {
        /* 메소드 매개변수 제네릭 제약을 사용할 수 있다. */
        MethodFarm methodFarm = new MethodFarm();

        /* 별도의 제약 없음 */
        methodFarm.animalType(new Bunny(), new Snake());

        /* extends Mammal */
        methodFarm.mammalType(new Bunny());

        /* extends Reptile */
        methodFarm.reptileType(new Reptile());
    }
}
