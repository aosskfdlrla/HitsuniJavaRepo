package com.hitsuni.section04.wrapper;

public class Application2 {
    public void main(String[] args) {
        /* parsing : 문자열 값을 기본 자료형으로 변경 */

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("3");
        long l = Long.parseLong("4");
        float f = Float.parseFloat("5");
        double d = Double.parseDouble("6");
        boolean b1 = Boolean.parseBoolean("true");

        /* Character는 parsing 기능을 제공하지 않는다. */
        char c = "abc".charAt(0);
    }
}
