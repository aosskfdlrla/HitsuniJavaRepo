package com.hitsuni.section09.initblock;

public class Product {
    /* 1. JVM 지정한 기본값 초기화 */
   //  private String name;
   //  private int price;
   //  private static String brand;

    /* 2. 명시적 초기화 */
    private String name = "갤럭시";
    private int price = 1000000;
    private static String brand = "삼성";

    /* 3. 초기화 블럭
     * 실행순서
     * 1) static 초기화 블럭
     * 2) 인스턴스 초기화 블럭
     * 3) 생성자 블럭
     * */
    // 인스턴스 초기화
    {
        name = "사이먼";
        price = 800000;
        brand = "홀스임";
        System.out.println("인스턴스 초기화 블럭 실행");
    }

    // static 초기화
    static {
        brand = "홀지";
        //name = "사이면";
        System.out.println("static 초기화 블럭 동작");
    }

    public Product() {
        System.out.println("생성자 동작");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 생성자 동작");
    }

    public String getInfomation() {
        return this.name + " " + this.price + " " + Product.brand;
    }
}
