package test.com.main;

import test.com.board.BoardDAO;
import test.com.board.BoardDAOImpl;
import test.com.board.BoardVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BoardDAO dao = new BoardDAOImpl();
        String menu = "";

        while(true){
            System.out.println("메뉴를 입력하세요");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색 [x입력시 종료]");
            menu = br.readLine();

            if(menu.equals("1")){
                //1.insert
                BoardVO vo = new BoardVO();

                System.out.print("title:");
                String title = br.readLine();
                System.out.print("content:");
                String content = br.readLine();
                System.out.print("writer:");
                String writer = br.readLine();

                vo.setTitle(title);
                vo.setContent(content);
                vo.setWriter(writer);


                int result = dao.insert(vo);

                System.out.println("result:"+result);
                if(result==1){
                    System.out.println("insert succeed...");
                }else{
                    System.out.println("insert failed...");
                }

            } else if (menu.equals("2")) {
                //2.update
                BoardVO vo = new BoardVO();

                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.print("title:");
                String title = br.readLine();
                System.out.print("content:");
                String content = br.readLine();
                System.out.print("writer:");
                String writer = br.readLine();

                vo.setNum(num);
                vo.setTitle(title);
                vo.setContent(content);
                vo.setWriter(writer);

                int result = dao.update(vo);

                System.out.println("result:"+result);
                if(result==1){
                    System.out.println("update succeed...");
                }else{
                    System.out.println("update failed...");
                }


            }else if (menu.equals("3")) {
                //3.delete
                BoardVO vo = new BoardVO();
                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                vo.setNum(num);

                int result = dao.delete(vo);
                System.out.println("result:"+result);
                if(result==1){
                    System.out.println("update succeed...");
                }else{
                    System.out.println("update failed...");
                }


            }else if (menu.equals("4")) {
                //4.selectOne
                BoardVO vo = new BoardVO();
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
                //6.searchList
                System.out.print("searchKey[title or writer]:");
                String searchKey = br.readLine();
                System.out.print("searchWord:");
                String searchWord = br.readLine();

                List<BoardVO> list = dao.searchList(searchKey,searchWord);
                for(BoardVO x : list){
                    System.out.println(x);
                }
            }else if (menu.equals("x")) {
                break;
            }

            System.out.println("=========================================");

        }
        br.close();
        System.out.println("프로그램 종료");

    }//end main
}//end class
