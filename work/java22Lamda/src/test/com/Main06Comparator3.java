package test.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main06Comparator3 {


    public static void main(String[] args) {
        System.out.println("hello");

        //TestVO - name,age : 배열로하는 컬렉션을 이름의 오름차순으로 정렬
        //kim,11  lee,33  han,22 정보로 설정
        TestVO vo1 = new TestVO("kim",11);
        TestVO vo2 = new TestVO("lee",33);
        TestVO vo3 = new TestVO("han",22);

        List<TestVO> vos = Arrays.asList(vo1,vo2,vo3);

        //Comparator.comaring(::연산자 사용가능)메소드
        //vos.sort(Comparator.comparing(TestVO::getName));
        vos.sort(Comparator.comparing(TestVO::getAge));
        System.out.println(vos);

        System.out.println("end main...");
    }//end main



}//end class
