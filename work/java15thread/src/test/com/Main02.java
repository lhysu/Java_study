package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");
        //스레드를 제어해보자
        //1.전역변수의 활용으로 스레드 제어
        PrintThread1 pt = new PrintThread1();
        pt.start();

        //1초간 일시정지
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //스레드 종료용 세터설정 변경
        pt.setStop(true);

        System.out.println("end main.......");
    }//end main
}//end class
