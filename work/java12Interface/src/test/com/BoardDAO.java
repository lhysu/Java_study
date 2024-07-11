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

//인터페이스 - static, default, abstract 함수 사용 가능, 전역변수 사용 불가능-전부 상수로 선언
//         -인터페이스가 클래스를 상속받을 수는 없다.
//클래스가 클래스 하나와 (extends) 인터페이스 여러개를(implements) 동시에 상속받을 수 있다.
//abstract 클래스는 오버라이딩이 강제된다.
//오버로딩: 같은 클래스 내에서 이루어지며 같은 이름의 함수를 여러개 정의할 수 있지만 매개변수 타입이나 개수 다르게 설정
//오버라이딩: 자식 클래스가 부모 클래스에게 상속받은 메소드를 재정의. 기존의 것과 같은 매개변수, 이름, 반환타입.
//다형성: 자식의 생성자로 부모 객체 생성
