package com.hitsuni.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        list2.add(4);
        System.out.println(list2);

        List<Integer> intList = Arrays.asList(1, 2, 3);
        intList.forEach(value -> System.out.print(value + ", "));

        List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        Stream<Integer> streamInt = list3.stream();
        streamInt.forEach(value-> System.out.print(value + " "));
    }
}
