package test.com;



public class Main05 {
    public static void main(String[] args) {
        System.out.println("hello");

        //사용자정의 객체로 오류를 강제발생시켜줄 수 있다.
        //throw + new 예외객체
        try {
            //throw new MyException();      //Exception을 상속받은 클래스
            //throw new MyException(33);

            MyException my = new MyException(33);
            System.out.println(my);
            throw my;       //강제 오류 발생

        } catch (Exception e) {
            System.out.println("catch...");
        }


        //System.out.println("end main...");
    }//end main



}//end class
