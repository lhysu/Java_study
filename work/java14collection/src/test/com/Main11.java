package test.com;

import java.util.HashMap;
import java.util.Map;

public class Main11 {
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
        Map<String,Integer> map = new HashMap<>();
        map.put("kor",99);
        map.put("kor",88);      //가장 마지막에 입력된 key가 최종 저장
        map.put("eng",77);
        map.put("math",66);

        System.out.println(map);
        System.out.println("map.size():"+map.size());

        System.out.println(map.get("kor"));     //값은 key로만 가져올 수 있다.
        System.out.println(map.get("eng"));
        System.out.println(map.get("math"));

        System.out.println(map.keySet());       //key만 가져오기-Set type
        System.out.println(map.values());       //value만 가져오기

        for(String key : map.keySet()){
            System.out.println(map.get(key));;
        }


    }//end main
}//end class
