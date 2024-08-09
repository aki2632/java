package test.com.emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDAOimpl implements EmpDAO {

    private static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "HR";
    private static final String PASSWORD = "hi123456";
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public EmpDAOimpl() {
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver successed...");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insert(EmpVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);

        int flag = 0;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "insert into emp(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) values(seq_emp.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getFirstName());
            pstmt.setString(2, vo.getLastName());
            pstmt.setString(3, vo.getEmail());
            pstmt.setString(4, vo.getPhoneNumber());
            pstmt.setString(5, vo.getHireDate());
            pstmt.setString(6, vo.getJobId());
            pstmt.setDouble(7, vo.getSalary());
            pstmt.setDouble(8, vo.getCommissionPct());
            pstmt.setInt(9, vo.getManagerId());
            pstmt.setInt(10, vo.getDepartmentId());

            flag = pstmt.executeUpdate();
            System.out.println("flag : "+ flag);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }

    @Override
    public int update(EmpVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        int flag = 0;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "update emp set first_name=?, last_name=?, email=?, phone_number=?, hire_date=?, job_id=?, salary=?, commission_pct=?, manager_id=?, department_id=? where employee_id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getFirstName());
            pstmt.setString(2, vo.getLastName());
            pstmt.setString(3, vo.getEmail());
            pstmt.setString(4, vo.getPhoneNumber());
            pstmt.setString(5, vo.getHireDate());
            pstmt.setString(6, vo.getJobId());
            pstmt.setDouble(7, vo.getSalary());
            pstmt.setDouble(8, vo.getCommissionPct());
            pstmt.setInt(9, vo.getManagerId());
            pstmt.setInt(10, vo.getDepartmentId());
            pstmt.setInt(11, vo.getEmployeeId());

            flag = pstmt.executeUpdate();
            System.out.println("flag : "+ flag);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    @Override
    public int delete(EmpVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        int flag = 0;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "delete from emp where employee_id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getEmployeeId());

            flag = pstmt.executeUpdate();
            System.out.println("flag : "+ flag);

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    @Override
    public EmpVO selectOne(EmpVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);

        EmpVO vo2 = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "select * from emp where employee_id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getEmployeeId());

            rs = pstmt.executeQuery();

            while (rs.next()) {
                vo2 = new EmpVO();
                vo2.setEmployeeId(rs.getInt("employee_id"));
                vo2.setFirstName(rs.getString("first_name"));
                vo2.setLastName(rs.getString("last_name"));
                vo2.setEmail(rs.getString("email"));
                vo2.setPhoneNumber(rs.getString("phone_number"));
                vo2.setHireDate(rs.getString("hire_date"));
                vo2.setJobId(rs.getString("job_id"));
                vo2.setSalary(rs.getDouble("salary"));
                vo2.setCommissionPct(rs.getDouble("commission_pct"));
                vo2.setManagerId(rs.getInt("manager_id"));
                vo2.setDepartmentId(rs.getInt("department_id"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return vo2;
    }

    @Override
    public List<EmpVO> selectAll() {
        System.out.println("selectAll()...");
        List<EmpVO> list = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "select * from emp";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                EmpVO vo = new EmpVO();
                vo.setEmployeeId(rs.getInt("employee_id"));
                vo.setFirstName(rs.getString("first_name"));
                vo.setLastName(rs.getString("last_name"));
                vo.setEmail(rs.getString("email"));
                vo.setPhoneNumber(rs.getString("phone_number"));
                vo.setHireDate(rs.getString("hire_date"));
                vo.setJobId(rs.getString("job_id"));
                vo.setSalary(rs.getDouble("salary"));
                vo.setCommissionPct(rs.getDouble("commission_pct"));
                vo.setManagerId(rs.getInt("manager_id"));
                vo.setDepartmentId(rs.getInt("department_id"));
                list.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public List<EmpVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<EmpVO> vos = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conn successed...");

            String sql = "select * from emp where " + searchKey + " like ?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + searchWord + "%");

            rs = pstmt.executeQuery();

            while (rs.next()) {
                EmpVO vo = new EmpVO();
                vo.setEmployeeId(rs.getInt("employee_id"));
                vo.setFirstName(rs.getString("first_name"));
                vo.setLastName(rs.getString("last_name"));
                vo.setEmail(rs.getString("email"));
                vo.setPhoneNumber(rs.getString("phone_number"));
                vo.setHireDate(rs.getString("hire_date"));
                vo.setJobId(rs.getString("job_id"));
                vo.setSalary(rs.getDouble("salary"));
                vo.setCommissionPct(rs.getDouble("commission_pct"));
                vo.setManagerId(rs.getInt("manager_id"));
                vo.setDepartmentId(rs.getInt("department_id"));
                vos.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return vos;
    }
}
