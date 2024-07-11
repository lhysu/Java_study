package test.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main06 {
    public static void main(String[] args) {
        System.out.println("hello");

        //컬렉션 객체 - 자바의 자료구조 객체들
        //특징 - 배열의 길이가 가변적이다.
        //구분 - 순서(인덱스)가 있는 것(List계열), 순서가 없는 것(Set계열,Map계열)

        //1.List<제네릭-객체타입 명시> - ArrayList
        //순서가 있고, 중복데이터 허용

        //2.Set - HashSet
        //순서가 없고, 중복 데이터 허용 안함 - 값 변경 불가
        Set<Integer> set = new HashSet<>();
        set.add(1111);
        set.add(111111);
        set.add(1111);
        set.add(1111);
        set.add(111111);
        set.add(2222);
        set.add(222222);
        System.out.println(set);
        System.out.println(set.size());

        //fori 사용 불가능, foreach 사용 가능
        for(Integer x:set){
            System.out.println(x);
        }

        set.remove(1111);       //제거할 값을 이용해서 삭제
        System.out.println(set);

        set.clear();                //전부 제거
        System.out.println(set);

        Set<String> set2 = new HashSet<>();
        set2.add("kim1");
        set2.add("kim1");
        set2.add("kim2");
        set2.add("kim1");
        System.out.println(set2);

        Set<Car> set3 = new HashSet<>();
        //Car 클래스에서 equlas & hashCode 메소드를 재정의하면
        //데이터 클래스로 사용(주소비교가 아닌, 속성비교) 가능하다
        //재정의 전에는 new를 할때마다 주소가 다르기 때문에 중복된 객체가 아님


        set3.add(new Car());
        set3.add(new Car());
        set3.add(new Car("0000"));
        set3.add(new Car("0000"));
        set3.add(new Car("SM"));
        set3.add(new Car("SM"));


        System.out.println(set3);




        //3.Map - HashMap, HashTable

    }//end main
}//end class
