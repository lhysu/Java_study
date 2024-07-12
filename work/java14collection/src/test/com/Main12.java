package test.com;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class Main12 {
    public static void main(String[] args) {
        System.out.println("hello");

        //컬렉션 객체 - 자바의 자료구조 객체들
        //특징 - 배열의 길이가 가변적이다.
        //구분 - 순서(인덱스)가 있는 것(List계열), 순서가 없는 것(Set계열,Map계열)

        //1.List<제네릭-객체타입 명시> - ArrayList
        //순서가 있고 중복데이터 허용
        //2.Set - HashSet

        //3.Map - HashMap, HashTable
        //Map<k,v> : k(key), v(value)
        //key는 중복허용하지 않고, value는 중복 허용
        //key의 순서는 없다.
        Map<String, String> map = new HashMap<>();
        //임의의 키, 값을 할당해서 길이, 반복문 출력하세요
        map.put("string1","11");
        map.put("string2","22");
        map.put("string3","33");
        map.put("string4","44");

        System.out.println("map.size():"+map.size());

        for(String key : map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
        System.out.println("==========================");

        Map<String, PersonVO> map2 = new HashMap<>();
        //임의의 키, 값을 할당해서 길이, 반복문 출력하세요
        map2.put("person1",new PersonVO());
        PersonVO vo = new PersonVO();
        vo.setNum(11);
        vo.setName("lee");
        vo.setAge(33);
        map2.put("person2",vo);

        System.out.println("map2.size():"+map2.size());

        for(String key : map2.keySet()){
            System.out.println(key+":"+map2.get(key));
        }
        System.out.println("==========================");

        Map<String, MemberVO> map3 = new HashMap<>();
        //임의의 키, 값을 할당해서 길이, 반복문 출력하세요
        map3.put("MemberVO1", new MemberVO());
        MemberVO mb = new MemberVO();
        mb.setNum(1);
        mb.setTel("111");
        mb.setName("kim");
        mb.setPw("1234");
        mb.setId("admin");
        map3.put("MemberVO2", mb);

        System.out.println("map3.size():"+map3.size());

        for(String key : map3.keySet()){
            System.out.println(key+":"+map3.get(key));
        }
        System.out.println("==========================");

        Map<String, BoardVO> map4 = new HashMap<>();
        //임의의 키, 값을 할당해서 길이, 반복문 출력하세요
        map4.put("BoardVO1",new BoardVO());
        BoardVO bd = new BoardVO();
        bd.setNum(1);
        bd.setTitle("aaaa");
        bd.setContent("bbbbb");
        bd.setWriter("cc");
        bd.setWdate("2024-07-12");
        map4.put("BoardVO2",bd);

        System.out.println("map4.size():"+map4.size());

        for(String key : map4.keySet()){
            System.out.println(key+":"+map4.get(key));
        }


    }//end main
}//end class
