package test.com.job;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JobDAOimpl implements JobDAO {

    private static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "HR";
    private static final String PASSWORD = "hi123456";
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public JobDAOimpl() {
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver successed...");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insert(JobVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);

        int flag = 0;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "INSERT INTO job (job_id, job_title, min_salary, max_salary) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getJobId());
            pstmt.setString(2, vo.getJobTitle());
            pstmt.setDouble(3, vo.getMinSalary());
            pstmt.setDouble(4, vo.getMaxSalary());

            flag = pstmt.executeUpdate();
            System.out.println("flag : " + flag);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }

    @Override
    public int update(JobVO vo) {
        System.out.println("update()...");
        System.out.println(vo);

        int flag = 0;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "UPDATE job SET job_title = ?, min_salary = ?, max_salary = ? WHERE job_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getJobTitle());
            pstmt.setDouble(2, vo.getMinSalary());
            pstmt.setDouble(3, vo.getMaxSalary());
            pstmt.setString(4, vo.getJobId());

            flag = pstmt.executeUpdate();
            System.out.println("flag : " + flag);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }

    @Override
    public int delete(JobVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);

        int flag = 0;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "DELETE FROM job WHERE job_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getJobId());

            flag = pstmt.executeUpdate();
            System.out.println("flag : " + flag);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }

    @Override
    public JobVO selectOne(JobVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);

        JobVO vo2 = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "SELECT * FROM job WHERE job_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getJobId());

            rs = pstmt.executeQuery();

            if (rs.next()) {
                vo2 = new JobVO();
                vo2.setJobId(rs.getString("job_id"));
                vo2.setJobTitle(rs.getString("job_title"));
                vo2.setMinSalary(rs.getDouble("min_salary"));
                vo2.setMaxSalary(rs.getDouble("max_salary"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vo2;
    }

    @Override
    public List<JobVO> selectAll() {
        System.out.println("selectAll()...");
        List<JobVO> list = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "SELECT * FROM job";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                JobVO vo = new JobVO();
                vo.setJobId(rs.getString("job_id"));
                vo.setJobTitle(rs.getString("job_title"));
                vo.setMinSalary(rs.getDouble("min_salary"));
                vo.setMaxSalary(rs.getDouble("max_salary"));
                list.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    @Override
    public List<JobVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<JobVO> vos = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "SELECT * FROM job WHERE " + searchKey + " LIKE ?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + searchWord + "%");

            rs = pstmt.executeQuery();

            while (rs.next()) {
                JobVO vo = new JobVO();
                vo.setJobId(rs.getString("job_id"));
                vo.setJobTitle(rs.getString("job_title"));
                vo.setMinSalary(rs.getDouble("min_salary"));
                vo.setMaxSalary(rs.getDouble("max_salary"));
                vos.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vos;
    }
}

