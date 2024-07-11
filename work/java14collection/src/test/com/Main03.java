package test.com;

import java.util.ArrayList;
import java.util.List;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");

        //컬렉션 객체 - 자바의 자료구조 객체들
        //특징 - 배열의 길이가 가변적이다.
        //구분 - 순서(인덱스)가 있는 것(List계열), 순서가 없는 것(Set계열,Map계열)

        //1.List<제네릭-객체타입 명시> - ArrayList
        //순서가 있고 중복데이터 허용
        List<Car> list = new ArrayList<>();
        //데이터 추가
        list.add(new Car());
        list.add(new Car("0000"));
        list.add(new Car("SM"));
        list.add(new Car("RR"));

        System.out.println(list);

        //데이터 길이
        System.out.println("list.size():"+list.size());

        //데이터 획득
        System.out.println(list.get(0));        //인덱스 별 값
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        //fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).model);
        }

        //foreach
        for(Car x: list){
            System.out.println(x.model);
        }


        //데이터 변경
        list.set(1,new Car());
        System.out.println(list);

        //데이터 삭제
        list.remove(2);
        System.out.println(list);       //데이터만 없애는 것이 아니라 공간 자체가 없어짐

        //데이터 모두 삭제
        list.clear();
        System.out.println("list.size():"+list.size());

        //2.Set - HashSet

        //3.Map - HashMap, HashTable

    }//end main
}//end class
