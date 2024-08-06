package com.hitsuni.chap01.vaiable;

public class Variable01 {
    public static void main(String[] args) {
        /* 1. 정수형 변수 */
        /* byte 형
        * 최대값 : 127
        * 최소값 : -128
        * 크기 : 1 byte (= 8 bit)
        * */
        byte bnum1 = Byte.MAX_VALUE;
        byte bnum2 = Byte.MIN_VALUE;
        int byteSize = Byte.BYTES;
        int bitSize = Byte.SIZE;
        System.out.println("Byte 최대값 : " + bnum1);
        System.out.println("Byte 최소값 : " + bnum2);
        System.out.println("크기 : " + byteSize + " Byte");
        System.out.println("크기 : " + bitSize + " Bit");

        /* short 형
        * 최대값 : 32767
        * 최소값 : -32768
        * 크기 : 2 byte (= 16 bit)
        * */
        short snum1 = Short.MAX_VALUE;
        short snum2 = Short.MIN_VALUE;
        int shortByteSize = Short.BYTES;
        int shortBitSize = Short.SIZE;
        System.out.println("Short 최대값 : " + snum1);
        System.out.println("Short 최소값 : " + snum2);
        System.out.println("크기 : " + shortByteSize + " Byte");
        System.out.println("크기 : " + shortBitSize + " Bit");

        /* int 형
         * 최대값 : 2147483647
         * 최소값 : -2147483648
         * 크기 : 4 byte (= 32 bit)
         * */
        int inum1 = Integer.MAX_VALUE;
        int inum2 = Integer.MIN_VALUE;
        int intByteSize = Integer.BYTES;
        int intBitSize = Integer.SIZE;
        System.out.println("int 최대값 : " + inum1);
        System.out.println("int 최소값 : " + inum2);
        System.out.println("크기 : " + intByteSize + " Byte");
        System.out.println("크기 : " + intBitSize + " Bit");

        /* long 형
         * 최대값 : 9223372036854775807
         * 최소값 : -9223372036854775808
         * 크기 : 8 byte (= 64 bit)
         * */
        long lnum1 = Long.MAX_VALUE;
        long lnum2 = Long.MIN_VALUE;
        int longByteSize = Long.BYTES;
        int longBitSize = Long.SIZE;
        System.out.println("long 최대값 : " + lnum1);
        System.out.println("long 최소값 : " + lnum2);
        System.out.println("크기 : " + longByteSize + " Byte");
        System.out.println("크기 : " + longBitSize + " Bit");

        /* float 형
         * 최대값 : 3.4028235E38
         * 최소값 : 1.4E-45
         * 크기 : 4 byte (= 32 bit)
         * */
        float fnum1 = Float.MAX_VALUE;
        float fnum2 = Float.MIN_VALUE;
        int floatByteSize = Float.BYTES;
        int floatBitSize = Float.SIZE;
        System.out.println("float 최대값 : " + fnum1);
        System.out.println("float 최소값 : " + fnum2);
        System.out.println("크기 : " + floatByteSize + " Byte");
        System.out.println("크기 : " + floatBitSize + " Bit");

        /* double 형
         * 최대값 : 1.7976931348623157E308
         * 최소값 : 4.9E-324
         * 크기 : 8 byte (= 64 bit)
         * */
        double dnum1 = Double.MAX_VALUE;
        double dnum2 = Double.MIN_VALUE;
        int doubleByteSize = Long.BYTES;
        int doubleBitSize = Long.SIZE;
        System.out.println("double 최대값 : " + dnum1);
        System.out.println("double 최소값 : " + dnum2);
        System.out.println("크기 : " + doubleByteSize + " Byte");
        System.out.println("크기 : " + doubleBitSize + " Bit");

        /* char 형
         * 최대값 : \uFFFF
         * 최소값 : \u0000
         * 크기 : 2 byte (= 16 bit)
         * */
        char char1 = Character.MAX_VALUE;
        char char2 = Character.MIN_VALUE;
        int charByteSize = Character.BYTES;
        int charBitSize = Character.SIZE;
        System.out.println("char 최대값 : " + char1);
        System.out.println("char 최소값 : " + char2);
        System.out.println("크기 : " + charByteSize + " Byte");
        System.out.println("크기 : " + charBitSize + " Bit");

        /* boolean 형
         * true
         * fasle
         * 크기 : 1 byte (= 8 bit)
         * */
        boolean bool1 = Boolean.TRUE;
        boolean bool2 = Boolean.FALSE;
        System.out.println("boolean : " + bool1);
        System.out.println("boolean : " + bool2);
    }
}
