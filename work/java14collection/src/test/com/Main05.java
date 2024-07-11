package test.com;

import java.util.ArrayList;
import java.util.List;

public class Main05 {

    public static void main(String[] args) {
        System.out.println("hello");

        //데이터타입: MemberVO
        //MemberDAO: 인터페이스 입력,수정,삭제,검색용 추상메소드(6개)
        //MemberDAOImpl: MemberDAO를 상속받기
        //MemberDAOImpl(전역변수 ArrayList)를 이용해서 메인에서 입력한 값들로
        //입력, 수정, 삭제, 검색 구현

        MemberDAO dao = new MemberDAOImpl();
        int result = 0;

        //1.insert
        for (int i = 0; i < 5; i++) {
            MemberVO vo = new MemberVO();
            vo.setNum(i+1);
            vo.setName("kim"+(i+1));
            vo.setId("admin"+(i+1));
            vo.setPw("hi000"+(i+1));
            vo.setTel("010-"+(i+1));

            result = dao.insert(vo);
            System.out.println("result:" + result);
            System.out.println();

        }
        System.out.println("===================");

       //2.update
        MemberVO vo2 = new MemberVO();
        vo2.setNum(2);
        vo2.setName("lee");
        vo2.setId("tester");
        vo2.setPw("hi1111");
        vo2.setTel("030-2");
        result = dao.update(vo2);

        System.out.println("===================");

        //3.delete
        vo2.setNum(1);
        result = dao.delete(vo2);

        System.out.println("===================");

        //4.selectOne
        vo2.setNum(4);
        MemberVO vo3 = dao.selectOne(vo2);
        System.out.println(vo3);

        System.out.println("===================");

        //5.selectAll
        List<MemberVO> list = dao.selectAll();
        for(MemberVO x: list){
            System.out.println(x);
        }

        System.out.println("===================");

        //6.searchList

        List<MemberVO> list2 =dao.searchList("name","kim");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        list2 =dao.searchList("tel","010");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

    }//end main


}//end class
