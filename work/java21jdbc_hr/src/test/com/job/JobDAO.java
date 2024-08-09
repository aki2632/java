package test.com.job;

import java.util.List;

public interface JobDAO {
    int insert(JobVO vo);
    int update(JobVO vo);
    int delete(JobVO vo);
    JobVO selectOne(JobVO vo);
    List<JobVO> selectAll();
    List<JobVO> searchList(String searchKey, String searchWord);
}
