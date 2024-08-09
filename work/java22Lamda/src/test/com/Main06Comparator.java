package test.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main06Comparator {
    public static void main(String[] args) {
        System.out.println("hello");

        List<Integer> list = Arrays.asList(11,33,22);
        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1-o2;
                return o2-o1;
            }
        });
        System.out.println(list);

        //람다식으로 정렬처리해보세요...
        list.sort((o1,o2)->o1-o2);
        System.out.println(list);
        System.out.println("==========");

        Integer[] sus = new Integer[]{11,33,22};
        Arrays.sort(sus);
        System.out.println(Arrays.deepToString(sus));

        Arrays.sort(sus,(o1,o2)->o2-o1);
        System.out.println(Arrays.deepToString(sus));
        
        //문자열 정렬처리해봅시다.
        List<String> list2 = Arrays.asList("kim","lee","han");
        //람다식으로 구현해보세요

        list2.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list2);

        //TestVO - name,age : 배열로하는 컬렉션을 이름의 오름차순으로 정렬
        //kim,11  lee,33  han,22 정보로 설정
        TestVO vo1 = new TestVO("kim",11);
        TestVO vo2 = new TestVO("lee",33);
        TestVO vo3 = new TestVO("han",22);

        List<TestVO> vos = Arrays.asList(vo1,vo2,vo3);
        vos.sort((o1,o2)->o1.getName().compareTo(o2.getName()));
        System.out.println(vos);

        System.out.println("end main...");
    }//end main



}//end class
