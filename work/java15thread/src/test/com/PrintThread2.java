package test.com;

public class PrintThread2 extends Thread{


    @Override
    public void run() {
        try {
            while(true){
                System.out.println("running....");
                Thread.sleep(1);        //0.001 sec
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //System.out.println("stop run...");
    }
}
