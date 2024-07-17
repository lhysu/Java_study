package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");


        //싱글톤 패턴(프로그래밍 개발 디자인패턴)
        //클래스에서 만들 수 있는 인스턴스가 오직 하나일 경우
        //이 객체의 접근은 어디서든지 하나로만 통일해서 제공하도록 객체생성하는 기법

        //컨셉: 특정 시스템에 많은 프린트기능이 있다고 가정. 프린터 스풀은 하나
        //new는 한번만 하고 만들어진 걸 가져다 쓰자

        //PrintSpool ps1 = new PrintSpool();
        PrintSpool ps1 = PrintSpool.getInstance();
        System.out.println(ps1);
        ps1.print("hello111");

        PrintSpool ps2 = PrintSpool.getInstance();
        System.out.println(ps2);
        ps2.print("hello222");




    }//end main
}//end class

//Model: DB에 질의를 하고 응답을 받는 부분
//Web MVC 디자인 패턴: Model-View(프론트엔드-html, css, javascript)-Controller(제어-웹컨테이너의 자바 servlet)

