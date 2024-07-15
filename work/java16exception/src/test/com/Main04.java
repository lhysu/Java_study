package test.com;



public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        //오류를 강제발생시켜줄 수 있다.
        //throw + new 예외객체
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch...");
        }


        //System.out.println("end main...");
    }//end main



}//end class
