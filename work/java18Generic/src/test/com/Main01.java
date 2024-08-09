package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main01 {
    public static void main(String[] args) {
        // 제네릭 - Genenric
        // 타입을 특정해줌으로써 가독성, 명확성을 높여준다.

        // <> 기호 안에 여러타입을 담을 수 있다. - 단, 객체타입만 가능
        // List에서 제네릭을 사용하지 않으면 서로 다른 타입을 담을 수 있도록 허용한다.
        List arr1 = new ArrayList();
        arr1.add(111);
        arr1.add("kim");
        arr1.add(new Thread());
        
        // javascript - arr = [11, "kim", [33, 44], {name:"lee"},,,]
        List arr2 = Arrays.asList(222, new Integer[]{11, 22}, new Thread());
        System.out.println(arr2.get(0));
        System.out.println(arr2.get(0).getClass());
        System.out.println(arr2.get(0).getClass().getName());
        System.out.println(arr2.get(1).getClass());
        System.out.println(arr2.get(1).getClass().getName());
        System.out.println(arr2.get(2).getClass());
        System.out.println(arr2.get(2).getClass().getName());
        
        // 위와 같이 사용하는것은 프로그램 유지보수 및 개발에 불편함
        // jdk5 버전 이후부터는 타입을 특정
        // List<E>
        // Map<K, V>
        // T: Type, E: Element, K: Key, V: Value, N: Number, ? == Object: AnyType
        // 컬렉션 클래스와 같이 배열 기반으로 되어 있는 구조에는 E가 어울리고, 그 외에는 T
        List<Object> list1 = Arrays.asList(222, new Integer[]{11, 22}, new Thread());
        List<?> list2 = Arrays.asList(222, new Integer[]{11, 22}, new Thread());
    }
}
