import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05_while4 {
    public static void main(String[] args)throws IOException {
        System.out.println("hello");


        //1.BufferedReader 객체 생성 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //2.add throws(예외 전가)
        String x = "y";
        while(true){
            System.out.println("계속하시려면 아무 키 입력, 종료시[x]입력");
            x=br.readLine();
            System.out.println(x);
            if(x.equals("x")) break;

        }
        //주의: 상단의 무한반복문내부에 break문이 없을 경우
        //하단의 코딩은 컴파일 오류 발생
        System.out.println("end main...");
    }//end main
}//end class
