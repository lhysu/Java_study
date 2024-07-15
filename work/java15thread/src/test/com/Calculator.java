package test.com;

public class Calculator {

    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) {     //동기화의 대상
        this.memory = memory;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //현재 동작중인 스레드의 이름 획득
        System.out.println(Thread.currentThread().getName());
        System.out.println(this.memory);


    }
}
