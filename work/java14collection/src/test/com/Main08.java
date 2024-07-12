package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main08 {

    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //Main04프로그램을 메뉴 기능을 넣어서
        //반복문이 종료되기 전까지
        //1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색
        //x 입력시 종료

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        PersonDAO dao = new PersonDAOImpl();
        PersonVO vo = new PersonVO();
        PersonVO vo2 = new PersonVO();
        List<PersonVO> list = new ArrayList<>();

        while(true){
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색 [x입력시 종료]");
            input = br.readLine();
            int result = 0;

            if(input.equals("1")) {      //1.insert
                vo = new PersonVO();

                System.out.print("name:");              //이름 입력
                String name = br.readLine();
                vo.setName(name);

                System.out.print("age:");               //나이 입력
                int age = Integer.parseInt(br.readLine());
                vo.setAge(age);

                result = dao.insert(vo);            //성공, 실패 메시지
                System.out.println("result:"+result);
                if (result == 1){
                    System.out.println("insert success");
                }else System.out.println("insert failed");

                } else if (input.equals("2")) {//2.update

                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                vo2.setNum(num);
                System.out.print("name:");
                String name = br.readLine();
                vo2.setName(name);

                result = dao.update(vo2);
                System.out.println("result:"+result);
                if (result == 1){
                    System.out.println("update success");
                }else System.out.println("update failed");

            } else if (input.equals("3")) {     //3.delete

                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                vo2.setNum(num);

                result = dao.delete(vo2);
                System.out.println("result:"+result);
                if (result == 1){
                    System.out.println("delete success");
                }else System.out.println("delete failed");

            } else if (input.equals("4")) {
                //4.selectOne
                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                vo2.setNum(num);
                vo2.setNum(num);
                PersonVO vo3 = dao.selectOne(vo2);
                System.out.println(vo3);

                if(vo3 != null){
                    System.out.println("selectOne success");
                }else{
                    System.out.println("selectOne failed");
                }

            } else if (input.equals("5")) {
                //5.selectAll
                list = dao.selectAll();
                for(PersonVO item : list){
                    System.out.println(item);
                }
                if(list.size()==0){
                    System.out.println("selectAll failed");
                }


            } else if (input.equals("6")) {
                //6.searchList
                System.out.print("searchkey:");
                String key = br.readLine();

                System.out.print("searchword:");
                String word = br.readLine();
                list = dao.searchList(key,word);
                for(PersonVO item : list){
                    System.out.println(item);
                }
                if(list.size()==0){
                    System.out.println("searchList failed");
                }

            } else if (input.equals("x")) {
                System.out.println("프로그램 종료");
                break;
            }else System.out.println("잘못된 입력입니다.");
            System.out.println("=======================");
        }




    }//end main


}//end class
