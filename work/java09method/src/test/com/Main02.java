package test.com;

public class Main02 {

    public static void main(String[] args) {
        System.out.println("hello");

        //MemberVO,MemberDAO
        //방금 수업BoardDAO처럼 MemberDAO에 메소드 정의하고
        //Main02클래스에 출력하는 연습하세요

        MemberDAO dao = new MemberDAO();
        dao.insert();
        dao.update(11,"admin","hi1234","kim","010");
        dao.update(new MemberVO(111,"admin","hi1234","kim","010"));

        MemberVO mvo = dao.delete();
//        System.out.print(mvo.num+" ");
//        System.out.print(mvo.id+" ");
//        System.out.print(mvo.pw+" ");
//        System.out.print(mvo.name+" ");
//        System.out.println(mvo.tel);
        System.out.println(mvo);

        int result = dao.delete2();
        System.out.println("result:"+result);

        MemberVO mvo2 = dao.select(new MemberVO(33,null,null,null,null));
//        System.out.print(mvo2.num+" ");
//        System.out.print(mvo2.id+" ");
//        System.out.print(mvo2.pw+" ");
//        System.out.print(mvo2.name+" ");
//        System.out.println(mvo2.tel);
        System.out.println(mvo2);

        MemberVO[] mvos = dao.select("name","kim");
        for (int i = 0; i < mvos.length; i++) {
//            System.out.print(mvos[i].num+" ");
//            System.out.print(mvos[i].id+" ");
//            System.out.print(mvos[i].pw+" ");
//            System.out.print(mvos[i].name+" ");
//            System.out.println(mvos[i].tel);
            System.out.println(mvos[i]);
        }

    }//end main


}//end class
