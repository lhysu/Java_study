import java.util.Scanner;

public class Main03_mission3 {
    public static void main(String[] args)  {
        System.out.println("hello");

        Scanner s = new Scanner(System.in);
        //메뉴를 입력하세요
        System.out.println("메뉴를 입력하세요[1.입력 2.수정 3.삭제 4.검색 5.종료]");
        //메뉴 선택 [1.입력 2.수정 3.삭제 4.검색 5.종료]
        int menu = s.nextInt();

        //어떤번호를 선택했는지에 따라서 분기처리
        switch(menu){
            case 1:                         //1번을 선택: 입력 이라고 출력
                System.out.println("입력");
                break;
            case 2:                         //2번을 선택: 수정 이라고 출력
                System.out.println("수정");
                break;
            case 3:                         //3번을 선택: 삭제 이라고 출력
                System.out.println("삭제");
                break;
            case 4:                         //4번을 선택: 검색 이라고 출력
                System.out.println("검색");
                break;
            case 5:                         //5번을 선택: 프로그램을 종료합니다 라고 출력
                System.out.println("프로그램을 종료합니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }

        s.close();

        System.out.println("end main...");


    }//end main
}//end class
