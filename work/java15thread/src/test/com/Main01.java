package test.com;

public class Main01 {
    public static void main(String[] args) {        //메인 스레드
        System.out.println("hello");

        //스레드 - Thread(run 메소드, start 메소드...)
        //start >> 실행대기(runnable) >> 실행(run)
        //>> sleep >> 일시 정지 >> 인터럽트(interrupt)
        //>> 실행대기(runnable) >> run >> 반복...
        //stop : 스레드 즉시 종료 - 불안전 종료를 유발하므로 사용하지 않는 것 권장
        //인터럽트 : 일시정지 상태의 스레드에서 interruptedException 발생시켜서
        //          catch문에서 실행대기상태로 가거나 종료상태로 갈 수 있도록 해준다.

        //병렬 처리
        //1.ThreadEx클래스 생성 - extends Thread
        Thread t = new ThreadEx();
        t.start();          //start를 호출했지만 실행되는건 run이다.(run을 호출하면 순차처리가 되어버림)

        //2.익명 내부 클래스
        new Thread(){
            @Override
            public void run() {
                //실제로 멀티프로세스가 동작될 코드블럭
                System.out.println("Inner start run()...");

                for (int i = 10; i < 20; i++) {

                    try {
                        System.out.println(i);//try문에서 문제가 발생하면
                        Thread.sleep(300);     // 1/1000 sec: 밀리초
                    } catch (InterruptedException e) {      //catch문 실행
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("end 10-19...");
                System.out.println("Inner end run()...");
            }
        }.start();

        //3. 이미 다른 클래스를 상속받은 상황 - Thread를 상속받을 수 없다.
        //이러한 경우 Runnable 인터페이스를 상속받고 구현 가능하다.
        //3-1.RunnableImpl
        Runnable r = new RunnableImpl();
        new Thread(r).start();


        //3-2.Runnable 익명 내부 클래스
        new Thread(new RunnableImpl(){
            @Override
            public void run() {
                //실제로 멀티프로세스가 동작될 코드블럭
                System.out.println("Inner RunnableImpl start run()...");

                for (int i = 2000; i < 2010; i++) {

                    try {
                        System.out.println(i);//try문에서 문제가 발생하면
                        Thread.sleep(300);     // 1/1000 sec: 밀리초
                    } catch (InterruptedException e) {      //catch문 실행
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("end 2000-2009...");
                System.out.println("Inner RunnableImpl end run()...");
            }
        }).start();



        //메인스레드에 있는 for
        for (int i = 0; i < 10; i++) {

            try {
                System.out.println(i);//try문에서 문제가 발생하면
                Thread.sleep(300);     // 1/1000 sec: 밀리초
            } catch (InterruptedException e) {      //catch문 실행
                throw new RuntimeException(e);
            }
        }

        System.out.println("end 0-9...");





        System.out.println("end main...");
    }//end main
}//end class

//순차실행: 현재 진행중인 작업이 끝나야 다음 작업 처리 가능
//병렬처리: 여러 작업을 동시에 실행(하는 것처럼 보이지만 할당된 시간만큼 왔다갔다 하면서 실행)
//멀티 프로세스: 여러개의 프로세스가 실행(멀티 프로세스 구현 = 병렬처리)
//start: 멀티프로세스를 동작(시작)시키는 명령(스레드에 들어있음)