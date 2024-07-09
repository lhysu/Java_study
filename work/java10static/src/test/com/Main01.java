package test.com;

public class Main01 {

    String name = "kim"; //null
    static String tel = "02";//null
    static final String ADDR_EMAIL = "seoul@aaa.com";
    //final: 변경 불가, 처음에 반드시 초기화
    //static: 하나만 존재하는 변수, class 이름으로 호출(객체 생성 할 필요 없음)
    //대소문자변환 단축키: Ctrl + shift + u

    public void test1(){
        System.out.println("test1()...");
    }

    public static void test2(){
        System.out.println("test2()...");
    }

    public void test3(){
        System.out.println("test3()...");
        /*this.*/test1();        //콜 가능-앞에 this.이 생략되어 있다.(같은 클래스)
        /*Main01.*/test4();     //내 클래스 안에 있는 static method 호출 시 클래스명 생략 가능
    }

    public static void test4(){
        System.out.println("test4()...");
        new Main01().test1();  //static 메소드 내부에서 인스턴스 접근할 때는 객체 생성을 해서 접근
                                //재사용 없이 한번만 호출할거면 생성된 객체를 변수에 할당 하지 않는다.
    }

    class Inner{

    }

    static class inner2{

    }


    public static void main(String[] args) {
        System.out.println("main()...");

        Main01 m = new Main01();        //객체 생성을 해줘야 전역 변수, 함수 사용 가능(필요한 만큼만 쓰겠다)
        m.name = "lee";
        //Main01.ADDR_EMAIL = "aaa@aaa.com";        //readOnly Error
        Main01.tel = "031";
        System.out.println(m.name);
        System.out.println(Main01.tel);     //객체를 생성하지 않고 사용(버리지 않고 끝까지 쓰겠다)
                                            //너무 많이 사용하면 메모리가 부족해짐

        m.test1();
        /*Main01.*/test2();     //같은 클래스 내부에서는 클래스명 생략 가능

        //local final
        final int x = 10;
        //x = 20;   //error (readOnly)
        //x++;      //error (readOnly)
        System.out.println(x);





    }//end main
}//end class

//가비지 콜렉터가 가용 메모리에서 사용하지 않는 메모리를 모아 비운다.

//class:[속성, 메소드-기능, 생성자-초기화, 클래스]