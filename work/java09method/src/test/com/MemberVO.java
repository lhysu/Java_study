package test.com;

public class MemberVO {
    private int num;
    private String id;
    private String pw;
    private String name;
    private String tel;

    public MemberVO(){

    }

    public MemberVO(int num,
                    String id,
                    String pw,
                    String name,
                    String tel){

        this.num = num;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;

    }



    //Override: 재정의
    @Override
    public String toString() {
        return "MemberVO{" +
                "id='" + id + '\'' +
                ", num=" + num +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
