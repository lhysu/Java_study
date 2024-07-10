package test.com;

public class MemberDAOimpl implements MemberDAO {

    @Override
    public void insert() {
        System.out.println("MemberDAOimpl...insert()");
    }

    @Override
    public void update(int num, String id, String pw, String name, String tel) {
        System.out.println("MemberDAOimpl...update()");
        System.out.println(num);
        System.out.println(id);
        System.out.println(pw);
        System.out.println(name);
        System.out.println(tel);
    }

    @Override
    public void update(MemberVO mb) {
        System.out.println("MemberDAOimpl...update()");
    }

    @Override
    public MemberVO delete(MemberVO vo) {
        System.out.println("MemberDAOimpl...delete()");
        MemberVO mb = new MemberVO();
        mb.setNum(1);
        mb.setName("kim");
        mb.setId("admin");
        mb.setPw("1234");
        mb.setTel("010");
        return mb;
    }

    @Override
    public int delete2() {
        System.out.println("MemberDAOimpl...delete2()");
        return 0;
    }

    @Override
    public MemberVO select(MemberVO mb) {
        System.out.println("MemberDAOimpl...select()");
        System.out.println(mb);
        mb.setNum(1);
        mb.setName("kim");
        mb.setId("admin");
        mb.setPw("1234");
        mb.setTel("010");
        return mb;
    }

    @Override
    public MemberVO[] select(String a, String b) {
        System.out.println("MemberDAOimpl...select()");
        System.out.println(a);
        System.out.println(b);
        MemberVO[] vos = new MemberVO[3];
        for (int i = 0; i < vos.length; i++) {
            MemberVO vo = new MemberVO();
            vo.setNum(1+i);
            vo.setId("admin"+i);
            vo.setPw("hi1111"+i);
            vo.setName("kim"+i);
            vo.setTel("02"+i);
            vos[i] = vo;
        }
        return vos;
    }
}
