package test.com;

public class User02 extends Thread{
    private Calculator cal;

    public void setCal(Calculator cal) {
        this.cal = cal;
        //스레드 이름 변경
        this.setName("User02...");
    }

    @Override
    public void run() {
        System.out.println("User02...run()...");
        cal.setMemory(200);
        System.out.println("===================");
    }
}
