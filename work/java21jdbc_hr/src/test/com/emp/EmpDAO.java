package test.com.emp;

import java.util.List;

public interface EmpDAO {
    public int insert(EmpVO vo);
    public int update(EmpVO vo);
    public int delete(EmpVO vo);
    public EmpVO selectOne(EmpVO vo);
    public List<EmpVO> selectAll();
    public List<EmpDeptVO> selectAll2();
    public List<EmpJobVO> selectAll3();
    public List<EmpVO> searchList(String searchKey, String seachWord);


}
