package test.com;

public class StudentDAO {

    public int insert(StudentVO vo){
        System.out.println("insert()....");
        System.out.println(vo);
        return 0;
    }

    public int update(StudentVO vo){
        System.out.println("update()....");
        System.out.println(vo);
        return 1;
    }

    public int delete(StudentVO vo){
        System.out.println("delete()....");
        System.out.println(vo);
        return 2;
    }

    public StudentVO selectOne(StudentVO vo){
        System.out.println("selectOne()....");
        System.out.println(vo);

        return new StudentVO(22,"lee",44,55,66);
    }

    public StudentVO[] selectAll(){
        System.out.println("selectAll().....");
        StudentVO[] vos = new StudentVO[3];
        for (int i = 0; i < vos.length; i++) {
            vos[i] = new StudentVO(44,"han",77,88,99);
        }
        return vos;
    }

    public StudentVO[] searchList(String searchKey,String searchWord){
        System.out.println("searchList().....");
        System.out.println(searchKey);
        System.out.println(searchWord);
        StudentVO[] vos = new StudentVO[3];
        for (int i = 0; i < vos.length; i++) {
            vos[i] = new StudentVO(55,"han55",77,88,99);
        }
        return vos;
    }

}//end class
