package test.com.main;

import test.com.job.JobDAO;
import test.com.job.JobDAOimpl;
import test.com.job.JobVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class JobMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        JobDAO dao = new JobDAOimpl();

        while(true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력,2.수정,3.삭제,4.번호검색,5.모두검색,6.검색어검색..[x입력시 종료]");
            String menu = br.readLine();
            System.out.println("==================================");

            if(menu.equals("1")){
                //1.insert
                System.out.println("job_id:");
                String job_id = br.readLine();
                System.out.println("job_title:");
                String job_title = br.readLine();
                System.out.println("min_salary:");
                int min_salary = Integer.parseInt(br.readLine());
                System.out.println("max_salary:");
                int max_salary = Integer.parseInt(br.readLine());

                JobVO vo = new JobVO();
                vo.setJob_id(job_id);
                vo.setJob_title(job_title);
                vo.setMin_salary(min_salary);
                vo.setMax_salary(max_salary);

                int result = dao.insert(vo);
                System.out.println("result:"+result);
                if(result==1){
                    System.out.println("insert successed...");
                }else{
                    System.out.println("inert failed...");
                }



            } else if (menu.equals("2")) {
                //2.update
                System.out.println("job_id:");
                String job_id = br.readLine();
                System.out.println("job_title:");
                String job_title = br.readLine();
                System.out.println("min_salary:");
                int min_salary = Integer.parseInt(br.readLine());
                System.out.println("max_salary:");
                int max_salary = Integer.parseInt(br.readLine());

                JobVO vo = new JobVO();
                vo.setJob_id(job_id);
                vo.setJob_title(job_title);
                vo.setMin_salary(min_salary);
                vo.setMax_salary(max_salary);

                int result = dao.update(vo);
                System.out.println("result:"+result);
                if(result==1){
                    System.out.println("update successed...");
                }else{
                    System.out.println("update failed...");
                }
            }else if (menu.equals("3")) {
                //3.delete
                System.out.println("job_id:");
                String job_id = br.readLine();

                JobVO vo = new JobVO();
                vo.setJob_id(job_id);

                int result = dao.delete(vo);
                System.out.println("result:"+result);
                if(result==1){
                    System.out.println("delete successed...");
                }else{
                    System.out.println("delete failed...");
                }

            }else if (menu.equals("4")) {
                //4.selectOne
                System.out.println("job_id:");
                String job_id = br.readLine();

                JobVO vo = new JobVO();
                vo.setJob_id(job_id);

                JobVO vo2 = dao.selectOne(vo);
                System.out.printf("%8s %20s       %15s %8s \n","직업번호","직업명","최소급여","최대급여");
                System.out.printf("%10s %35s %10d %10d  \n",
                        vo2.getJob_id(),vo2.getJob_title(),vo2.getMin_salary(),vo2.getMax_salary());
                if(vo2 != null){
                    System.out.println("selectOne successed...");
                }else{
                    System.out.println("selectOne failed...");
                }

            }else if (menu.equals("5")) {
                //5.selectAll
                List<JobVO> list = dao.selectAll();
                System.out.printf("%8s %20s       %15s %8s \n","직업번호","직업명","최소급여","최대급여");
                for(JobVO x : list){
                    System.out.printf("%10s %35s %10d %10d \n",
                            x.getJob_id(),x.getJob_title(),x.getMin_salary(),x.getMax_salary());
                }
            }else if (menu.equals("6")) {
                //6.searchList
                System.out.print("searchKey[job_title or job_id]:");
                String searchKey = br.readLine();
                System.out.print("searchWord:");
                String searchWord = br.readLine();

                List<JobVO> list = dao.searchList(searchKey,searchWord);
                System.out.printf("%8s %20s       %15s %8s \n","직업번호","직업명","최소급여","최대급여");
                for(JobVO x : list){
                    System.out.printf("%10s %35s %10d %10d \n",
                            x.getJob_id(),x.getJob_title(),x.getMin_salary(),x.getMax_salary());
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
