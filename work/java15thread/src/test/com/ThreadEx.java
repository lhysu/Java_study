package test.com;

public class ThreadEx extends Thread {
    @Override
    public void run() {
        //실제로 멀티프로세스가 동작될 코드블럭
        System.out.println("ThreadEx start run()...");

        for (int i = 10; i < 20; i++) {

            try {
                System.out.println(i);//try문에서 문제가 발생하면
                Thread.sleep(300);     // 1/1000 sec: 밀리초
            } catch (InterruptedException e) {      //catch문 실행
                throw new RuntimeException(e);
            }
        }

        System.out.println("end 10-19...");
        System.out.println("ThreadEx end run()...");
    }
}
