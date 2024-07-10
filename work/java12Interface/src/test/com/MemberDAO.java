package test.com;

public interface MemberDAO {


    public void insert();
    public void update(int num, String id,  String pw, String name, String tel);
    public void update(MemberVO mb);
    public MemberVO delete(MemberVO mb);
    public int delete2();
    public MemberVO select(MemberVO mb);
    public MemberVO[] select(String a, String b);







}
