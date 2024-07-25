package test.com.job;

import java.util.List;

public interface JobDAO {
    public int insert(JobVO vo);
    public int update(JobVO vo);
    public int delete(JobVO vo);
    public JobVO selectOne(JobVO vo);
    public List<JobVO> selectAll();
    public List<JobVO> searchList(String searchKey, String searchWord);


}
