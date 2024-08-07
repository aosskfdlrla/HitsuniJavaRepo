package com.hitsuni.chap02.operator;

public class BitOperator {
    public static void main(String[] args) {
        byte bnum1 = Byte.MAX_VALUE;
        byte bnum2 = 45;

        /* AND 연산 (& 연산자)
        *  bnum1 = 0 1 1 1 1 1 1 1 (127)
        *  bnum2 = 0 0 1 0 1 1 0 1 (45)
        *  AND(&)= 0 0 1 0 1 1 0 1 (45)
        * */
        System.out.println("비트연산자 : & (AND 연산)");
        System.out.println("bnum1 & bnum2 = " + (bnum1 & bnum2));

        /* OR 연산 (| 연산자)
         *  bnum1 = 0 1 1 1 1 1 1 1 (127)
         *  bnum2 = 0 0 1 0 1 1 0 1 (45)
         *  OR(|) = 0 1 1 1 1 1 1 1 (127)
         * */
        System.out.println("비트연산자 : | (OR 연산)");
        System.out.println("bnum1 | bnum2 = " + (bnum1 | bnum2));

        /* XOR 연산 (^ 연산자)
         *  bnum1 = 0 1 1 1 1 1 1 1 (127)
         *  bnum2 = 0 0 1 0 1 1 0 1 (45)
         *  AND(&)= 0 1 0 1 0 0 1 0 (82)
         * */
        System.out.println("비트연산자 : ^ (XOR 연산)");
        System.out.println("bnum1 ^ bnum2 = " + (bnum1 ^ bnum2));
    }
}