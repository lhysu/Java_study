package test.com;

public class Main05 {
    public static void main(String[] args) {
        System.out.println("hello");

        //3.멤버 내부 클래스( 가장 보편적인 내부 클래스)
        MemberOuter outer = new MemberOuter();
        MemberOuter.Inner inner = outer.new Inner();
        inner.test();

        //4.스태틱 내부 클래스

        MemberOuter.StaticInner.start();        //static이니까 클래스 이름만으로 접근



    }//end main


}//end class
