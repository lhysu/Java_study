package test.com.main;


import test.com.comments.CommentsDAO;
import test.com.comments.CommentsDAOImpl;
import test.com.comments.CommentsVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.List;

public class CommentsMain {
    public static void main(String[] args) throws IOException {

        //mission
        //해당 게시글에 작성된 댓글 기능을 구현하세요
        //java : CommentsVO, CommentsDAO, CommentsImpl,CommentsMain
        //oracle db : comments-num(PK),content,writer,wdate,bnum(FK)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CommentsDAO dao = new CommentsDAOImpl();


        while(true){

            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력,2.수정,3.삭제,4.번호검색,5.모두검색,6.검색어 검색..[x입력시 종료]");
            String menu = br.readLine();
            System.out.println("==========================");
            if(menu.equals("1")){
                //1.insert
                System.out.print("bnum: ");
                int bnum = Integer.parseInt(br.readLine());
                System.out.print("content: ");
                String content = br.readLine();
                System.out.print("writer: ");
                String writer = br.readLine();

                CommentsVO vo = new CommentsVO();
                vo.setContent(content);
                vo.setWriter(writer);
                vo.setBnum(bnum);

                int result = dao.insert(vo);

                if (result == 1){
                    System.out.println("insert success...");
                }else System.out.println("insert failed...");


            } else if (menu.equals("2")) {
                //2.update
                System.out.print("num: ");
                int num = Integer.parseInt(br.readLine());
                System.out.print("content: ");
                String content = br.readLine();


                CommentsVO vo = new CommentsVO();
                vo.setNum(num);
                vo.setContent(content);


                int result = dao.update(vo);

                if (result >= 1){
                    System.out.println("update success...");
                }else System.out.println("update failed...");


            }else if (menu.equals("3")) {
                //3.delete
                System.out.print("num: ");
                int num = Integer.parseInt(br.readLine());

                CommentsVO vo = new CommentsVO();
                vo.setNum(num);

                int result = dao.delete(vo);

                if (result >= 1){
                    System.out.println("delete success...");
                }else System.out.println("delete failed...");


            }else if (menu.equals("4")) {
                //4.selectOne
                System.out.print("num: ");
                int num = Integer.parseInt(br.readLine());
                CommentsVO vo = new CommentsVO();
                vo.setNum(num);

                CommentsVO vo2 = dao.selectOne(vo);
                System.out.printf("%3s  %20s  %10s  %20s  %3s \n","번호","내용","작성자","작성일자","본문번호");
                System.out.printf("%3d     %20s    %10s    %20s    %3d \n",
                        vo2.getNum(),vo2.getContent(),vo2.getWriter(),vo2.getWdate(),vo2.getBnum());

                if(vo2 != null){
                    System.out.println("selectOne successed...");
                }else{
                    System.out.println("selectOne failed...");
                }


            }else if (menu.equals("5")) {
                //5.selectAll
                System.out.print("bnum: ");
                int bnum = Integer.parseInt(br.readLine());

                List<CommentsVO> list = dao.selectAll(bnum);

                System.out.printf("%3s  %20s %10s %20s %3s \n","번호","내용","작성자","작성일자","본문번호");
                for (CommentsVO x : list){
                    System.out.printf("%3d  %20s    %10s    %20s    %3d \n",
                            x.getNum(),x.getContent(),x.getWriter(),x.getWdate(),x.getBnum());
                }

            } else if (menu.equals("6")) {
                //6.searchList
                System.out.print("searchKey[writer or content]: ");
                String searchKey = br.readLine();
                System.out.print("searchWord: ");
                String searchWord = br.readLine();
                System.out.println("bnum: ");
                int bnum = Integer.parseInt(br.readLine());

                List<CommentsVO> list = dao.searchList(searchKey,searchWord,bnum);
                System.out.printf("%3s  %20s %10s %20s %3s \n","번호","내용","작성자","작성일자","본문번호");
                for (CommentsVO x : list){
                    System.out.printf("%3d  %20s    %10s    %20s    %3d \n",
                            x.getNum(),x.getContent(),x.getWriter(),x.getWdate(),x.getBnum());
                }

                System.out.println();
            } else if (menu.equals("x")) {
                break;
            }
            System.out.println("=============================");
        }





    }
}
