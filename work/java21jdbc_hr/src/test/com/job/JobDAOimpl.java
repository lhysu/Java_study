package test.com.job;

import test.com.dept.DeptVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JobDAOimpl implements JobDAO{
    private static final String DRIVER_NAME="oracle.jdbc.OracleDriver";
    private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER="hr";
    private static final String PASSWORD = "hi123456";

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public JobDAOimpl() {
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("driver success...");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insert(JobVO vo) {
        System.out.println("insert()...");
        int flag=0;
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "insert into job(job_id,job_title,min_salary,max_salary) "+
                    " values(?,?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,vo.getJob_id());
            pstmt.setString(2,vo.getJob_title());
            pstmt.setInt(3,vo.getMin_salary());
            pstmt.setInt(4,vo.getMax_salary());

            flag = pstmt.executeUpdate();
            System.out.println("flag:"+flag);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
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
        }
        return flag;
    }

    @Override
    public int update(JobVO vo) {
        int flag=0;
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "update job set job_title = ?,min_salary =?,max_salary=?  "+
                    " where job_id = ?";
            pstmt=conn.prepareStatement(sql);

            pstmt.setString(1,vo.getJob_title());
            pstmt.setInt(2,vo.getMin_salary());
            pstmt.setInt(3,vo.getMax_salary());
            pstmt.setString(4,vo.getJob_id());

            flag = pstmt.executeUpdate();
            System.out.println("flag:"+flag);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
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
        }
        return flag;
    }

    @Override
    public int delete(JobVO vo) {
        System.out.println("delete()...");
        int flag=0;
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "delete from job where job_id = ? ";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,vo.getJob_id());

            flag = pstmt.executeUpdate();
            System.out.println("flag:"+flag);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
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
        }
        return flag;
    }

    @Override
    public JobVO selectOne(JobVO vo) {
        System.out.println("selectOne()...");
        JobVO vo2 = new JobVO();
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            String sql = "select * from job where job_id =?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,vo.getJob_id());
            rs = pstmt.executeQuery();
            while(rs.next()){

                vo2.setJob_id(rs.getString("job_id"));
                vo2.setJob_title(rs.getString("job_title"));
                vo2.setMax_salary(rs.getInt("max_salary"));
                vo2.setMin_salary(rs.getInt("min_salary"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vo2;
    }

    @Override
    public JobVO job_idCheck(String job_id) {
        System.out.println("job_idCheck()...");
        System.out.println(job_id);
        JobVO vo = null;
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            String sql = "select * from job where job_id =?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,job_id);
            rs = pstmt.executeQuery();
            while(rs.next()){
                vo = new JobVO();
                vo.setJob_id(rs.getString("job_id"));
                vo.setJob_title(rs.getString("job_title"));
                vo.setMax_salary(rs.getInt("max_salary"));
                vo.setMin_salary(rs.getInt("min_salary"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vo;
    }

    @Override
    public List<JobVO> selectAll() {
        System.out.println("selectAll()...");
        List<JobVO> list = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            String sql = "select * from job";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                JobVO vo = new JobVO();
                vo.setJob_id(rs.getString("job_id"));
                vo.setJob_title(rs.getString("job_title"));
                vo.setMax_salary(rs.getInt("max_salary"));
                vo.setMin_salary(rs.getInt("min_salary"));
                list.add(vo);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public List<JobVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<JobVO> list = new ArrayList<>();

        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "";

            if(searchKey.equals("job_title")){
                sql = "select * from job where job_title like ?";
                pstmt=conn.prepareStatement(sql);
                pstmt.setString(1,"%"+searchWord+"%");
                rs = pstmt.executeQuery();

                while(rs.next()){
                    JobVO vo = new JobVO();
                    vo.setJob_id(rs.getString("job_id"));
                    vo.setJob_title(rs.getString("job_title"));
                    vo.setMax_salary(rs.getInt("max_salary"));
                    vo.setMin_salary(rs.getInt("min_salary"));
                    list.add(vo);
                }
            } else if (searchKey.equals("job_id")) {
                sql = "select * from job where job_id like ?";
                pstmt=conn.prepareStatement(sql);
                pstmt.setString(1,"%"+searchWord+"%");
                rs = pstmt.executeQuery();

                while(rs.next()){
                    JobVO vo = new JobVO();
                    vo.setJob_id(rs.getString("job_id"));
                    vo.setJob_title(rs.getString("job_title"));
                    vo.setMax_salary(rs.getInt("max_salary"));
                    vo.setMin_salary(rs.getInt("min_salary"));
                    list.add(vo);
                }
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
