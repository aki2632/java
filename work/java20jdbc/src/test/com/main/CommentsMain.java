package test.com.main;

import test.com.comments.CommentsDAO;
import test.com.comments.CommentsDAOimpl;
import test.com.comments.CommentsVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class CommentsMain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        CommentsDAO dao = new CommentsDAOimpl();

        while (true) {
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력,2.수정,3.삭제,4.번호검색,5.모두검색,6.검색어검색..[x입력시 종료]");
            String menu = br.readLine();
            System.out.println("==========================");

            // 1. insert
            if (menu.equals("1")) {
                System.out.println("게시글 번호 (bnum):");
                int bnum = Integer.parseInt(br.readLine());
                System.out.println("content:");
                String content = br.readLine();
                System.out.println("writer:");
                String writer = br.readLine();

                CommentsVO vo = new CommentsVO();
                vo.setBnum(bnum);
                vo.setContent(content);
                vo.setWriter(writer);

                int result = dao.insert(vo);
                System.out.println("result: " + result);
                if (result == 1) {
                    System.out.println("insert successed...");
                } else {
                    System.out.println("insert failed...");
                }
                System.out.println("=================");
            } else if (menu.equals("2")) {
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.println("content:");
                String content = br.readLine();
                System.out.println("writer:");
                String writer = br.readLine();

                CommentsVO vo = new CommentsVO();
                vo.setNum(num);
                vo.setContent(content);
                vo.setWriter(writer);

                int result = dao.update(vo);
                System.out.println("result: " + result);
                if (result == 1) {
                    System.out.println("update successed...");
                } else {
                    System.out.println("update failed...");
                }
                System.out.println("=================");
            } else if (menu.equals("3")) {
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                CommentsVO vo = new CommentsVO();
                vo.setNum(num);

                int result = dao.delete(vo);
                System.out.println("result: " + result);
                if (result == 1) {
                    System.out.println("delete successed...");
                } else {
                    System.out.println("delete failed...");
                }
                System.out.println("=================");
            } else if (menu.equals("4")) {
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                CommentsVO vo = new CommentsVO();
                vo.setNum(num);

                CommentsVO vo2 = dao.selectOne(vo);
                System.out.println(vo2);
                if (vo2 != null) {
                    System.out.println("selectOne successed...");
                } else {
                    System.out.println("selectOne failed...");
                }
                System.out.println("=================");
            } else if (menu.equals("5")) {
                // 5. selectAll
                List<CommentsVO> list = dao.selectAll();
                System.out.printf("%3s %20s %10s %20s %5s \n", "댓글번호", "내용", "작성자", "작성일자", "게시글번호");
                for (CommentsVO x : list) {
                    // System.out.println(x);
                    System.out.printf("%3d %20s %10s %20s %5d \n",
                            x.getNum(), x.getContent(), x.getWriter(), x.getWdate(), x.getBnum());
                }
                System.out.println("=================");
            } else if (menu.equals("6")) {
                //검색어검색
                System.out.println("searchKey:");
                String searchKey = br.readLine();
                System.out.println("searchWord:");
                String searchWord = br.readLine();
                List<CommentsVO> list = dao.searchList(searchKey,searchWord);
                System.out.printf("%3s %20s %10s %20s %5s \n", "댓글번호", "내용", "작성자", "작성일자", "게시글번호");

                for (CommentsVO x : list) {
                    // System.out.println(x);
                    System.out.printf("%3d %20s %10s %20s %5d \n",
                            x.getNum(), x.getContent(), x.getWriter(), x.getWdate(), x.getBnum());
                }
                if(list.size()==0)System.out.println("searchList failed");
                System.out.println("=======================");
            }

            if (menu.equals("x")) break;
        }
        System.out.println("프로그램 종료");

    } // end main
}
