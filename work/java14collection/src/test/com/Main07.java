package test.com;

import java.util.*;

public class Main07 {
    public static void main(String[] args) {
        System.out.println("hello");

        //컬렉션 객체 - 자바의 자료구조 객체들
        //특징 - 배열의길이가 가변적이다.
        //구분 - 순서(인덱스)가 있는것(List계열),순서가 없는것(Set계열,Map계열)

        //1.List<제네릭-객체타입명시> - ArrayList
        //순서가있고,중복데이터 허용

        //2.Set - HashSet
        //순서가없고,중복데이터 허용안함
        //미션 - 로또번호 생성하기.
        //랜덤객체 사용하시구요.
        Random r = new Random();


        Set<Integer> set = new HashSet<>();
        while(set.size()<6){
            int su = r.nextInt(45)+1;
            System.out.println(su);
            set.add(su);
        }
        System.out.println(set);

        Object[] arr = set.toArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("=============");

        //또다른 정렬
        List<Integer> list = new ArrayList<>(set);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        //역정렬가능
//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println(list);
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
////                return o1-o2;//순정렬
//                return o2-o1;//역정렬
//            }
//        });
//        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//순정렬
            }
        });
        System.out.println(list);


        List<String> names = new ArrayList<>();
        names.add("aaa");
        names.add("ccc");
        names.add("bbb");

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
                return o2.compareTo(o1);
            }
        });
        System.out.println(names);

        List<PersonVO> vos = new ArrayList<>();
        PersonVO vo = new PersonVO();
        vo.setNum(1);
        vo.setName("kim");
        vo.setAge(33);
        vos.add(vo);
        vo = new PersonVO();
        vo.setNum(2);
        vo.setName("han");
        vo.setAge(55);
        vos.add(vo);
        vo = new PersonVO();
        vo.setNum(3);
        vo.setName("yang");
        vo.setAge(22);
        vos.add(vo);
        System.out.println(vos);
        //이름의 오름차순정렬
        vos.sort(new Comparator<PersonVO>() {
            @Override
            public int compare(PersonVO o1, PersonVO o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(vos);
        //나이의 내림차순정렬
        vos.sort(new Comparator<PersonVO>() {
            @Override
            public int compare(PersonVO o1, PersonVO o2) {
                return o2.getAge()-o2.getAge();
            }
        });
        System.out.println(vos);

        //MemberVO 를 이용해서 ArrayList에 추가하고
        //이름으로 내림차순정렬

        //폰번으로 오름차순정렬



        //3.Map - HashMap,HashTable



    }//end main
}//end class
