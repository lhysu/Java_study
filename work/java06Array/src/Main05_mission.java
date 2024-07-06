import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main05_mission {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        //BufferedReader 사용할것
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //score : 이름, 국,영,수, 총점, 평균, 등급
        //new String[][]{
        // new String[]{"이순신1"."99","88","77","","",""}
        // new String[]{"이순신2"."99","88","77","","",""}
        // new String[]{"이순신3"."99","88","77","","",""}
        //}
        String[][] scores = new String[3][];

        for(int i = 0; i< 3 ;i++){
            System.out.println("이름을 입력하세요");
            String name = br.readLine();
            System.out.println("국어점수를 입력하세요");
            String kor = br.readLine();
            System.out.println("영어점수를 입력하세요");
            String eng = br.readLine();
            System.out.println("수학점수를 입력하세요");
            String math = br.readLine();

            int sum = Integer.parseInt(kor)+
                    Integer.parseInt(eng)+
                    Integer.parseInt(math);


            String grade="";
            if(sum/ 3>=90){
                grade = "A";
            } else if (sum/ 3>=80) {
                grade = "B";
            } else if (sum/ 3>=70) {
                grade = "C";
            }else grade = "D";

            String total = String.valueOf(sum);
            String avg = String.valueOf(sum/3);
            
            //toString : 객체 타입에 사용
            //String.valueOf : 기본 타입에 사용

            scores[i]=new String[]{name, kor, eng, math,total,avg,grade};

        }

        //최종 출력은 다중 반복문을 사용할 것

        for (int i = 0; i < scores.length; i++) {
            System.out.print("scores : ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j]+" ");
            }
            System.out.println();
        }
    }//end main



}//end class