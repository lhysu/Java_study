package test.com.emp;

import test.com.dept.DeptVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDAOimpl implements EmpDAO{
    private static final String DRIVER_NAME="oracle.jdbc.OracleDriver";
    private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER="hr";
    private static final String PASSWORD = "hi123456";

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public EmpDAOimpl() {
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver success...");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insert(EmpVO vo) {
        System.out.println("insert()...");
        int flag = 0;
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            String sql = "insert into emp(employee_id,first_name,last_name,email,phone_number" +
                    ",hire_date,job_id,salary,manager_id,department_id)"+
                    "values(?,?,?,?,?,sysdate,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,vo.getEmployee_id());
            pstmt.setString(2,vo.getFirst_name());
            pstmt.setString(3,vo.getLast_name());
            pstmt.setString(4,vo.getEmail());
            pstmt.setString(5,vo.getPhone_number());
            pstmt.setString(6,vo.getJob_id());
            pstmt.setInt(7,vo.getSalary());
            pstmt.setInt(8,vo.getManager_id());
            pstmt.setInt(9,vo.getDepartment_id());

            flag= pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return flag;
    }

    @Override
    public int update(EmpVO vo) {
        System.out.println("update()...");
        int flag = 0;
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            String sql = "update emp set first_name = ?, last_name=?" +
                    " where employee_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(3,vo.getEmployee_id());
            pstmt.setString(1,vo.getFirst_name());
            pstmt.setString(2,vo.getLast_name());

            flag= pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }

    @Override
    public int delete(EmpVO vo) {
        System.out.println("delete()...");
        int flag = 0;
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            String sql = "delete from emp where employee_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,vo.getEmployee_id());
            flag= pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }

    @Override
    public EmpVO selectOne(EmpVO vo) {
        System.out.println("selectOne()...");
        EmpVO vo2 = new EmpVO();
        try {
            conn= DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "select * from emp where employee_id = ?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,vo.getEmployee_id());
            rs = pstmt.executeQuery();

            while(rs.next()){

                vo2.setEmployee_id(rs.getInt("employee_id"));
                vo2.setFirst_name(rs.getString("first_name"));
                vo2.setLast_name(rs.getString("last_name"));
                vo2.setEmail(rs.getString("email"));
                vo2.setPhone_number(rs.getString("phone_number"));
                vo2.setHire_date(rs.getDate("hire_date").toString());
                vo2.setJob_id(rs.getString("job_id"));
                vo2.setSalary(rs.getInt("salary"));
                vo2.setCommission_pct(rs.getInt("commission_pct"));
                vo2.setManager_id(rs.getInt("manager_id"));
                vo2.setDepartment_id(rs.getInt("department_id"));

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return vo2;
    }

    @Override
    public List<EmpVO> selectAll() {
        System.out.println("selectAll()...");
        List<EmpVO> list =new ArrayList<>();

        try {
            conn= DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "select * from emp";
            pstmt=conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()){
                EmpVO vo = new EmpVO();
                vo.setEmployee_id(rs.getInt("employee_id"));
                vo.setFirst_name(rs.getString("first_name"));
                vo.setLast_name(rs.getString("last_name"));
                vo.setEmail(rs.getString("email"));
                vo.setPhone_number(rs.getString("phone_number"));
                vo.setHire_date(rs.getDate("hire_date").toString());
                vo.setJob_id(rs.getString("job_id"));
                vo.setSalary(rs.getInt("salary"));
                vo.setCommission_pct(rs.getInt("commission_pct"));
                vo.setManager_id(rs.getInt("manager_id"));
                vo.setDepartment_id(rs.getInt("department_id"));
                list.add(vo);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }



        return list;

    }

    @Override
    public List<EmpDeptVO> selectAll2() {
        System.out.println("selectAll2()...");
        List<EmpDeptVO> list =new ArrayList<>();

        try {
            conn= DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "select * from view_dept_emp order by employee_id desc";
            pstmt=conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()){
                EmpDeptVO vo = new EmpDeptVO();
                vo.setEmployee_id(rs.getInt("employee_id"));
                vo.setFirst_name(rs.getString("first_name"));
                vo.setLast_name(rs.getString("last_name"));
                vo.setEmail(rs.getString("email"));
                vo.setPhone_number(rs.getString("phone_number"));
                vo.setHire_date(rs.getDate("hire_date").toString());
                vo.setJob_id(rs.getString("job_id"));
                vo.setSalary(rs.getInt("salary"));
                vo.setCommission_pct(rs.getInt("commission_pct"));
                vo.setManager_id(rs.getInt("manager_id"));
                vo.setDepartment_id(rs.getInt("department_id"));
                vo.setDepartment_name(rs.getString("department_name"));
                list.add(vo);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }



        return list;
    }

    @Override
    public List<EmpJobVO> selectAll3() {
        System.out.println("selectAll()...");
        List<EmpJobVO> list =new ArrayList<>();

        try {
            conn= DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "select * from view_job_emp order by employee_id desc";
            pstmt=conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()){
                EmpJobVO vo = new EmpJobVO();
                vo.setEmployee_id(rs.getInt("employee_id"));
                vo.setFirst_name(rs.getString("first_name"));
                vo.setLast_name(rs.getString("last_name"));
                vo.setEmail(rs.getString("email"));
                vo.setPhone_number(rs.getString("phone_number"));
                vo.setHire_date(rs.getDate("hire_date").toString());
                vo.setJob_id(rs.getString("job_id"));
                vo.setJob_title(rs.getString("job_title"));
                vo.setSalary(rs.getInt("salary"));
                vo.setCommission_pct(rs.getInt("commission_pct"));
                vo.setManager_id(rs.getInt("manager_id"));
                vo.setDepartment_id(rs.getInt("department_id"));

                list.add(vo);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }



        return list;
    }

    @Override
    public List<EmpVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<EmpVO> list =new ArrayList<>();

        try {
            conn= DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");

            if(searchKey.equals("first_name")){
                String sql = "select * from emp where first_name like ?";
                pstmt=conn.prepareStatement(sql);
                pstmt.setString(1,"%"+searchWord+"%");
                rs = pstmt.executeQuery();

                while(rs.next()){
                    EmpVO vo = new EmpVO();
                    vo.setEmployee_id(rs.getInt("employee_id"));
                    vo.setFirst_name(rs.getString("first_name"));
                    vo.setLast_name(rs.getString("last_name"));
                    vo.setEmail(rs.getString("email"));
                    vo.setPhone_number(rs.getString("phone_number"));
                    vo.setHire_date(rs.getDate("hire_date").toString());
                    vo.setJob_id(rs.getString("job_id"));
                    vo.setSalary(rs.getInt("salary"));
                    vo.setCommission_pct(rs.getInt("commission_pct"));
                    vo.setManager_id(rs.getInt("manager_id"));
                    vo.setDepartment_id(rs.getInt("department_id"));
                    list.add(vo);
                }
            } else if (searchKey.equals("last_name")) {
                String sql = "select * from emp where last_name like ?";
                pstmt=conn.prepareStatement(sql);
                pstmt.setString(1,"%"+searchWord+"%");
                rs = pstmt.executeQuery();

                while(rs.next()){
                    EmpVO vo = new EmpVO();
                    vo.setEmployee_id(rs.getInt("employee_id"));
                    vo.setFirst_name(rs.getString("first_name"));
                    vo.setLast_name(rs.getString("last_name"));
                    vo.setEmail(rs.getString("email"));
                    vo.setPhone_number(rs.getString("phone_number"));
                    vo.setHire_date(rs.getDate("hire_date").toString());
                    vo.setJob_id(rs.getString("job_id"));
                    vo.setSalary(rs.getInt("salary"));
                    vo.setCommission_pct(rs.getInt("commission_pct"));
                    vo.setManager_id(rs.getInt("manager_id"));
                    vo.setDepartment_id(rs.getInt("department_id"));
                    list.add(vo);
                }
            }else{
                System.out.println("잘못된 입력");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return list;
    }
}
