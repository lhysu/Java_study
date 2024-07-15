package test.com;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");
        //스레드를 제어해보자


        //3.인터럽트 + 인터럽트 감지 메소드 + break
        PrintThread3 pt = new PrintThread3();
        pt.start();

        //1초간 일시정지
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //인터럽트 메소드 활용해서 종료시키기(스레드가 일시정지(sleep) 상태일때만 인터럽트 가능)
        pt.interrupt();

        System.out.println("end main.......");
    }//end main
}//end class
