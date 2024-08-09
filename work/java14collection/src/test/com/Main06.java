package test.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main06 {
    public static void main(String[] args) {
        System.out.println("hello");

        //컬렉션 객체 - 자바의 자료구조 객체들
        //특징 - 배열의길이가 가변적이다.
        //구분 - 순서(인덱스)가 있는것(List계열),순서가 없는것(Set계열,Map계열)

        //1.List<제네릭-객체타입명시> - ArrayList
        //순서가있고,중복데이터 허용

        //2.Set - HashSet
        //순서가없고,중복데이터 허용안함
        Set<Integer> set = new HashSet<>();
        set.add(1111);
        set.add(111111);
        set.add(1111);
        set.add(111111);
        set.add(2222);
        set.add(222222);
        set.add(2222222);
        set.add(22222222);
        System.out.println(set);
        System.out.println("set.size():"+set.size());

        for(Integer x: set){
            System.out.println(x);
        }

        set.remove(1111);
        System.out.println(set);

        set.clear();
        System.out.println(set);

        Set<String> set2 = new HashSet<>();
        set2.add("kim1");
        set2.add("kim11");
        set2.add("kim1");
        set2.add("kim11");
        System.out.println(set2);

        Set<Car> set3 = new HashSet<>();
        //Car 클래스에서 equals & hashCode메소드를 재정의하면
        //데이터 클래스로 사용(주소비교가아닌, 속성비교)가능하다.
        set3.add(new Car());
        set3.add(new Car());
        set3.add(new Car("OOOO"));
        set3.add(new Car("OOOO"));
        set3.add(new Car("SM"));
        set3.add(new Car("SM"));
        System.out.println(set3);

        //3.Map - HashMap,HashTable



    }//end main
}//end class
