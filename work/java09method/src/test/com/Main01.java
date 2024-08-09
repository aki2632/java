package test.com;

public class Main01 {

    public static void main(String[] args) {
        System.out.println("hello");

        BoardVO vo = new BoardVO();
        vo = new BoardVO();
        System.out.println(vo.toString());

        BoardDAO dao = new BoardDAO();
        dao.insert();//void 변수할당안되고 출력문에서도 안받아줌
        int x = 99;
        dao.update(x);
        dao.update(99,88);
        dao.update(99,"kim");
        dao.update("lee",77);
        dao.update(11,"title11","content11","writer11","2024-11-11");
        dao.update(vo);
        vo = new BoardVO(11,"title11","content11","writer11","2024-11-11");
        dao.update(vo);
        System.out.println("==================");

        int result = dao.delete();
        System.out.println("result:"+result);

        String result2 = dao.delete2();
        System.out.println("result2:"+result2);

        int[] arr = dao.delete3();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[] arr2 = dao.delete4();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        
        BoardVO bvo = dao.delete5();//에러없도록 구현
        //bvo 필드값들 출력
        System.out.println(bvo);
//        System.out.println(bvo.num);
//        System.out.println(bvo.title);
//        System.out.println(bvo.content);
//        System.out.println(bvo.writer);
//        System.out.println(bvo.wdate);

        BoardVO[] bvos = dao.delete6();//에러없도록 구현
        //bvos 배열의 필드값들 출력
        for (int i = 0; i < bvos.length; i++) {
            System.out.println(bvos[i]);
//            System.out.print(bvos[i].num+" ");
//            System.out.print(bvos[i].title+" ");
//            System.out.print(bvos[i].content+" ");
//            System.out.print(bvos[i].writer+" ");
//            System.out.println(bvos[i].wdate);
        }


        System.out.println("=================");

        int re = dao.select1(11,22);
        System.out.println("re:"+re);

        re = dao.select2(11,22,33,44);
        System.out.println("re:"+re);

        re = dao.select3(11,22,33,44,55,66,77,88,99);
        System.out.println("re:"+re);

        re = dao.select3(new int[]{11,22,33,44,55,66,77,88,99});
        System.out.println("re:"+re);

        BoardVO[] bvos3 = dao.select4(new BoardVO());
        //print~~~
        for (int i = 0; i < bvos3.length; i++) {
//            System.out.print(bvos3[i].num+" ");
//            System.out.print(bvos3[i].title+" ");
//            System.out.print(bvos3[i].content+" ");
//            System.out.print(bvos3[i].writer+" ");
//            System.out.println(bvos3[i].wdate);
            System.out.println(bvos3[i]);
        }

        BoardVO[] bvos4 = dao.select5("searchKey","searchWord");
        //print~~~
        for (int i = 0; i < bvos4.length; i++) {
//            System.out.print(bvos4[i].num+" ");
//            System.out.print(bvos4[i].title+" ");
//            System.out.print(bvos4[i].content+" ");
//            System.out.print(bvos4[i].writer+" ");
//            System.out.println(bvos4[i].wdate);
            System.out.println(bvos4[i]);
        }

        //return;//생략되어있음.
    }//end main
}//end class
