package test.com;

public class PrintThread3 extends Thread{


    @Override
    public void run() {
        //pt.interrupt() 호출되면 true를 반환하는 메소드 활용
        while(true){
            System.out.println("running...");
            if(Thread.interrupted()) break;
        }
        //System.out.println("stop run...");        //while문이 무한 반복일때 에러
    }
}
