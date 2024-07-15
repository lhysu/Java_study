package test.com;

public class Main05 {
    public static void main(String[] args) {
        System.out.println("hello");
        //데몬 스레드: 주 스레드(메인 스레드)작업을 돕는 보조적 역할을 하는 스레드
        //            주 스레드가 종료되면 데몬스레드는 자동 종료
        //            주 스레드와 동반종료되는 것을 제외하면 큰 차이 없다.
        //설정: 스레드 시작 전에 반드시 데몬스레드를 호출

        //컨셉: 주 스레드가 종료될 때 자동저장기능도 같이 종료되는 데몬 스레드를 추가하자.
        AutosaveThread ast = new AutosaveThread();
        ast.setDaemon(true);        //일반 스레드에서 데몬스레드로 설정
        ast.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("end main.......");
    }//end main
}//end class
