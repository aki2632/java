package test.com;

import java.util.ArrayList;
import java.util.List;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        //데이터타입 : PersonVO
        //PersonDAO : 인터페이스 입력,수정,삭제,검색용 추상메소드(6개)
        //PersonDAOimpl : PersonDAO를 상속받기.
        //PersonDAOimpl(전역변수ArrayList)를 이용해서 메인에서 입력한 값들로
        // 입력 ,수정, 삭제 ,검색 구현

        PersonDAO dao = new PersonDAOimpl();

        //1.insert
        PersonVO vo = null;
        int result = 0;
        for (int i = 0; i < 5; i++) {
            vo = new PersonVO();
            vo.setNum(1+i);
            vo.setName("kim"+(1+i));
            vo.setAge(11+i);

            result = dao.insert(vo);
            System.out.println("result:"+result);
        }
        System.out.println("=======================");
        //2.update
        vo = new PersonVO();
        vo.setNum(2);
        vo.setName("lee2");
        vo.setAge(22);

        result = dao.update(vo);
        System.out.println("result:"+result);
        System.out.println("=======================");
        //3.delete
        vo = new PersonVO();
        vo.setNum(3);

        result = dao.delete(vo);
        System.out.println("result:"+result);
        System.out.println("=======================");

        //4.selectOne
        vo = new PersonVO();
        vo.setNum(1);

        PersonVO vo2 = dao.selectOne(vo);
        System.out.println(vo2);

        System.out.println("=======================");
        //5.selectAll
        List<PersonVO> list = dao.selectAll();
        for(PersonVO x: list){
            System.out.println(x);
        }
        System.out.println("=======================");
        //6.searchList
        list = dao.searchList("name","ki");
        //list = dao.searchList("age","11");
        for(PersonVO x: list){
            System.out.println(x);
        }


    }//end main
}//end class
