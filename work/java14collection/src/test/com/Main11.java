package test.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main11 {
    public static void main(String[] args) {
        System.out.println("hello");

        //컬렉션 객체 - 자바의 자료구조 객체들
        //특징 - 배열의길이가 가변적이다.
        //구분 - 순서(인덱스)가 있는것(List계열),순서가 없는것(Set계열,Map계열)

        //1.List<제네릭-객체타입명시> - ArrayList
        //순서가있고,중복데이터 허용
        //2.Set - HashSet

        //3.Map - HashMap,HashTable
        //Map<K,V> : K(key),V(Value)
        //key는 중복허용하지 않고, Value는 중복허용
        //key의 순서는 없다.
        Map<String,Integer>  map = new HashMap<>();
        map.put("kor",99);
        map.put("kor",88);
        map.put("eng",77);
        map.put("math",66);

        System.out.println(map);
        System.out.println("map.size():"+map.size());

        System.out.println(map.get("kor"));
        System.out.println(map.get("eng"));
        System.out.println(map.get("math"));

        System.out.println(map.keySet());//Set Type
        System.out.println(map.values());

        for (String key: map.keySet()){
            System.out.println(map.get(key));
        }

    }//end main
}//end class
