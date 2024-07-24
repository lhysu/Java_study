package test.com.product;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class ProductDAOimpl implements ProductDAO {

    private static final String DRIVER_NAME="oracle.jdbc.OracleDriver";
    private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER="JAVA";
    private static final String PASSWORD = "hi123456";

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;


    public ProductDAOimpl() {
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver success...");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public int insert(ProductVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);

        int flag = 0;
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            String sql = "insert into product(num,pname,model,price,count,user_id)"+
                    "values(seq_product.nextval,?,?,?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,vo.getPname());
            pstmt.setString(2,vo.getModel());
            pstmt.setInt(3,vo.getPrice());
            pstmt.setInt(4,vo.getCount());
            pstmt.setString(5,vo.getUser_id());

            flag = pstmt.executeUpdate();
            System.out.println("flag : "+flag);

            System.out.println("conn success...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return flag;
    }


    @Override
    public int update(ProductVO vo) {
        System.out.println("update()...");
        System.out.println(vo);

        int flag = 0;
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            String sql = "update product set pname=?, model=?,price=?,count=?,user_id=? "+
                    " where num=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,vo.getPname());
            pstmt.setString(2,vo.getModel());
            pstmt.setInt(3,vo.getPrice());
            pstmt.setInt(4,vo.getCount());
            pstmt.setString(5,vo.getUser_id());
            pstmt.setInt(6,vo.getNum());

            flag = pstmt.executeUpdate();
            System.out.println("flag : "+flag);
            System.out.println("conn success...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return flag;
    }


    @Override
    public int delete(ProductVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        int flag = 0;
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            String sql = "delete from product where num=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,vo.getNum());

            flag = pstmt.executeUpdate();
            System.out.println("flag : "+flag);
            System.out.println("conn success...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        return flag;
    }

    @Override
    public ProductVO selectOne(ProductVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);

        ProductVO vo2 = null;
        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successs...");

            String sql = "select * from product where num = ?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,vo.getNum());

            rs=pstmt.executeQuery();

            while(rs.next()){
                vo2 = new ProductVO();
                vo2.setNum(rs.getInt("num"));
                vo2.setPname(rs.getString("pname"));
                vo2.setModel(rs.getString("model"));
                vo2.setPrice(rs.getInt("price"));
                vo2.setCount(rs.getInt("price"));
                vo2.setUser_id(rs.getString("user_id"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(conn!=null){
                try {
                    conn.close();
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
    public List<ProductVO> selectAll() {
        System.out.println("selectAll()...");
        List<ProductVO> list = new ArrayList<>();


        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");

            //4.쿼리요청
            String sql = "select * from product order by num desc";
            pstmt = conn.prepareStatement(sql);

            //5.쿼리응답
            rs = pstmt.executeQuery();

            //6.list 할당
            while(rs.next()){
                ProductVO vo = new ProductVO();
                vo.setNum(rs.getInt("num"));
                vo.setPname(rs.getString("pname"));
                vo.setModel(rs.getString("model"));
                vo.setPrice(rs.getInt("price"));
                vo.setCount(rs.getInt("count"));
                vo.setUser_id(rs.getString("user_id"));

                list.add(vo);


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }


    @Override
    public List<ProductVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<ProductVO> vos = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");

            if (searchKey.equals("pname")) {
                String sql = "select * from product where pname like ? order by num desc";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,"%"+searchWord+"%");

                rs = pstmt.executeQuery();

                while(rs.next()){
                    ProductVO vo = new ProductVO();
                    vo.setNum(rs.getInt("num"));
                    vo.setPname(rs.getString("pname"));
                    vo.setModel(rs.getString("model"));
                    vo.setPrice(rs.getInt("price"));
                    vo.setCount(rs.getInt("count"));
                    vo.setUser_id(rs.getString("user_id"));

                    vos.add(vo);
                }
            }
            else if(searchKey.equals("model")) {
                String sql = "select * from product where model like ? order by num desc";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,"%"+searchWord+"%");

                rs = pstmt.executeQuery();

                while(rs.next()){
                    ProductVO vo = new ProductVO();
                    vo.setNum(rs.getInt("num"));
                    vo.setPname(rs.getString("pname"));
                    vo.setModel(rs.getString("model"));
                    vo.setPrice(rs.getInt("price"));
                    vo.setCount(rs.getInt("count"));
                    vo.setUser_id(rs.getString("user_id"));

                    vos.add(vo);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(conn!=null){
                try {
                    conn.close();
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



        return vos;
    }
}

