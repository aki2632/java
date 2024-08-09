package test.com;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //컬렉션 객체 - 자바의 자료구조 객체들
        //특징 - 배열의길이가 가변적이다.
        //구분 - 순서(인덱스)가 있는것(List계열),순서가 없는것(Set계열,Map계열)

        //1.List<제네릭-객체타입명시> - ArrayList
        //순서가있고,중복데이터 허용
        List<Integer> list = new ArrayList<>();
        //데이터추가
        list.add(1111);
        list.add(11111);
        list.add(111111);
        list.add(1111111);
        System.out.println(list);

        //데이터 길이
        System.out.println("list.size():"+list.size());

        //데이터 획득
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        //fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //foreach
        for(Integer x:list){
            System.out.println(x);
        }

        //데이터 변경
        list.set(1,2222);
        System.out.println(list);

        //데이터 삭제
        list.remove(2);
        System.out.println(list);

        //데이터 모두삭제
        list.clear();
        System.out.println("list.size():"+list.size());



        //2.Set - HashSet


        //3.Map - HashMap,HashTable



    }//end main
}//end class
