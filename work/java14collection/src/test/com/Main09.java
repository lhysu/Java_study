package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main09 {

    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //Main05 프로그램을 메뉴 기능을 넣어서 Main08처럼 작성

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MemberDAO dao = new MemberDAOImpl();
        MemberVO vo = new MemberVO();
        int result = 0;
        String menu = "";
        while (true) {
            System.out.println("메뉴를 입력하세요");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색 [x입력시 종료]");
            menu = br.readLine();

            if (menu.equals("1")) {
                //1.insert

                System.out.print("name:");
                String name = br.readLine();
                System.out.print("id:");
                String id = br.readLine();
                System.out.print("pw:");
                String pw = br.readLine();
                System.out.print("tel:");
                String tel = br.readLine();

                vo = new MemberVO();
                vo.setName(name);
                vo.setId(id);
                vo.setPw(pw);
                vo.setTel(tel);

                result = dao.insert(vo);
                System.out.println("result:" + result);
                if (result == 1){
                    System.out.println("insert success");
                }else System.out.println("insert failed");

                System.out.println();


            } else if (menu.equals("2")) {
                //2.update

                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.print("name:");
                String name = br.readLine();
                System.out.print("id:");
                String id = br.readLine();
                System.out.print("pw:");
                String pw = br.readLine();
                System.out.print("tel:");
                String tel = br.readLine();

                vo = new MemberVO();
                vo.setNum(num);
                vo.setName(name);
                vo.setId(id);
                vo.setPw(pw);
                vo.setTel(tel);
                result = dao.update(vo);
                if (result == 1){
                    System.out.println("update success");
                }else System.out.println("update failed");

            } else if (menu.equals("3")) {
                //3.delete
                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                vo.setNum(num);
                result = dao.delete(vo);
                if (result == 1){
                    System.out.println("delete success");
                }else System.out.println("delete failed");

            } else if (menu.equals("4")) {
                //4.selectOne
                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                vo.setNum(num);
                MemberVO vo2 = dao.selectOne(vo);
                System.out.println(vo2);
                if (vo2==null){
                    System.out.println("selectOne failed");
                }
            } else if (menu.equals("5")) {
                //5.selectAll
                List<MemberVO> list = dao.selectAll();
                for (MemberVO x : list) {
                    System.out.println(x);
                }

                if (list==null){
                    System.out.println("selectAll failed");
                }

            } else if (menu.equals("6")) {
                //6.searchList
                System.out.print("searchKey:");
                String searchKey = br.readLine();
                System.out.print("searchWord:");
                String searchWord = br.readLine();

                List<MemberVO> list = dao.searchList(searchKey,searchWord);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }

                if (list==null){
                    System.out.println("searchList failed");
                }

            } else if (menu.equals("x")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("잘못된 입력입니다.");
            }
            System.out.println("===============================================");

        }

    }//end main


}//end class
