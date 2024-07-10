package test.com;

public interface BoardDAO {

    /*public static final*/ String NAME = "kim";        //public static final이 생략되어 있음

    public /*abstract*/ int insert();       //abstract 생략 가능

    public default int delete(){
        System.out.println("delfault delete()...");
        return 1;
    }       //인터페이스에서 일반메소드를 만들 때 default를 붙여야 함 - 객체 생성 후 콜

    public static int selectOne(){
        System.out.println("static selectOne()...");
        return 9;
    }       //BoardDAO.selectOne()으로 콜 가능

}
