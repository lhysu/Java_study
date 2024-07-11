package test.com;

//추상 클랫 - 추상메소드를 포함할 수 있는 클래스
public abstract class TestAbs {

    String name = "kim";
    int age = 33;

    public TestAbs(){
        System.out.println("TestAbs()...");
    }

    public void test(){
        System.out.println("test()...");
    }

    //추상 메소드 - 메소드 실행블럭 없이 선언만 된 메소드
    //상속받는 클래스에서 반드시 오버라이딩 해야함.

    public abstract void sleep();


}
