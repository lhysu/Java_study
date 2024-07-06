import java.util.Scanner;

public class Main03_mission2 {
    public static void main(String[] args)  {
        System.out.println("hello");

        //2. Scanner 입출력
        Scanner s = new Scanner(System.in);

        //변수 - 이름, 국,영,수,총점,평균,등급
        //kor,eng,math,total,avg,grade

        //이름을 입력하세요 라고 출력
        System.out.println("이름을 입력하세요");
        String name = s.nextLine(); //string으로 입력받음

        //국어 점수를 입력하세요 라고 출력
        System.out.println("국어 성적을 입력하세요");
        //변수처리
        int kor = s.nextInt();

        //영어 점수를 입력하세요 라고 출력
        System.out.println("영어 성적을 입력하세요");
        //변수 처리
        int eng =s.nextInt();

        //수학 점수를 입력하세요 라고 출력
        System.out.println("수학 성적을 입력하세요");
        //변수 처리
        int math = s.nextInt();

        //총점 변수처리
        int total = kor + eng + math;
        //평균 번수처리
        double avg = total / 3;
        //등급 변수처리
        String grade = avg>=90?"A":avg>=80?"B":avg>=70?"C":"D";

        //최종출력문:  홍길동, 국어(99), 영어(88), 수학(77), 총점(264),평균(88.0),등급(B)
        System.out.printf("%s , 국어(%d) , 영어(%d) , 수학(%d), 총점(%d) , 평균(%.1f), 등급(%s)",name,kor,eng,math,total,avg,grade);

        s.close();      //스캐너 사용이 끝났다면 닫아준다.
    }//end main
}//end class
