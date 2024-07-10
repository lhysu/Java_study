package test.com;

public interface StudentDAO {

    public int insert(StudentVO vo);
    public int update(StudentVO vo);
    public int delete(StudentVO vo);
    public StudentVO selectOne(StudentVO vo);
    public StudentVO[] selectAll();
    public StudentVO[] searchList(String searchKey, String searchValue);

}
