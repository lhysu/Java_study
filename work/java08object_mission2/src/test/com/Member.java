package test.com;

public class Member {
    int num;
    String id;
    String pw;
    String name;
    String tel;

    public Member(){
        num = 1;
        id = "admin";
        pw = "hi1234";
        name = "kim";
        tel = "010";
    }

    public Member(int num,String id, String pw, String name, String tel){
        this.num = num;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
    }



}
