package test.com;


import com.multi.Bus;
//import com.multi.*;               //import한 패키지의 모든 것 사용

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        //자동 import 설정하기
        //툴 상단 설정 아이콘 >> Settings >>Editer >> General >  AutoImport
        //>>java 항목의 체크박스 모두 체크

        //클래스 정의 가능한 영역
        //1.패키지에 생성 - test.com.person
        //객체 생성 - new + 생성자
        //변수에 할당
        //String s = new String();
        //Object obj = new Object();
        Person p = new Person();
        System.out.println(p.name);

        //com.multi.Bus bus= new com.multi.Bus();       //import 안했을 때
        Bus bus = new Bus();

        //2.클래스 내부에 중첩해서 정의 가능 - 나중에 학습
        class Test{

        }

        //3.메인클래스파일(메인함수가 있는 클래스)을 외부에 정의 가능(비권장)


        //할당연산 우측: 리터럴

    }//end main

    //2번
    class Car{

    }


}//end class

//3번
class Student{
    //테스트용이거나 메인클래스와 일회용으로 사용될 때
}
