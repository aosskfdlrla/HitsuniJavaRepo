package com.hitusni.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operatingSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출");
    }

    /* 명시적으로 사용하는 부분이 없음 */
    public Computer(String cpu, int hdd, int ram, String operatingSystem) {
        // super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        System.out.println("Computer 클래스의 모든 필드 초기화하는 생성자 호출");
    }

    /* 부모 생성자 호출하고 자신도 초기화 */
    public Computer(String code, String brand, String name, int price, Date menufacturingDate, String cpu, int hdd, int ram, String operatingSystem) {
        super(code, brand, name, price, menufacturingDate);
        /* 위에 작성 된 생성자를 this()로 호출한다는 것은 super()를 두 번 호출하는 것과 같기 때문에 허용 되지 않는다.
        * this(cpu, hdd, ram, operatingSystem); -> 한번만 생성자를 호출해라.
        * */
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        System.out.println("Product 클래스와 Computer 클래스의 모든 필드 초기화하는 생성자 호출");
    }

    /* 부모 필드에 직접 접근을 불가하지만 getter setter 메소드는 자신의 것처럼 사용 가능하므로
    * 자식 클래스에서 추가된 필드에 대해서만 getter setter 메소드를 작성한다.
    * */

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String getInfomation() {
        /* 부모 클래스의 private 멤버에는 직접 접근 불가하므로 getter 메소드로 접근한다.
        * super, this 모두 사용 가능하며 생략하면 this의 의미이다.
        * 다만 코드의 의미를 명확히 하기 위해 super를 사용하였다.
        * */
        return super.getCode() + " " + super.getBrand() + " " + super.getName() + " " +
               super.getPrice() + " " + super.getMenufacturingDate()
                + this.cpu + " " + this.hdd + " " + this.ram + " " + this.operatingSystem;
    }
}
