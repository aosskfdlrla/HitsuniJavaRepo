package com.hitsuni.section02.string;

public class Application2 {
    public static void main(String[] args) {
        /* 문자열 객체를 만드는 방법
        * ""리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다.
        * -> 같은 문자열에 대해서는 주소값이 같아서 마치 배열의 얇은 복사와 같이 새로운 객체를 만들지
        * 않고 두개의 String 공간이 같은 문자열을 가리키게 된다.
        * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str2 == str3 : " + (str2 == str3));
        System.out.println("str3 == str4 : " + (str3 == str4));

        /* 값이 같은 문자열은 같은 해시코드를 반환하도록 String 클래스에 hashCode 메소드가 재정의 되어있다. */
        System.out.println("str1.hashCode() : " + str1.hashCode());
        System.out.println("str2.hashCode() : " + str2.hashCode());
        System.out.println("str3.hashCode() : " + str3.hashCode());

        /* 문자열은 불변이라는 특성을 가진다. */
        str2 += "oracle";
        System.out.println("str1 == str2 : " + (str1 == str2));

        /* 인스턴스 주소 값 비교가 아니라 문자열 값을 비교하며 동일한 값을 가지면 true를 반환하도록 재정의 되어 있다. */
        System.out.println("str1.equals(str3) : " + str1.equals(str3));
        System.out.println("str1.equals(str4) : " + str1.equals(str4));
    }
}