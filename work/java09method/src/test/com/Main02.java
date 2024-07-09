package test.com;

import java.lang.reflect.Member;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        MemberVO mb = new MemberVO();

        mb.setNum(11);
        mb.setId("javaa");
        mb.setPw("0987");
        mb.setName("choi");
        mb.setTel("0123");

        System.out.println(mb.getNum());
        System.out.println(mb.getName());
        System.out.println(mb.getId());
        System.out.println(mb.getPw());
        System.out.println(mb.getTel());


        MemberDAO mdao = new MemberDAO();

        mdao.insert();

        System.out.println("==============");

        mdao.update(11);
        mdao.update(11,22);
        mdao.update("lee",22);
        mdao.update(22,"lee");
        mdao.update(1,"aaa","bbb","ccc","eee");
        mdao.update(new MemberVO(2,"aaa","bbb","ccc","eee"));

        System.out.println("===============");
        int result = mdao.delete();
        System.out.println(result);
        String result2 = mdao.delete2();
        System.out.println(result2);
        int[] result3 = mdao.delete3();
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i]+" ");
        }
        System.out.println();
        String[] result4 = mdao.delete4();
        for (int i = 0; i < result4.length; i++) {
            System.out.print(result4[i]+" ");
        }
        System.out.println();

        MemberVO mvo = mdao.delete5();
        /*System.out.print(mvo.num+" ");
        System.out.print(mvo.id+" ");
        System.out.print(mvo.pw+" ");
        System.out.print(mvo.name+" ");
        System.out.println(mvo.tel+" ");*/

        System.out.println("==================");
        int re = mdao.select(11,22);
        System.out.println(re);
        int re2 = mdao.select2(1,2,3,4);
        System.out.println(re2);
        int re3 = mdao.select3(1,2,3,4,5,6,7);
        System.out.println(re3);


        ;
    }//end main
}//end class
