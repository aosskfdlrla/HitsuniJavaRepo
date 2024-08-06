package com.hitusni.section02.superkeyword;

import java.util.Date;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;
    private Date menufacturingDate;

    public Product() {
        System.out.println("Product 클래스의 기본 생성자 호출");
    }

    public Product(String code, String brand, String name, int price, Date menufacturingDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.menufacturingDate = menufacturingDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getMenufacturingDate() {
        return menufacturingDate;
    }

    public void setMenufacturingDate(Date menufacturingDate) {
        this.menufacturingDate = menufacturingDate;
    }

    public String getInfomation() {
        return code + " " + brand + " " + name + " " + price + " " + menufacturingDate;
    }
}
