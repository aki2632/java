package test.com;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOimpl implements PersonDAO{

    List<PersonVO> list = new ArrayList<>();

    @Override
    public int insert(PersonVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        int flag = 0;
        if(list.size()==0){
            vo.setNum(1);
        }else{
            vo.setNum(list.get(list.size()-1).getNum()+1);
        }
        list.add(vo);
        flag = 1;
        return flag;
    }

    @Override
    public int update(PersonVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum()==vo.getNum()){
                list.set(i,vo);
                flag = 1;
            }
        }

        return flag;
    }

    @Override
    public int delete(PersonVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum()==vo.getNum()){
                list.remove(i);
                flag = 1;
            }
        }

        return flag;
    }

    @Override
    public PersonVO selectOne(PersonVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        PersonVO vo2 = null;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum()==vo.getNum()){
                vo2 = list.get(i);
            }
        }

        return vo2;
    }

    @Override
    public List<PersonVO> selectAll() {
        System.out.println("selectAll()..");

        return list;
    }

    @Override
    public List<PersonVO> searchList(String searchKey,
                                     String searchWord) {
        System.out.println("searchList()....");
        System.out.println(searchKey);
        System.out.println(searchWord);

        if(searchKey.equals("name")){
            List<PersonVO> vos = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getName().contains(searchWord)){
                    vos.add(list.get(i));
                }
            }
            return vos;
        }else{
            List<PersonVO> vos = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getAge()==Integer.parseInt(searchWord)){
                    vos.add(list.get(i));
                }
            }
            return vos;
        }
    }//end searchList()


}//end class
