package test.com.member;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {



    //3-1
    private static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "JAVA";
    private static final String PASSWORD = "hi123456";

    private Connection conn;        //커넥션 객체
    private PreparedStatement pstmt; //쿼리(sql문-CRUD) 실행객체
    private ResultSet rs;           //select 문 리턴 객체

    public MemberDAOimpl(){
        //db연동 순서
        //1.jdbc 라이브러리 세팅(경로 설정)
        //C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib ojdbc6.jar 복사
        //내프로젝트 >> lib 폴더(없으면 생성) >> 복붙
        //상단 메뉴 >> File >> Project Structure >> Libraries >> + >>복붙 경로 >> ojdbc6.jar 선택

        //2.오라클 드라이버 클래스 찾아서 인식(연동)-객체 생성 시 즉 생성자에서 구현
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver Success...");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //3.URL(호스트), 사용자명, 비번을 이용하여 데이터베이스 연동
        // 3-1. 전역변수선언
        // 3-2. 각 메소드에서 구현

    }


    @Override
    public int insert(MemberVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);

        int flag = 0;
        //3-2: 커넥션
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);

            String sql = "insert into member(num,id,pw,name,tel)"+
                    "values(seq_member.nextval,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,vo.getId());
            pstmt.setString(2,vo.getPw());
            pstmt.setString(3,vo.getName());
            pstmt.setString(4,vo.getTel());

            flag = pstmt.executeUpdate();   //DML
            System.out.println("flag : "+ flag);


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
    public int update(MemberVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        int flag = 0;
        //3-2: 커넥션
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);

            String sql = "update member set id=?,pw=?,name=?,tel=? "+
                    "where num=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,vo.getId());
            pstmt.setString(2,vo.getPw());
            pstmt.setString(3,vo.getName());
            pstmt.setString(4,vo.getTel());
            pstmt.setInt(5,vo.getNum());

            flag = pstmt.executeUpdate();   //DML
            System.out.println("flag : "+ flag);
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
    public int delete(MemberVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        int flag = 0;
        //3-2: 커넥션
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);

            String sql = "delete from member "+
                    " where num = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,vo.getNum());

            flag = pstmt.executeUpdate();   //DML
            System.out.println("flag : "+ flag);

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
    public MemberVO selectOne(MemberVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);

        MemberVO vo2 = null;
        //3-2: 커넥션
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");

            String sql = "select * from member where num = ?";      //?:와일드카드(쿼리에서 사용하는 변수)
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,vo.getNum());        //첫번째 ?에 변수 세팅

            rs= pstmt.executeQuery();
            while(rs.next()){
                vo2 = new MemberVO();
                vo2.setNum(rs.getInt("num"));
                vo2.setName(rs.getString("name"));
                vo2.setId(rs.getString("id"));
                vo2.setPw(rs.getString("pw"));
                vo2.setTel(rs.getString("tel"));
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
    public List<MemberVO> selectAll() {
        System.out.println("selectAll()...");
        List<MemberVO> list = new ArrayList<>();

        //3-2: 커넥션
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");

            //4.쿼리문 전달(요청)
            String sql="select * from member order by num desc";
            pstmt = conn.prepareStatement(sql);

            //5.쿼리문 반환(응답)
            rs = pstmt.executeQuery();      //DQL-select

            //6.rs >> list에 할당
            while(rs.next()){           //읽어들일 행이 있으면 true
                MemberVO vo = new MemberVO();
                vo.setNum(rs.getInt("num"));
                vo.setId(rs.getString("id"));
                vo.setPw(rs.getString("pw"));
                vo.setName(rs.getString("name"));
                vo.setTel(rs.getString("tel"));
                list.add(vo);

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


        return list;
    }

    @Override
    public List<MemberVO> searchList(String searchKey,
                                     String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<MemberVO> vos = new ArrayList<>();

        try {
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn success...");
            String sql="";
            if(searchKey.equals("name")){
                sql = "select * from member where name like ? order by num desc";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,"%"+searchWord+"%");

                rs = pstmt.executeQuery();

                while(rs.next()){
                    MemberVO vo = new MemberVO();
                    vo.setNum(rs.getInt("num"));
                    vo.setId(rs.getString("id"));
                    vo.setPw(rs.getString("pw"));
                    vo.setName(rs.getString("name"));
                    vo.setTel(rs.getString("tel"));
                    vos.add(vo);
                }

            }else if(searchKey.equals("tel")){
                sql = "select * from member where tel like ? order by num desc";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,"%"+searchWord+"%");

                rs = pstmt.executeQuery();

                while(rs.next()){
                    MemberVO vo = new MemberVO();
                    vo.setNum(rs.getInt("num"));
                    vo.setId(rs.getString("id"));
                    vo.setPw(rs.getString("pw"));
                    vo.setName(rs.getString("name"));
                    vo.setTel(rs.getString("tel"));
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
