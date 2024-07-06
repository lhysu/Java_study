
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05_while5_mission {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //아래에 주어진 프로그램을 무한히 반복하되 [x입력 시 종료]
        //while문 사용

        //1.io - Input/Output : 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //변수 - 이름, 국,영,수,총점,평균,등급
        //kor,eng,math,total,avg,grade

        String result ="";
        String x= "";

        //for( ; ; )이거나 for(int i = 0; i<3 ; ) 이어도 무한 반복
        while(true){

            //이름을 입력하세요 라고 출력
            System.out.println("이름을 입력하세요");
            String name = br.readLine(); //string으로 입력받음

            //국어 점수를 입력하세요 라고 출력
            System.out.println("국어 성적을 입력하세요");
            //변수처리
            int kor = Integer.parseInt(br.readLine());
            //영어 점수를 입력하세요 라고 출력
            System.out.println("영어 성적을 입력하세요");
            //변수 처리
            int eng =Integer.parseInt(br.readLine());
            //수학 점수를 입력하세요 라고 출력
            System.out.println("수학 성적을 입력하세요");
            //변수 처리
            int math = Integer.parseInt(br.readLine());
            //총점 변수처리
            int total = kor + eng + math;
            //평균 번수처리
            double avg = total / 3;
            //등급 변수처리
            String grade = avg>=90?"A":avg>=80?"B":avg>=70?"C":"D";

            //반복문 내부 출력문

            System.out.printf("%s , 국어(%d) , 영어(%d) , 수학(%d), 총점(%d) , 평균(%.1f), 등급(%s)\n",name,kor,eng,math,total,avg,grade);

            result += String.format("%s , 국어(%d) , 영어(%d) , 수학(%d), 총점(%d) , 평균(%.1f), 등급(%s)\n",name,kor,eng,math,total,avg,grade);
            // result += name+", 국어("+kor+") , 영어("+eng+") , 수학("+math+"), 총점("+total+") , 평균("+avg+"), 등급("+grade+")\n";
            System.out.println("종료하려면 x를, 계속하려면 아무 키나 누르세요");


            if(br.readLine().equals("x")) break;

        }

        //최종출력문:  홍길동, 국어(99), 영어(88), 수학(77), 총점(264),평균(88.0),등급(B)
        System.out.println("===================end while=====================");
        System.out.println(result);



        //최종 결과문은 반복문이 종료된 후 연속으로 출력되도록 함


        br.close();         //입출력 사용이 끝났다면 닫아준다.
        System.out.println("end main...");
    }//end main
}//end class
