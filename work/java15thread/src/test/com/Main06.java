package test.com;

import java.util.ArrayList;
import java.util.List;

public class Main06 {
    public static void main(String[] args) {
        System.out.println("hello");

        //동기화 메소드(synchronized) :
        //스레드가 사용중인 객체를 다른 스레드가 변경할 수 없게 하는 메소드
        //스레드가 끝날때까지 객체에 잠금을 걸어서 사용할수 없도록 한다.
        //임계영역: 크리티컬 섹션이라 하며, 멀티스레드 프로그램에서 단 하나의 스레드만 실행할 수 있는 코드 영역
        //결론적으로 임계영역을 지정하기 위한 메소드 >> 동기화 메소드


        Calculator cal = new Calculator();
        cal.setMemory(1111);
        System.out.println(cal.getMemory());

        System.out.println("===================");

        User01 u1 = new User01();
        u1.setCal(cal);
        u1.start();

        User02 u2 = new User02();
        u2.setCal(cal);
        u2.start();

       /* List<Calculator> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            cal.setMemory(i);       //cal 주소는 고정되어 있음
            list.add(cal);          //마지막에 넣은 값으로만 채워지게 됌
                                    //-> 바뀌는 i 값을 넣고 싶으면 객체 생성을 매번 새로 해줘야 함
        }
        System.out.println(list.size());
        for(Calculator x : list){
            System.out.println(x.getMemory());
        }
*/


        System.out.println("end main.......");
    }//end main
}//end class
