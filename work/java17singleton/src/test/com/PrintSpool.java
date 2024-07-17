package test.com;

public class PrintSpool {

    //1.전역변수(스태틱, 접근최소화)
    private static PrintSpool singleton = new PrintSpool();

    //2.싱글톤객체를 리턴해주는 스태틱 메소드
    public static PrintSpool getInstance(){
        return singleton;
    }

    //3.인자없는 생성자 - private(new를 못하게 막음)
    private PrintSpool(){

        //멀티스레드 테스트용 sleep
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void print(String txt) {
        System.out.println("print()...");
        System.out.println(txt);


    }
}
