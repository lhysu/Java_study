import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06_do_while {
    public static void main(String[] args)throws IOException {
        System.out.println("hello");


        //1.BufferedReader 객체 생성 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //2.add throws(예외 전가)
        String x = "y";
        do{
            System.out.println("계속하시려면 아무 키 입력, 종료시[x]입력");

        }while(x.equals("aaa")); //end do-while

        System.out.println("end main...");
    }//end main
}//end class
