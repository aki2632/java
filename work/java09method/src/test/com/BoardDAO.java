package test.com;

public class BoardDAO {
    //데이터베이스와 연동해서 CRUD(입력,수정,삭제,검색) 처리기능용..

    //메소드 - 리턴타입을 반드시 명시,리턴값이 없다면 void명시
    //      리턴값이 있다면 해당리터럴의 타입을 명시해줘야함.

    //1.입력-insert,create   인자없고,리턴없고
    void insert() {
        System.out.println("insert()....");
        //return;//리턴할값(리터럴)이 없다면 생략가능.
    }

    //2.수정-update, 인자있고, 리턴없고
    //메소드의 인자(아큐먼트-argument)는 0개이상
    //같은이름의 메소드사용시는 오버로딩 규칙(순서,타입,개수)을 지켜주면 사용가능하다
    //오버로딩 - 클래스내부에 동일한 생성자,메소드의 이름을 사용하기위한 규칙
    void update(int x) {
        System.out.println("update()...x:" + x);
    }

    void update(BoardVO vo) {
        System.out.println("update()...vo:" + vo);
        System.out.println(vo);
//        System.out.println(vo.num);
//        System.out.println(vo.title);
//        System.out.println(vo.content);
//        System.out.println(vo.writer);
//        System.out.println(vo.wdate);
    }

    void update(int x, int y) {
        System.out.println("update()...x:" + x + ",y:" + y);
    }

    void update(int x, String y) {
        System.out.println("update()...x:" + x + ",y:" + y);
    }

    void update(String x, int y) {
        System.out.println("update()...x:" + x + ",y:" + y);
    }

    void update(int num,
                String title,
                String content,
                String writer,
                String wdate) {
        System.out.println("update(AllArgs)...");
        System.out.println(num);
        System.out.println(title);
        System.out.println(content);
        System.out.println(writer);
        System.out.println(wdate);
    }


    //3.삭제-delete,remove,,인자없고,리턴있고
    int delete(){
        System.out.println("delete1()...");
        int x = 99;
        return x;
    }
    String delete2(){
        System.out.println("delete2()...");
        String x = "lee";
        return x;
    }

    int[] delete3(){
        System.out.println("delete3()...");
        int[] sus = new int[3];
        return sus;
    }

    String[] delete4(){
        System.out.println("delete4()...");
        String[] arr = new String[5];

        return arr;
    }

    BoardVO delete5() {
        System.out.println("delete5()...");
        //return new BoardVO();
        return new BoardVO(22,"aaa","bbb","ccc","ddd");
    }

    public BoardVO[] delete6() {
        System.out.println("delete6()...");
        //return new BoardVO[3];//null,null,null

        BoardVO[] bvos = new BoardVO[3];
        for (int i = 0; i < bvos.length; i++) {
            //bvos[i] = new BoardVO();
            bvos[i] = new BoardVO(10,"aaa","bbb","ccc","ddd");
        }
        return bvos;
    }


    //4.검색-search,read,select   인자있고,리턴있고
    int select1(int x, int y){
        System.out.println("select1()...");
        return 1;
    }
    int select2(int x1,int x2,int x3,int x4){
        System.out.println("select2()...");
        return x1+x2+x3+x4;
    }

    //...연산자-매개변수선언 영역에 사용되며, 해당변수는 배열이된다
    int select3(int ... arr){
        System.out.println("select3()...");
        System.out.println(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        return sum;
    }

    BoardVO[] select4(BoardVO vo){
        System.out.println("select4()...");
        System.out.println(vo);
//        System.out.println(vo.num);
//        System.out.println(vo.title);
//        System.out.println(vo.content);
//        System.out.println(vo.writer);
//        System.out.println(vo.wdate);

        BoardVO[] bvos = new BoardVO[3];
        for (int i = 0; i < bvos.length; i++) {
            //bvos[i] = new BoardVO();
            bvos[i] = new BoardVO(10,"aaa","bbb","ccc","ddd");
        }
        return bvos;
    }


    public BoardVO[] select5(String searchKey, String searchWord) {
        System.out.println("select5()....");
        System.out.println(searchKey);
        System.out.println(searchWord);

        BoardVO[] bvos = new BoardVO[3];
        for (int i = 0; i < bvos.length; i++) {
            //bvos[i] = new BoardVO();
            bvos[i] = new BoardVO(77,"aaa","bbb","ccc","ddd");
        }
        return bvos;
    }
}//end class
