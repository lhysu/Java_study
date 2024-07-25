package test.com.main;

import test.com.emp.EmpDAO;
import test.com.emp.EmpDAOimpl;
import test.com.emp.EmpVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class EmpMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        EmpDAO dao = new EmpDAOimpl();

        while (true) {

            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력,2.수정,3.삭제,4.번호검색,5.모두검색,6.검색어검색..[x입력시 종료]");
            String menu = br.readLine();
            System.out.println("==================================");

            if(menu.equals("1")){
                //1.insert
                System.out.println("employee_id:");
                int employee_id = Integer.parseInt(br.readLine());
                System.out.println("first_name:");
                String first_name = br.readLine();
                System.out.println("last_name:");
                String last_name = br.readLine();
                System.out.println("email:");
                String email = br.readLine();
                System.out.println("phone_number:");
                String phone_number = br.readLine();
                System.out.println("job_id:");
                String job_id = br.readLine();
                System.out.println("salary:");
                int salary = Integer.parseInt(br.readLine());
                System.out.println("manager_id:");
                int manager_id = Integer.parseInt(br.readLine());
                System.out.println("department_id:");
                int department_id = Integer.parseInt(br.readLine());

                EmpVO vo = new EmpVO();
                vo.setEmployee_id(employee_id);
                vo.setFirst_name(first_name);
                vo.setLast_name(last_name);
                vo.setEmail(email);
                vo.setPhone_number(phone_number);
                vo.setJob_id(job_id);
                vo.setManager_id(manager_id);
                vo.setDepartment_id(department_id);

                int result = dao.insert(vo);
                if(result==1){
                    System.out.println("insert success...");
                } else if (result==0) {
                    System.out.println("insert failed...");
                }


            } else if (menu.equals("2")) {
                //2.update
                System.out.println("employee_id:");
                int employeee_id = Integer.parseInt(br.readLine());
                System.out.println("first_name:");
                String first_name = br.readLine();
                System.out.println("last_name:");
                String last_name = br.readLine();

                EmpVO vo = new EmpVO();
                vo.setEmployee_id(employeee_id);
                vo.setFirst_name(first_name);
                vo.setLast_name(last_name);

                int result = dao.update(vo);
                if(result==1){
                    System.out.println("update success...");
                } else if (result==0) {
                    System.out.println("update failed...");
                }
            }
            else if (menu.equals("3")) {
                System.out.println("employee_id:");
                int employee_id = Integer.parseInt(br.readLine());
                EmpVO vo = new EmpVO();
                vo.setEmployee_id(employee_id);

                int result = dao.delete(vo);
                if(result==1){
                    System.out.println("delete success...");
                } else if (result==0) {
                    System.out.println("delete failed...");
                }
            }
            else if (menu.equals("4")) {
                System.out.print("employee_id:");
                int employee_id = Integer.parseInt(br.readLine());
                EmpVO vo = new EmpVO();
                vo.setEmployee_id(employee_id);
                EmpVO vo2 = dao.selectOne(vo);
                System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s\n",
                        "employee_id","first_name","last_name","email","phone_number","hire_date","job_id",
                        "salary","commission_pct","manager_id","department_id");
                System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10d %10d %10d %10d\n",
                        vo2.getEmployee_id(),vo2.getFirst_name(),vo2.getLast_name(),vo2.getEmail(),vo2.getPhone_number(),vo2.getHire_date(),vo2.getJob_id(),
                        vo2.getSalary(),vo2.getCommission_pct(),vo2.getManager_id(),vo2.getDepartment_id());


            }else if (menu.equals("5")) {
                List<EmpVO> list = dao.selectAll();
                System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s\n",
                        "employee_id","first_name","last_name","email","phone_number","hire_date","job_id",
                        "salary","commission_pct","manager_id","department_id");
                for(EmpVO x : list){
                    System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10d %10d %10d %10d\n",
                            x.getEmployee_id(),x.getFirst_name(),x.getLast_name(),x.getEmail(),x.getPhone_number(),x.getHire_date(),x.getJob_id(),
                            x.getSalary(),x.getCommission_pct(),x.getManager_id(),x.getDepartment_id());
                }

            }else if (menu.equals("6")) {
                System.out.print("searchKey[first_name or last_name]:");
                String searchKey = br.readLine();
                System.out.print("searchWord:");
                String searchWord = br.readLine();

                List<EmpVO> list = dao.searchList(searchKey,searchWord);
                System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s\n",
                        "employee_id","first_name","last_name","email","phone_number","hire_date","job_id",
                        "salary","commission_pct","manager_id","department_id");
                for(EmpVO x : list){
                    System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10d %10d %10d %10d\n",
                            x.getEmployee_id(),x.getFirst_name(),x.getLast_name(),x.getEmail(),x.getPhone_number(),x.getHire_date(),x.getJob_id(),
                            x.getSalary(),x.getCommission_pct(),x.getManager_id(),x.getDepartment_id());
                }
            }else if (menu.equals("x")) {
                break;
            }
            System.out.println("==========================================================");

        }
        br.close();
        System.out.println("프로그램 종료");
    }//end main
}//end class
