package test.com;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");

        //추상 클래스의 객체 생성 - 상속관계의 다형성으로만 생성가능
        //TestAbs abs = new TestAbs();  //error
        TestAbs abs = new TestAbs() {


            @Override
            public void sleep() {
                System.out.println("inner sleep()...");
            }
        };
        abs.test();
        abs.sleep();

        TestAbsEx tex = new TestAbsEx();
        tex.sleep();
        tex.test();




    }//end main
}//end class
