package com.multi;

import test.com.Person;

import java.util.Arrays;
import java.util.Random;
//import aaa.com.Person;        //error
//클래스 이름이 같은 것이 있을 경우 동시에 import 불가능
//한 프로젝트 내에 같은 이름의 클래스가 있으면 복잡해짐
//패키지가 다르면 같은 이름으로 클래스는 생성할 수 있지만, 접근할때 어려워짐


public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");

        Person p = new Person();

        //동일 클래스 명을 한곳에서 모두 사용하고자 한다면
        //임포트 안된 클래스는 패키지 절대 경로를 명시해줘야 한다.
        aaa.com.Person p2 = new aaa.com.Person();

        System.out.println(p);          //p : Person type
        System.out.println(p.toString());   //p.toString() : String type
        System.out.println(p.name);
        System.out.println(p.age);


        //객체 생성 후에 값 변경
        p.name = "kim";
        p.age = 33;

        System.out.println(p.name);
        System.out.println(p.age);

        System.out.println(Person.tel);     //static 변수 tel은 클래스 이름으로 접근
       //static 변수는 객체 생성과는 무관
       Person.tel = "010";
        System.out.println(Person.tel);

        Random r = new Random();// 임의의 데이터를 생성해주는 객체
        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextBoolean());
            System.out.println(r.nextDouble());
            System.out.println(r.nextInt());
            System.out.println(r.nextInt(3));   //0~2
            System.out.println("=================");
        }

        //배열 내용을 반복문을 사용하지 않고 확인하기
        String[] strs = new String[]{"ccc","bbb","aaa"};
        System.out.println(strs);
        System.out.println(Arrays.toString(strs));      //배열 내부를 보고싶을 때(확인용)
        Arrays.sort(strs);     //원본데잉터 배열을 오름차순 정렬해서 변경시켜줌
        System.out.println(Arrays.toString(strs));

        String str = "kim";
        System.out.println(str);
        System.out.println(str.replace("k","K"));   //원본이 바뀌는게 아님
        System.out.println(str);


    }//end main
}//end class

