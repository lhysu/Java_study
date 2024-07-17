package test.com.main;

import test.com.member.MemberDAO;
import test.com.member.MemberDAOImpl;
import test.com.member.MemberVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MemberMain {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MemberDAO dao = new MemberDAOImpl();
        String menu = "";

        while(true){
            System.out.println("메뉴를 입력하세요");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색 [x입력시 종료]");
            menu = br.readLine();
            if(menu.equals("1")){
                //1.insert
                MemberVO vo = new MemberVO();

                System.out.print("id:");
                String id = br.readLine();
                System.out.print("pw:");
                String pw = br.readLine();
                System.out.print("name:");
                String name = br.readLine();
                System.out.print("tel:");
                String tel = br.readLine();

                vo.setId(id);
                vo.setPw(pw);
                vo.setName(name);
                vo.setTel(tel);

                int result = dao.insert(vo);
                System.out.println("result:"+result);
                if(result == 1){
                    System.out.println("insert succeed");
                }else{
                    System.out.println("insert failed...");
                }


            }else if(menu.equals("2")){
                //2.update
                MemberVO vo = new MemberVO();
                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.print("id:");
                String id = br.readLine();
                System.out.print("pw:");
                String pw = br.readLine();
                System.out.print("name:");
                String name = br.readLine();
                System.out.print("tel:");
                String tel = br.readLine();

                vo.setNum(num);
                vo.setId(id);
                vo.setPw(pw);
                vo.setName(name);
                vo.setTel(tel);

                int result = dao.update(vo);
                System.out.println("result:"+result);
                if(result == 1){
                    System.out.println("update succeed...");
                }else{
                    System.out.println("update failed...");
                }


            }else if(menu.equals("3")){
                //3.delete
                MemberVO vo = new MemberVO();
                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                vo.setNum(num);

                int result = dao.delete(vo);
                System.out.println("result:"+result);
                if(result == 1){
                    System.out.println("delete succeed...");
                }else{
                    System.out.println("delete failed...");
                }

            }else if(menu.equals("4")){
                //4.selectOne
                MemberVO vo = new MemberVO();
                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                vo.setNum(num);

                MemberVO vo2 = dao.selectOne(vo);
                System.out.println(vo2);
                if(vo2==null){
                    System.out.println("selectOne failed...");
                }

            }else if(menu.equals("5")){
                //5.selectAll
                List<MemberVO> list = dao.selectAll();
                for(MemberVO item : list){
                    System.out.println(item);
                }



            }else if(menu.equals("6")){
                //6.searchList
                System.out.print("searchKey [id or name]:");
                String searchKey=br.readLine();
                System.out.print("searchWord:");
                String searchWord=br.readLine();
                List<MemberVO> list = dao.searchList(searchKey,searchWord);

                for(MemberVO item : list){
                    System.out.println(item);
                }

            }else if(menu.equals("x")){
                break;
            }
        }
        br.close();
        System.out.println("프로그램 종료");

    }//end main
}//end class
