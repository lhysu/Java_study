package test.com.dept;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOimpl implements DeptDAO {

    private static final String DRIVER_NAME="oracle.jdbc.OracleDriver";
    private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER="hr";
    private static final String PASSWORD = "hi123456";

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;


    public DeptDAOimpl() {
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver Success");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insert(DeptVO vo) {
        System.out.println("insert()...");
        int flag = 0;
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "insert into dept(department_id,department_name,manager_id,location_id) "+
                    " values(?,?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,vo.getDepartment_id());
            pstmt.setString(2,vo.getDepartment_name());
            pstmt.setInt(3,vo.getManager_id());
            pstmt.setInt(4,vo.getLocation_id());

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
    public int update(DeptVO vo) {
        System.out.println("update()...");
        int flag = 0;
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "update dept set department_name=? where department_id=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,vo.getDepartment_name());
            pstmt.setInt(2,vo.getDepartment_id());

            flag = pstmt.executeUpdate();
            System.out.println("flag:"+flag);

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
        }


        return flag;
    }

    @Override
    public int delete(DeptVO vo) {
        System.out.println("delete()...");
        int flag = 0;
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "delete from dept where department_id=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,vo.getDepartment_id());

            flag = pstmt.executeUpdate();
            System.out.println("flag:"+flag);

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
        }


        return flag;
    }

    @Override
    public DeptVO selectOne(DeptVO vo) {
        System.out.println("selectOne()...");
        DeptVO vo2 = new DeptVO();
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "select * from dept where department_id = ? ";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,vo.getDepartment_id());
            rs = pstmt.executeQuery();

            while(rs.next()){
                vo2.setDepartment_id(rs.getInt("department_id"));
                vo2.setDepartment_name(rs.getString("department_name"));
                vo2.setLocation_id(rs.getInt("location_id"));
                vo2.setManager_id(rs.getInt("manager_id"));
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
    public List<DeptVO> selectAll() {
        System.out.println("selectAll()...");
        List<DeptVO> list =new ArrayList<>();

        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "select * from dept order by department_id asc";
            pstmt=conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()){
                DeptVO vo = new DeptVO();
                vo.setDepartment_id(rs.getInt("department_id"));
                vo.setDepartment_name(rs.getString("department_name"));
                vo.setLocation_id(rs.getInt("location_id"));
                vo.setManager_id(rs.getInt("manager_id"));
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
    public List<DeptVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<DeptVO> list = new ArrayList<>();

        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql = "";

            if(searchKey.equals("department_name")){
                sql = "select * from dept where department_name like ?";
                pstmt=conn.prepareStatement(sql);
                pstmt.setString(1,"%"+searchWord+"%");
                rs = pstmt.executeQuery();

                while(rs.next()){
                    DeptVO vo = new DeptVO();
                    vo.setDepartment_id(rs.getInt("department_id"));
                    vo.setDepartment_name(rs.getString("department_name"));
                    vo.setLocation_id(rs.getInt("location_id"));
                    vo.setManager_id(rs.getInt("manager_id"));
                    list.add(vo);
                }
            } else if (searchKey.equals("location_id")) {
                sql = "select * from dept where location_id like ?";
                pstmt=conn.prepareStatement(sql);
                pstmt.setString(1,"%"+searchWord+"%");
                rs = pstmt.executeQuery();

                while(rs.next()){
                    DeptVO vo = new DeptVO();
                    vo.setDepartment_id(rs.getInt("department_id"));
                    vo.setDepartment_name(rs.getString("department_name"));
                    vo.setLocation_id(rs.getInt("location_id"));
                    vo.setManager_id(rs.getInt("manager_id"));
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
