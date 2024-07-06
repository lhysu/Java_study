package test.com;

//전체 주석, 부분주석 단축기: Ctrl + shift + /
//눈에는 안보이지만 모든 클래스는 Object 클래스를 상속받고 있다.
public class Person /*extends Object*/ {

    //속성 - 이름, 나이
    //전역변수 - 해당타입의 기본값으로 자동할당됨.
    //접근제한자 설정 가능
    //member field, property, attribute,
    public String name; // null 값이 할당
    public int age;     //0

    //static 선언 가능한 곳 : 클래스, 전역변수, 메소드
    public static String tel;       //static 선언된 변수는 클래스 이름으로 접근가능.
                                    // new연산이 없어도 메모리에 주소가 생겨서 바로 사용 가능



}

//접근제한자
//public: 다른 패키지에서 접근 가능(공용)
//default(아무것도 안적음): 다른 패키지가 속성에 접근할 수 없음. 같은 패키지 내 클래스끼리 접근 가능
//private: 해당 클래스 내부에서만 접근 가능
//protected: 클래스간 상속관계면 접근 가능(패키지 범위를 벗어나도)