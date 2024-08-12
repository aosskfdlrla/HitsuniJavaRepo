package com.hitsuni.study.string;

public class StringMethod {
    public static void main(String[] args) {
        String testString = "Korea";

        /* 1.charAt() 메소드
        * string 문자열에서 특정 인덱스에 있는 문자를 반환하는 메소드.
        * 결국 String도 배열임으로 반목문을 사용한다면 문자 하나하나 접근 가능.
        *
        * 결과
        * charAt[0] : K
        * charAt[1] : o
        * charAt[2] : r
        * charAt[3] : e
        * charAt[4] : a
        * */
//        for(int i=0; i < testString.length(); i++)
//            System.out.println("charAt["+ i + "] : " + testString.charAt(i));

        /* 2. compareTo(), compareToIgnoreCase() */

        /* compareTo() */
        String str1 = "java";
        String str2 = "JAva";

        System.out.println((str1.compareTo(str2)));

        /* compareToIgnoreCase() - 대소문자 상관없이 비교 */
        System.out.println((str1.compareToIgnoreCase(str2)));

        /* 3. concat()
        * 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.
        * 원본 문자열에는 영향을 주지 않음.
        * */
        String str3 = "java";
        String str4 = "oracle";
        System.out.println(str3.concat(str4));

        /* 4. indexOf(), lastIndexOf()
        * indexOf : 처음 일치하는 특정 문자 인덱스 반환, 없으면 -1 반환
        * lastIndexOf : 뒤에서 부터 처음 일치하는 특정 문자 인덱스 반환, 없으면 -1 반환
        * 결과
        * indexOf('a') : 1
        * indexOf('z') : -1
        * lastIndexOf('a') : 7
        * lastIndexOf('z') : -1
        * */
        String indexOfStr = "java oracle best";
        System.out.println("indexOf('a') : " + indexOfStr.indexOf('a'));
        System.out.println("indexOf('z') : " + indexOfStr.indexOf('z'));
        System.out.println("lastIndexOf('a') : " + indexOfStr.lastIndexOf('a'));
        System.out.println("lastIndexOf('z') : " + indexOfStr.lastIndexOf('z'));

        /* 5. trim()
        * 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.
        * SQL 문 처럼.. LPAD 같이 왼쪽만 제거 오른쪽만 제거 그런 것은 없었다.
        *  */
        String trimTest = "   trimTest   ";
        System.out.println("#" + trimTest + "#");
        System.out.println("#" + trimTest.trim() + "#");

        /* 6. toLowerCase(), toUpperCase()
        * toLowerCase() : 소문자로 변환하여 반환
        * toUpperCase() : 대문자로 변환하여 반환
        * */
        String lowerStr = "HELLO WORLD ~! JAVA";
        String upperStr = "hello world ~! java";
        System.out.println(lowerStr.toLowerCase());
        System.out.println(upperStr.toUpperCase());

        /* 7. subString()
        * 문자열 일부를 잘라내어 새로운 문자열로 반환한다.
        * */
        String numStr = "0123456789";
        System.out.println(numStr.substring(5));
        System.out.println(numStr.substring(1, 4));

        /* 8. replace()
        * 기존 문자열에서 대체할 문자열로 대체하여 문자열을 반환한다.
        * */
        String repla = "hello";
        System.out.println(repla.replace('l', 'o'));
        System.out.println(repla.replace("he", "korea"));
    }
}
