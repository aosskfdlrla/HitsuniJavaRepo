package com.hitsuni.section03.stringbuilder;

public class Application2 {
    public static void main(String[] args) {
        /* StringBuilder의 자주 사용되는 메소드 */
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());

        for(int i = 0; i < 50; i++) {
            /* 인자로 전달 된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가된다. */
            sb1.append(i);
            System.out.println("sb1 : " + sb1);
            System.out.println("sb1.capacity() : " + sb1.capacity());
            System.out.println("sb1.hashCode() : " + sb1.hashCode());
        }

        StringBuilder sb2 = new StringBuilder("javaoracle");
        System.out.println("sb2 = " + sb2);
        System.out.println("delete() : " + sb2.delete(2, 5));
        System.out.println("deleteCharAt() : " + sb2.deleteCharAt(0));
        System.out.println("sb2 = " + sb2);

        System.out.println("insert() : " + sb2.insert(1, "111"));
        System.out.println("insert() : " + sb2.insert(0, "2"));
        System.out.println("insert() : " + sb2.insert(sb2.length(), "3333"));

        System.out.println("reverse() : " + sb2.reverse());

        /* String 클래스와 동일하게 charAt(), indexOf(), lastIndexOf(), length(), replace(), subString(), toString()
        * 등의 메소드들이 있다.
        * String 불변이므로 자잘한 문자열 수정이 없다면 String 사용하는 것이 좋겠지만
        * 지속적으로 String 문자열을 수정해야 한다면 StringBuilder 사용하는 것이 좋다.
        * 이유는, String 에서는 같은 문자열이 아니면 새로운 인스턴스를 만들게 되어서 불필요한
        * 메모리 낭비가 될 수 있다. 그래서 StringBuilder 통해서 가변을 통해서
        * 메모리를 좀더 효율적으로 사용하고자 나오게 되었다.
        * */


    }
}
