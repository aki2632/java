package test.com;

import java.util.HashMap;
import java.util.Map;

public class Main12 {
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
        Map<String,String>  map = new HashMap<>();
        //임의의 키,값을 할당해서 길이,반복문 출력하세요
        map.put("name","kim");
        map.put("id","admin");

        System.out.println(map.size());
        for(String key: map.keySet()){
            System.out.println(map.get(key));
        }
        System.out.println("===============");

        Map<String,PersonVO>  map2 = new HashMap<>();
        //임의의 키,값을 할당해서 길이,반복문 출력하세요
        map2.put("p01",new PersonVO());
        PersonVO vo = new PersonVO();
        vo.setNum(11);
        vo.setName("lee");
        vo.setAge(33);
        map2.put("p02",vo);
        System.out.println(map2.size());
        for(String key: map2.keySet()){
            System.out.println(map2.get(key));
        }
        System.out.println("===============");

        Map<String,MemberVO>  map3 = new HashMap<>();
        //임의의 키,값을 할당해서 길이,반복문 출력하세요

        Map<String,BoardVO>  map4 = new HashMap<>();
        //임의의 키,값을 할당해서 길이,반복문 출력하세요

    }//end main
}//end class
