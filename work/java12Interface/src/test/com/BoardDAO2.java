package test.com;

public interface BoardDAO2 {

    /*public static final*/ String ADDR = "seoul";        //public static final이 생략되어 있음

    public /*abstract*/ int update();       //abstract 생략 가능

    //default method
    public default void work(){
        System.out.println("BoardDAO2...work()");

    }

    //static method
    public static void sleep(){
        System.out.println("BoardDAO2...sleep()");

    }

}
