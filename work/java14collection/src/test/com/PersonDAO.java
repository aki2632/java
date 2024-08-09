package test.com;

import java.util.List;


public interface PersonDAO {

    public int insert(PersonVO vo);
    public int update(PersonVO vo);
    public int delete(PersonVO vo);
    public PersonVO selectOne(PersonVO vo);
    public List<PersonVO> selectAll();
    public List<PersonVO> searchList(String searchKey,String searchWord);

}
