package test.com;

public class MemberDAO {

    public void insert(){
        System.out.println("insert()....");
    }

    public void update(int num,String id,String pw,String name,String tel){
        System.out.println("update()......");
        System.out.print(num+" ");
        System.out.print(id+" ");
        System.out.print(pw+" ");
        System.out.print(name+" ");
        System.out.println(tel);
    }

    public void update(MemberVO vo){
        System.out.println("update()......");
//        System.out.print(vo.num+" ");
//        System.out.print(vo.id+" ");
//        System.out.print(vo.pw+" ");
//        System.out.print(vo.name+" ");
//        System.out.println(vo.tel);
        System.out.println(vo.toString());
        System.out.println(vo);
    }

    public MemberVO delete(){
        System.out.println("delete()....");
        //return new MemberVO();
        return new MemberVO(22,"admin2","hi2222","lee22","02");
    }

    public int delete2(){
        System.out.println("delete2()....");
        return 1;
    }


    public MemberVO select(MemberVO vo) {
        System.out.println("select()....");
        System.out.println(vo);
//        System.out.print(vo.num+" ");
//        System.out.print(vo.id+" ");
//        System.out.print(vo.pw+" ");
//        System.out.print(vo.name+" ");
//        System.out.println(vo.tel);
        return new MemberVO(222,"admin2","hi2222","lee22","02");
    }

    public MemberVO[] select(String searchKey,String searchWord) {
        System.out.println("select()....");
        System.out.print(searchKey+" ");
        System.out.println(searchWord);
        MemberVO[] mvos = new MemberVO[3];
        for (int i = 0; i < mvos.length; i++) {
            mvos[i] = new MemberVO(444,"admin2","hi2222","lee22","02");
        }
        return mvos;
    }
}//end class
