
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main03_mission {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //1.io - Input/Output : 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //변수 - 이름, 국,영,수,총점,평균,등급
        //kor,eng,math,total,avg,grade
        //이름을 입력하세요 라고 출력
        //국어 점수를 입력하세요 라고 출력
        //변수처리
        //영어 점수를 입력하세요 라고 출력
        //변수 처리
        //수학 점수를 입력하세요 라고 출력
        //변수 처리

        //총점 변수처리
        //평균 번수처리
        //등급 변수처리

        //최종출력문:  홍길동, 국어(99), 영어(88), 수학(77), 총점(264),평균(88.0),등급(B)


        System.out.println("이름을 입력하세요");
        String name = br.readLine(); //string으로 입력받음

        System.out.println("국어 성적을 입력하세요");
        int kor = Integer.parseInt(br.readLine());
        System.out.println("영어 성적을 입력하세요");
        int eng =Integer.parseInt(br.readLine());
        System.out.println("수학 성적을 입력하세요");
        int math = Integer.parseInt(br.readLine());

        int total = kor + eng + math;
        double avg = total / 3;
        String grade = avg>=90?"A":avg>=80?"B":avg>=70?"C":"D";

        System.out.printf("%s , 국어(%d) , 영어(%d) , 수학(%d), 총점(%d) , 평균(%.1f), 등급(%s)\n",name,kor,eng,math,total,avg,grade);

        br.close();         //입출력 사용이 끝났다면 닫아준다.
        System.out.println("end main...");
    }//end main
}//end class
