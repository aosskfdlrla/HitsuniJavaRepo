package com.hitsuni.section03.map;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* HashMap 이해하고 활용할 수 있다. */
        HashMap map = new HashMap();

        /* 키와 값을 쌍으로 저장한다. 키와 값은 반드시 객체여야 한다.*/
        map.put("one", new Date());
        map.put(12, "red apple");
        map.put(33, 123);

        System.out.println("map : " + map);

        /* 키 값은 중복 저장할 수 없다. 새로운 값으로 덮어쓰기 된다. */
        map.put(12, "yellow banana");
        System.out.println("map : " + map);

        map.put(9, "yellow banana");
        System.out.println("map : " + map);

        /* 값 객체를 가져올 때 키를 통해 가져온다. */
        System.out.println("key 9에 대한 값 객체 : " + map.get(9));

        /* 키를 통해서 값을 삭제한다. */
        map.remove(9);
        System.out.println("map : " + map);

        /* 문자열 키, 값을 갖는 HashMap 생성 */
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("one", "java");
        map2.put("two", "mysql");
        map2.put("three", "jdbc");
        map2.put("four", "html");
        map2.put("five", "css");

        System.out.println(map2);

        /* Map에 저장된 값을 순회하는 방법
        * 1. keySet()
        * 키값만 뽑아서 순회해보기
        * */
        Iterator<String> keyIter = map2.keySet().iterator();
        while(keyIter.hasNext()) {
            String key = keyIter.next();
            String value = map2.get(key);
            System.out.println(key + " = " + value);
        }

        /* 코드적으로 사용하기에는 간결함 */
//        for (String key : map2.keySet()) {
//            String value = map2.get(key);
//            System.out.println(key + " = " + value);
//        }

        /* 2. value()
        * 값만 뽑아서 순회해보기
        * */
        Collection<String> values = map2.values();
        Iterator<String> valueIter = values.iterator();
        while(valueIter.hasNext()) {
            System.out.println("value : " + valueIter.next());
        }

        /* 코드적 간결 */
//        for(String value : map2.values())
//            System.out.println("value : " + value);

        /* 3. entrySet()
        * key + value 합쳐진 한 덩어리를 entry()
        * */
        Set<Map.Entry<String, String>> set = map2.entrySet();
        Iterator<Map.Entry<String, String>> setIter = set.iterator();
        while(setIter.hasNext()) {
            Map.Entry<String, String> entry = setIter.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        /* 코드적 간결 */
//        for (Map.Entry<String, String> entry : set) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
    }
}