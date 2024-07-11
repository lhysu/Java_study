package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //1.익명내부클래스 - 변수할당가능, 함수인자전달, 리턴문에 할당
        Father f = new Father() {
            @Override
            public void work() {
                System.out.println("work()...1");
            }
        };
        f.work();

        test(f);

        test(new Father() {
            @Override
            public void work() {
                System.out.println("work()...2");
            }
        });

        Father f2 = test2();
        f2.work();

    }//end main

    public static void test(Father f){
        f.work();
    }

    public static Father test2(){
        return new Father() {
            @Override
            public void work() {
                System.out.println("work()...3");
            }
        };
    }

}//end class
