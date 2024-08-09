package test.com.dept;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOimpl implements DeptDAO {

    private static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "HR";
    private static final String PASSWORD = "hi123456";
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public DeptDAOimpl() {
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver successed...");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insert(DeptVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);

        int flag = 0;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "INSERT INTO dept (department_id, department_name, location_id) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getDepartmentId());
            pstmt.setString(2, vo.getDepartmentName());
            pstmt.setInt(3, vo.getLocationId());

            flag = pstmt.executeUpdate();
            System.out.println("flag : " + flag);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }

    @Override
    public int update(DeptVO vo) {
        System.out.println("update()...");
        System.out.println(vo);

        int flag = 0;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "UPDATE dept SET department_name = ?, location_id = ? WHERE department_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getDepartmentName());
            pstmt.setInt(2, vo.getLocationId());
            pstmt.setInt(3, vo.getDepartmentId());

            flag = pstmt.executeUpdate();
            System.out.println("flag : " + flag);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }

    @Override
    public int delete(DeptVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);

        int flag = 0;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "DELETE FROM dept WHERE department_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getDepartmentId());

            flag = pstmt.executeUpdate();
            System.out.println("flag : " + flag);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }

    @Override
    public DeptVO selectOne(DeptVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);

        DeptVO vo2 = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "SELECT * FROM dept WHERE department_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getDepartmentId());

            rs = pstmt.executeQuery();

            if (rs.next()) {
                vo2 = new DeptVO();
                vo2.setDepartmentId(rs.getInt("department_id"));
                vo2.setDepartmentName(rs.getString("department_name"));
                vo2.setLocationId(rs.getInt("location_id"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vo2;
    }

    @Override
    public List<DeptVO> selectAll() {
        System.out.println("selectAll()...");
        List<DeptVO> list = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "SELECT * FROM dept";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                DeptVO vo = new DeptVO();
                vo.setDepartmentId(rs.getInt("department_id"));
                vo.setDepartmentName(rs.getString("department_name"));
                vo.setLocationId(rs.getInt("location_id"));
                list.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    @Override
    public List<DeptVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<DeptVO> vos = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "SELECT * FROM dept WHERE " + searchKey + " LIKE ?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + searchWord + "%");

            rs = pstmt.executeQuery();

            while (rs.next()) {
                DeptVO vo = new DeptVO();
                vo.setDepartmentId(rs.getInt("department_id"));
                vo.setDepartmentName(rs.getString("department_name"));
                vo.setLocationId(rs.getInt("location_id"));
                vos.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vos;
    }
}
