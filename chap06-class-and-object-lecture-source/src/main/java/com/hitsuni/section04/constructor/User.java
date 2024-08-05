package com.hitsuni.section04.constructor;

import java.util.Date;

public class User {

    /* 필드 선언부 */
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /* 생성자 선언부 */
    /* 1. 기본 생성자 (default constructor) */
    public User() {
        System.out.println("User 클래스의 기본 생성자가 호출이 됨.");
    }

    /* 2. 매개변수 생성자
     * 초기화 할 필드가 여러개인 경우 초기화 하고 싶은 필드의 조합별로 생성자를 여러개 작성할 수 있다.
     * */
    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("User 클래스의 id, pwd 초기화 하는 생성자 호출됨...");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
        /* this.id = id;
         * this.pwd = pwd;
         * this() : 동일 클래스 내의 다른 생성자 메소드를 호출하는 구문
         * 리턴 되어 돌아오지만 리턴 값은 존재하지 않으며 가장 첫 줄에 선언해야 한다. */
        this(id, pwd); // <- 이코드는 반드시 맨 앞에 있어야 한다.
        this.name = name;
        this.enrollDate = enrollDate;
        System.out.println("User 클래스의 id, pwd, name, enrollDate 초기화 하는 생성자 호출 됨...");
    }

    /* 메소드 선언부 */
    /* setter */
    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    /* getter */
    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public String getInfomation() {
        return this.id + " " + this.pwd + " " + this.name + " " + this.enrollDate;
    }
}
