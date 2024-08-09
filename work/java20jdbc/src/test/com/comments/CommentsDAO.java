package test.com.comments;

import java.util.List;

public interface CommentsDAO {
    public int insert(CommentsVO vo);
    public int update(CommentsVO vo);
    public int delete(CommentsVO vo);
    CommentsVO selectOne(CommentsVO vo);
    List<CommentsVO> selectAll();
    List<CommentsVO> searchList(String searchKey,String searchWord);
}

