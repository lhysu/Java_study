package test.com;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        /*final*/ String name = "kim";      //로컬 내부 클래스 입장에서는 final이 생략되어 있는 것
        //name = "lee";                 //변경하면 로컬 내부함수에서 error
        //2.로컬 내부클래스
        class Inner {
            int num = 10;
            Inner(){
                System.out.println("Inner()...");

            }

            void test(){
                //메인함수영역의 로컬변수에 접근 가능 - 읽기 전용으로만
                //name = "lee"; //수정 불가,final 상수에만 접근 가능

                System.out.println("test()..."+name);
            }
        }

        Inner in = new Inner();
        in.test();

    }//end main


}//end class
