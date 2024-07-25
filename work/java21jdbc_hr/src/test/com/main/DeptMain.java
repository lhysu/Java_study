package test.com.main;

import test.com.dept.DeptDAO;
import test.com.dept.DeptDAOimpl;
import test.com.dept.DeptVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class DeptMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        DeptDAO dao = new DeptDAOimpl();

        while(true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력,2.수정,3.삭제,4.번호검색,5.모두검색,6.검색어검색..[x입력시 종료]");
            String menu = br.readLine();
            System.out.println("==================================");

            if(menu.equals("1")){
                //1.insert
                System.out.println("department_id:");
                int department_id = Integer.parseInt(br.readLine());
                System.out.println("department_name:");
                String depatment_name = br.readLine();
                System.out.println("manager_id:");
                int manager_id = Integer.parseInt(br.readLine());
                System.out.println("location_id:");
                int location_id = Integer.parseInt(br.readLine());

                DeptVO vo = new DeptVO();
                vo.setDepartment_id(department_id);
                vo.setDepartment_name(depatment_name);
                vo.setManager_id(manager_id);
                vo.setLocation_id(location_id);

                int result = dao.insert(vo);
                System.out.println("result:"+result);
                if(result==1){
                    System.out.println("insert successed...");
                }else{
                    System.out.println("inert failed...");
                }



            } else if (menu.equals("2")) {
                //2.update
                System.out.println("department_id:");
                int department_id = Integer.parseInt(br.readLine());
                System.out.println("department_name:");
                String department_name = br.readLine();

                DeptVO vo = new DeptVO();
                vo.setDepartment_id(department_id);
                vo.setDepartment_name(department_name);

                int result = dao.update(vo);
                System.out.println("result:"+result);
                if(result==1){
                    System.out.println("update successed...");
                }else{
                    System.out.println("update failed...");
                }
            }else if (menu.equals("3")) {
                //3.delete
                System.out.println("department_id:");
                int department_id = Integer.parseInt(br.readLine());

                DeptVO vo = new DeptVO();
                vo.setDepartment_id(department_id);

                int result = dao.delete(vo);
                System.out.println("result:"+result);
                if(result==1){
                    System.out.println("delete successed...");
                }else{
                    System.out.println("delete failed...");
                }

            }else if (menu.equals("4")) {
                //4.selectOne
                System.out.println("department_id:");
                int department_id = Integer.parseInt(br.readLine());

                DeptVO vo = new DeptVO();
                vo.setDepartment_id(department_id);

                DeptVO vo2 = dao.selectOne(vo);
                System.out.printf("%10s %15s %10s %10s \n","부서번호","부서명","관리자번호","지역번호");
                System.out.printf("%10d %23s %10d %10d \n",
                        vo2.getDepartment_id(),vo2.getDepartment_name(),vo2.getManager_id(),vo2.getLocation_id());
                if(vo2 != null){
                    System.out.println("selectOne successed...");
                }else{
                    System.out.println("selectOne failed...");
                }

            }else if (menu.equals("5")) {
                //5.selectAll
                List<DeptVO> list = dao.selectAll();
                System.out.printf("%10s %15s %10s %10s \n","부서번호","부서명","관리자번호","지역번호");
                for(DeptVO x : list){
                    System.out.printf("%10d %23s %10d %10d \n",
                            x.getDepartment_id(),x.getDepartment_name(),x.getManager_id(),x.getLocation_id());
                }
            }else if (menu.equals("6")) {
                //6.searchList
                System.out.print("searchKey[department_name or location_id]:");
                String searchKey = br.readLine();
                System.out.print("searchWord:");
                String searchWord = br.readLine();

                List<DeptVO> list = dao.searchList(searchKey,searchWord);
                System.out.printf("%10s %15s %10s %10s \n","부서번호","부서명","관리자번호","지역번호");
                for(DeptVO x : list){
                    System.out.printf("%10d %123s %10d %10d \n",
                            x.getDepartment_id(),x.getDepartment_name(),x.getManager_id(),x.getLocation_id());
                }

            }else if (menu.equals("x")) {
                break;
            }

            System.out.println("======================================");
        }
        br.close();
        System.out.println("프로그램 종료");

    }//end main
}//end class
