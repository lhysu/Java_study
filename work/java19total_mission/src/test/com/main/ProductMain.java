package test.com.main;

import test.com.product.ProductDAO;
import test.com.product.ProductDAOImpl;
import test.com.product.ProductVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ProductDAO dao = new ProductDAOImpl();
        String menu = "";

        while(true){
            System.out.println("메뉴를 입력하세요");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색 [x입력시 종료]");
            menu = br.readLine();
            if(menu.equals("1")){
                //1.insert
                ProductVO vo = new ProductVO();

                System.out.print("pname:");
                String pname = br.readLine();
                System.out.print("model:");
                String model = br.readLine();
                System.out.print("price:");
                int price = Integer.parseInt(br.readLine());
                System.out.print("count:");
                int count = Integer.parseInt(br.readLine());

                vo.setPname(pname);
                vo.setModel(model);
                vo.setPrice(price);
                vo.setCount(count);

                int result = dao.insert(vo);
                System.out.println("result:"+result);
                if(result == 1){
                    System.out.println("insert succeed...");
                }else{
                    System.out.println("insert failed...");
                }


            }else if(menu.equals("2")){
                //2.update
                ProductVO vo = new ProductVO();
                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.print("pname:");
                String pname = br.readLine();
                System.out.print("model:");
                String model = br.readLine();
                System.out.print("price:");
                int price = Integer.parseInt(br.readLine());
                System.out.print("count:");
                int count = Integer.parseInt(br.readLine());

                vo.setNum(num);
                vo.setPname(pname);
                vo.setModel(model);
                vo.setPrice(price);
                vo.setCount(count);

                int result = dao.update(vo);
                System.out.println("result:"+result);
                if(result == 1){
                    System.out.println("update succeed...");
                }else{
                    System.out.println("update failed...");
                }


            }else if(menu.equals("3")){
                //3.delete
                ProductVO vo = new ProductVO();
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
                ProductVO vo = new ProductVO();
                System.out.print("num:");
                int num = Integer.parseInt(br.readLine());
                vo.setNum(num);

                ProductVO vo2 = dao.selectOne(vo);
                System.out.println(vo2);
                if(vo2==null){
                    System.out.println("selectOne failed...");
                }
            }else if(menu.equals("5")){
                //5.selectAll
                List<ProductVO> list = dao.selectAll();
                for(ProductVO item : list){
                    System.out.println(item);
                }



            }else if(menu.equals("6")){
                //6.searchList
                System.out.print("searchKey [pname or model]:");
                String searchKey=br.readLine();
                System.out.print("searchWord:");
                String searchWord=br.readLine();
                List<ProductVO> list = dao.searchList(searchKey,searchWord);

                for(ProductVO item : list){
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
