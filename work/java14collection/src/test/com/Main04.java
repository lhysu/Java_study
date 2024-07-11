package test.com;

import java.util.List;

public class Main04 {

    public static void main(String[] args) {
        System.out.println("hello");

        //데이터타입: PersonVO
        //PersonDAO: 인터페이스 입력,수정,삭제,검색용 추상메소드(6개)
        //PersonDAOImpl: PersonDAO를 상속받기
        //PersonDAOImpl(전역변수 ArrayList)를 이용해서 메인에서 입력한 값들로
        //입력, 수정, 삭제, 검색 구현

        PersonVO vo = new PersonVO();
        PersonDAO dao = new PersonDAOImpl();

        //1.insert

        int result = 0;

        for (int i = 0; i < 5; i++) {
          vo = new PersonVO();
          vo.setNum(1+i);
          vo.setName("kim"+i);
          vo.setAge(22+i);
          result = dao.insert(vo);
          System.out.println("result:"+result);
        }

        System.out.println("===============");

        //2.update
        PersonVO vo2 = new PersonVO();
        vo2.setName("lee");
        vo2.setNum(2);
        result = dao.update(vo2);
        System.out.println("result:"+result);


        System.out.println("===============");

        //3.delete
        vo2.setNum(3);
        result = dao.delete(vo2);
        System.out.println("result:"+result);


        System.out.println("===============");

        //4.selectOne
        vo2.setNum(4);
        PersonVO vo3 = dao.selectOne(vo2);
        System.out.println(vo3);


        System.out.println("===============");


        //5.selectAll
        List<PersonVO> list = dao.selectAll();
        for(PersonVO x : list){
            System.out.println(x);
        }

        System.out.println("===============");

        //6.searchList
        list = dao.searchList("name","kim");
        for(PersonVO x : list){
            System.out.println(x);
        }

        list = dao.searchList("age","23");
        for(PersonVO x : list){
            System.out.println(x);
        }


    }//end main


}//end class
