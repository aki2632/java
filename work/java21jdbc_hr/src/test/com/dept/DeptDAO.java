package test.com.dept;

import java.util.List;

public interface DeptDAO {
    int insert(DeptVO vo);
    int update(DeptVO vo);
    int delete(DeptVO vo);
    DeptVO selectOne(DeptVO vo);
    List<DeptVO> selectAll();
    List<DeptVO> searchList(String searchKey, String searchWord);
}
