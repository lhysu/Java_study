import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main05_mission2 {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        //BufferedReader 사용할것
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //members : id, pw, name, tel
        //new String[][]{
        // new String[]{"admin","hi1234","kim","010"}
        // new String[]{"admin","hi1234","kim","010"}
        // new String[]{"admin","hi1234","kim","010"}
        //}

        //3명의 회원을 가입시키는 반복문을 작성한 후 출력하세요

        String[][] members = new String[3][];

        for (int i = 0; i < members.length; i++) {
            System.out.print("id : ");
            String id = br.readLine();

            System.out.print("pw : ");
            String pw = br.readLine();

            System.out.print("name : ");
            String name = br.readLine();

            System.out.print("tel : ");
            String tel = br.readLine();

            members[i] = new String[]{id,pw,name,tel};
        }

        for (int i = 0; i < members.length; i++) {
            System.out.print("members: ");
            for (int j = 0; j < members[i].length; j++) {
                System.out.print(members[i][j]+" ");

            }
            System.out.println();
        }

        //**일반배열이 될 수 있는 경우 - 기본타입[], 참조타입[]
        //1.기본타입[] - int[], double[], char[], short[], byte[], boolean[], float[], long[]
        //2.참조타입[] - 배열[](int[][]...), 클래스타입[](String[], Integer[]...), 사용자정의클래스타입[](Person[]...)

        //**나중에 배울 컬렉션배열 - List, Set, Map

    }//end main



}//end class