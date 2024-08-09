package test.com.comments;

import test.com.member.MemberVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CommentsDAOimpl implements CommentsDAO {

    // 3-1: 전역변수 설정
    private static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "JAVA";
    private static final String PASSWORD = "hi123456";
    private Connection conn; // 커넥션 객체
    private PreparedStatement pstmt; // 쿼리(sql문-CRUD) 실행 객체
    private ResultSet rs; // select문 리턴 객체

    public CommentsDAOimpl() {
        // 1. JDBC 라이브러리 세팅(경로설정)
        // C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib : ojdbc6.jar 복사
        // 내 프로젝트 >> lib 폴더(없다면 생성)에 >> 복붙
        // 상단 메뉴> File > Project Structure > Libraries > + : java 선택 > 복붙 경로 > ojdbc6.jar 선택

        // 2. 오라클 드라이버 클래스 찾아서 인식(연동) - 객체 생성 시 즉 생성자에서 구현
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver successed...");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 3. URL(호스트), 사용자명, 비번을 이용하여 데이터베이스 연동
        // 3-1 - 전역변수 선언
        // 3-2 - 각 메소드에서 구현
    }

    @Override
    public int insert(CommentsVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);

        int flag = 0;

        // 3-2: 커넥션
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "insert into comments(num, content, writer, wdate, bnum) values(seq_comments.nextval, ?, ?, sysdate, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getContent());
            pstmt.setString(2, vo.getWriter());
            pstmt.setInt(3, vo.getBnum());

            flag = pstmt.executeUpdate(); // DML
            System.out.println("flag: " + flag);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }

    @Override
    public int update(CommentsVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        int flag = 0;

        // 3-2: 커넥션
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "update comments set content=?, writer=? where num=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getContent());
            pstmt.setString(2, vo.getWriter());
            pstmt.setInt(3, vo.getNum());

            flag = pstmt.executeUpdate(); // DML
            System.out.println("flag: " + flag);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }

    @Override
    public int delete(CommentsVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        int flag = 0;

        // 3-2: 커넥션
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "delete from comments where num=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getNum());

            flag = pstmt.executeUpdate(); // DML
            System.out.println("flag: " + flag);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }

    @Override
    public CommentsVO selectOne(CommentsVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);

        CommentsVO vo2 = null;

        // 3-2: 커넥션
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "select * from comments where num=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getNum());

            rs = pstmt.executeQuery();

            while (rs.next()) {
                vo2 = new CommentsVO();
                vo2.setNum(rs.getInt("num"));
                vo2.setContent(rs.getString("content"));
                vo2.setWriter(rs.getString("writer"));
                vo2.setWdate(rs.getDate("wdate"));
                vo2.setBnum(rs.getInt("bnum"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vo2;
    }

    @Override
    public List<CommentsVO> selectAll() {
        System.out.println("selectAll()...");
        List<CommentsVO> list = new ArrayList<>();

        // 3-2: 커넥션
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "select * from comments order by num desc";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                CommentsVO vo = new CommentsVO();
                vo.setNum(rs.getInt("num"));
                vo.setContent(rs.getString("content"));
                vo.setWriter(rs.getString("writer"));
                vo.setWdate(rs.getDate("wdate"));
                vo.setBnum(rs.getInt("bnum"));
                list.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    @Override
    public List<CommentsVO> searchList(String searchKey,
                                     String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<CommentsVO> vos = new ArrayList<>();

        //3-2 : 커넥션
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed...");
            String sql = "";
            if(searchKey.equals("writer")){
                sql = "select * from member where name like ? order by num desc";
            }else if(searchKey.equals("content")){
                sql = "select * from member where tel like ? order by num desc";
            }

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"%"+searchWord+"%");

            //5. 반환(응답)
            rs = pstmt.executeQuery();//select문에서 만 사용하는 함수

            //6. rs >>> list에 할당
            while(rs.next()){//읽어들일 행이 있으면 true
                CommentsVO vo = new CommentsVO();
                vo.setNum(rs.getInt("num"));
                vo.setContent(rs.getString("content"));
                vo.setWriter(rs.getString("writer"));
                vo.setWdate(rs.getDate("wdate"));
                vo.setBnum(rs.getInt("bnum"));
                vos.add(vo);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vos;
    }
}
