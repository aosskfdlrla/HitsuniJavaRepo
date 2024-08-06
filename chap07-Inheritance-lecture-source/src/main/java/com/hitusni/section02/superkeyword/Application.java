package com.hitusni.section02.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /* super와 super()에 대해 이해하고 활용할 수 있다. */

        /* Product 기본 생성자 */
        Product product1 = new Product();
        System.out.println(product1.getInfomation());

        /* Product 매개변수 생성자 */
        Product product2 = new Product("S-01234", "삼성", "갤럭시Z폴드2", 2380000, new Date());
        System.out.println(product2.getInfomation());

        /* Computer 기본 생성자 */
        Computer computer = new Computer();
        System.out.println(computer.getInfomation());

        /* Computer 매개변수 생성자 */
        Computer computer2 = new Computer("퀄컴스냅드래곤", 128, 16, "android");
        System.out.println(computer2.getInfomation());

        Computer computer3 = new Computer("S-01234", "삼성", "갤럭시Z폴드2", 2380000, new Date(), "퀄컴스냅드래곤", 128, 16, "android");
        System.out.println(computer3.getInfomation());
    }
}
