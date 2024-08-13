package com.hitsuni.section01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /* Stream 에 대해서 이해하고 활용할 수 있다. */
        List<String> list = new ArrayList<>(Arrays.asList("hello", "stream", "world", ""));

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String str = iterator.next();
            if(str.equals("stream")) {
                System.out.println("걸러낸 값 : " + str);
            }
        }

        /* Iterator 대신 Stream의 기능을 활용 */
        list.stream().filter("stream"::equals).forEach(str -> System.out.println("걸러낸 값 : " + str));
    }
}
