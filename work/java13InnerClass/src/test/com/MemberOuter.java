package test.com;

public class MemberOuter {

    String name = "kim";
    static String title = "java";

     MemberOuter(){
         new Inner().work();
     }

    //일반 내부 클래스
    class Inner extends Father implements Mother{
        int kor = 10;
        int eng = 99;
        //static int math = 88;   //jdk 17이상부터 사용 가능

        void test(){
            System.out.println("test()..."+name);
            //바깥 클래스의 전역변수는 내부 클래스에서 객체생성 없이 사용 가능
            System.out.println(title);
        }

        @Override
        public void work() {
            System.out.println("work()...");
        }

        @Override
        public void play() {
            System.out.println("play()...");
        }
        //상속 가능

    }

    //static 내부 클래스
    static class StaticInner{
        static int kor = 10;
        static int eng = 99;

        static void start(){
            System.out.println("start()...");
            System.out.println(title);

            //static 내부에서 static 아닌 것 사용하면 에러
        }
    }       //보통 static 내부에는 static만 모아 둠

}
