package com.java_base;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Collection {
    public static void main(String[] args) {

//        1. 자료형 - 리스트
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();

//        1-1. add
        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world!");
        System.out.println("l1 = " + l1);

        l1.add(0,1);
        System.out.println("l1 = " + l1);

//        1-2. get
        System.out.println(l1.get(0));   // 리스트 안 값 출력
        System.out.println(l1.get(3));

//        1-3. size
        System.out.println(l1.size()); // 리스트 원소(데이터) 개수 몇개인지

//        1-4. remove
        System.out.println(l1.remove(0));
        System.out.println("l1 = " + l1);
        System.out.println(l1.remove(Integer.valueOf(2)));
        System.out.println("l1 = " + l1);

//        1-5. clear
        l1.clear();
        System.out.println("l1 = " + l1); // 전부 지우기

//        1-6. sort
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);
        System.out.println("l2 = " + l2);

        l2.sort(Comparator.naturalOrder());   // 오름 차순 3, 4, 5
        System.out.println("l2 = " + l2);
        l2.sort(Comparator.reverseOrder());   // 내림 차순 5, 4, 3
        System.out.println("l2 = " + l2);

//        1-7. contains
        System.out.println(l2.contains(1));  // 있는지 확인 false
        System.out.println(l2.contains(3));  // true

//        2. Maps
        System.out.println("== Maps ==");   // 쌍을 이뤄서 저장하는 자료형
        HashMap map = new HashMap();

//        2-1. put
        map.put("kiwi", 9000);  // 순서는 보장되지 않기 때문에 index 가 아닌 키값을 가지고 값에 접근해야함
        map.put("apple", 10000);
        map.put("mango", 12000);
        System.out.println("map = " + map);

//        2.2. get
        System.out.println(map.get("mandarine"));  // 키 가 없으니까 null
        System.out.println(map.get("kiwi"));   // 9000

//        2.3. size
        System.out.println(map.size());

//        2.4. remove
        System.out.println(map.remove("kiwi"));   // 지워지면서 키에 매칭된 값을 반환 9000
        System.out.println(map.remove("mandarine"));  // 없으니까 null
        System.out.println("map = " + map);

//        2.5. containsKey
        System.out.println(map.containsKey("apple"));  // 있으니까 true
        System.out.println(map.containsKey("kiwi"));   // false

//        3. Generics
        System.out.println("== Generics ==");
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l1.add("hello");
        System.out.println("l3 = " + l3);

        ArrayList<String> l4 = new ArrayList<>();
//        l4.add(1);
        l4.add("hello");
        System.out.println("l4 = " + l4);

        HashMap map1 = new HashMap();
        map1.put(123, "id");
        map1.put("apple", 10000);
        System.out.println("map1 = " + map1);

        HashMap<String, Integer> map2 = new HashMap<>();
//        map2.put(123, "id");
        map2.put("apple", 10000);
        System.out.println("map2 = " + map2);
    }
}
