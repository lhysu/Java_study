package test.com;

import java.lang.reflect.Member;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        MemberDAO dao = new MemberDAOimpl();
        dao.insert();
        dao.update(11,"admin","hi1111","kim","01");
        MemberVO mb = new MemberVO();
        mb.setNum(1);
        mb.setName("kim");
        mb.setId("admin");
        mb.setPw("1234");
        mb.setTel("010");
        dao.update(mb);
        MemberVO vo =dao.delete(mb);
        System.out.println(vo);
        System.out.println(dao.delete2());
        MemberVO vo2 = dao.select(mb);
        System.out.println(vo2);

        MemberVO[] vos = dao.select("name","kim");
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
        }

    }
}
