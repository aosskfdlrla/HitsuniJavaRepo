package com.hitsuni.section03.dto;

/* DTO(Data Transfer Object) */
public class MemberDTO {
    /* 취급하려고 하는 회원 정보를 고려해서 필드를 작성한다.
     * 값 객체가 가지는 속성을 추출하는 과정 또한 주상화라고 볼 수 있다. */

    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isActivated;

    /* 필드에 private 접근 제한자를 설정하게 되면 public으로 접근을 허용하는
     * 설정자, 접근자, 메소드를 통해 간접 접근이 필요하다.
     * */

    /* 설정자 (setter) */
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    /* 접근자 (getter) */
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isActivated() {
        return isActivated;
    }
}
