package test.com;

public class MemberVO {
    private int num;
    private String id;
    private String pw;
    private String name;
    private String tel;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

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
