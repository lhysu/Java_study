package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main10 {

    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //게시글 프로그램을 메뉴 기능을 넣어서 Main09처럼 완성하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BoardDAO dao = new BoardDAOImpl();
        BoardVO vo = new BoardVO();
        String menu="";
        int result=0;

        while(true){
            System.out.println("메뉴를 입력하세요");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색 [x입력시 종료]");
            menu = br.readLine();

            if(menu.equals("1")){
                //1.insert
                vo = new BoardVO();
                System.out.print("title:");
                String title = br.readLine();
                System.out.print("content:");
                String content = br.readLine();
                System.out.print("writer:");
                String writer = br.readLine();

                vo.setTitle(title);
                vo.setContent(content);
                vo.setWriter(writer);


                result = dao.insert(vo);

                System.out.println("result:"+result);
                if(result==1){
                    System.out.println("insert successed...");
                }else{
                    System.out.println("insert failed...");
                }

            } else if (menu.equals("2")) {
                //2.update
                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.print("title:");
                String title = br.readLine();
                System.out.print("content:");
                String content = br.readLine();
                System.out.print("writer:");
                String writer = br.readLine();
                System.out.print("wdate:");
                String wdate = br.readLine();

                vo.setNum(num);
                vo.setTitle(title);
                vo.setContent(content);
                vo.setWriter(writer);
                vo.setWdate(wdate);

                result = dao.update(vo);
                System.out.println("result:"+result);


            }else if (menu.equals("3")) {
                //3.delete
                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                vo.setNum(num);

                result = dao.delete(vo);

            }else if (menu.equals("4")) {
                //4.slectOne
                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                vo.setNum(num);

                BoardVO vo2 = dao.selectOne(vo);
                System.out.println(vo2);
                if(vo2==null) System.out.println("selectOne failed...");

            }else if (menu.equals("5")) {
                //5.selectAll

                List<BoardVO> list = dao.selectAll();
                for(BoardVO x : list){
                    System.out.println(x);
                }
                if(list==null) System.out.println("selectAll failed...");

            }else if (menu.equals("6")) {

                System.out.print("searchKey:");
                String searchKey = br.readLine();
                System.out.print("searchWord:");
                String searchWord = br.readLine();

                List<BoardVO> list = dao.searchList(searchKey,searchWord);
                for(BoardVO x : list){
                    System.out.println(x);
                }
                if(list==null) System.out.println("selectAll failed...");
            } else if (menu.equals("x")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("========================================");
        }





    }//end main


}//end class
