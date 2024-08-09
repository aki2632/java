package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main08 {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

       //Main04프로그램을 메뉴기능을 넣어서
        //반복문이 종료되기 전까지
        //1.입력,2.수정,3.삭제,4.번호검색,5.모두검색,6.검색어검색 이 반복되도록 작성하세요
        //[x입력시 종료]

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PersonDAO dao = new PersonDAOimpl();


        while(true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력,2.수정,3.삭제,4.번호검색,5.모두검색,6.검색어검색..[x입력시 종료]");
            String menu = br.readLine();
            System.out.println("==========================");
            //menu = "x";
            if(menu.equals("1")){
                //입력
                System.out.println("name:");
                String name = br.readLine();
                System.out.println("age:");
                int age = Integer.parseInt(br.readLine());
                PersonVO vo = new PersonVO();
                vo.setName(name);
                vo.setAge(age);

                int result = dao.insert(vo);
                System.out.println("result:"+result);
                if(result==1){
                    System.out.println("insert successed");
                }else{
                    System.out.println("insert failed");
                }
                System.out.println("=======================");
            }else if(menu.equals("2")){
                //수정
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.println("name:");
                String name = br.readLine();
                System.out.println("age:");
                int age = Integer.parseInt(br.readLine());
                PersonVO vo = new PersonVO();
                vo.setNum(num);
                vo.setName(name);
                vo.setAge(age);

                int result = dao.update(vo);
                System.out.println("result:"+result);

                if(result==1){
                    System.out.println("update successed");
                }else{
                    System.out.println("update failed");
                }
                System.out.println("=======================");
            }else if(menu.equals("3")){
                //삭제
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());
                PersonVO vo = new PersonVO();
                vo.setNum(num);

                int result = dao.delete(vo);
                System.out.println("result:"+result);
                if(result==1){
                    System.out.println("delete successed");
                }else{
                    System.out.println("delete failed");
                }
                System.out.println("=======================");
            }else if(menu.equals("4")){
                //번호검색
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());
                PersonVO vo = new PersonVO();
                vo.setNum(num);

                PersonVO vo2 = dao.selectOne(vo);

                if(vo2 != null){
                    System.out.println("selectOne successed");
                }else{
                    System.out.println("selectOne failed");
                }
                System.out.println(vo2);
                System.out.println("=======================");
            }else if(menu.equals("5")){
                //모두검색
                List<PersonVO> list = dao.selectAll();
                for(PersonVO x: list){
                    System.out.println(x);
                }
                if(list.size()==0)System.out.println("selectAll failed");
                System.out.println("=======================");
            }else if(menu.equals("6")){
                //검색어검색
                System.out.println("searchKey:");
                String searchKey = br.readLine();
                System.out.println("searchWord:");
                String searchWord = br.readLine();
                List<PersonVO> list = dao.searchList(searchKey,searchWord);
                //list = dao.searchList("age","11");
                for(PersonVO x: list){
                    System.out.println(x);
                }
                if(list.size()==0)System.out.println("searchList failed");
                System.out.println("=======================");
            }
            //menu = "x";
            if(menu.equals("x"))break;
        }

        System.out.println("프로그램 종료");

    }//end main
}//end class
