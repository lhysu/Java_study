package test.com;

import java.util.*;

public class Main07 {
    public static void main(String[] args) {
        System.out.println("hello");

        //컬렉션 객체 - 자바의 자료구조 객체들
        //특징 - 배열의 길이가 가변적이다.
        //구분 - 순서(인덱스)가 있는 것(List계열), 순서가 없는 것(Set계열,Map계열)

        //1.List<제네릭-객체타입 명시> - ArrayList
        //순서가 있고, 중복데이터 허용

        //2.Set - HashSet
        //순서가 없고, 중복 데이터 허용 안함 - 값 변경 불가
        //미션 - 로또번호 생성하기
        Random r = new Random();
        Set<Integer> set = new HashSet<>();
        while(set.size()<6){
            set.add(r.nextInt(45)+1);
        }
        System.out.println(set);

        //정렬1: 배열에 넣어 정렬
        Object[] obj = set.toArray();
        Arrays.sort(obj);
        System.out.println(Arrays.toString(obj));
        System.out.println("=============================");


        //정렬2: list에 넣어 정렬
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        //역정렬 가능
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;     //순정렬
                //return o2 - o1;     //역정렬
            }
        });
        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;   //순정렬
                //return o2 - o1;     //역정렬
            }
        });
        System.out.println(list);

        List<String> names = new ArrayList<>();
        names.add("aaa");
        names.add("ccc");
        names.add("bbb");
        names.sort(new Comparator<String>() {
              @Override
              public int compare(String o1, String o2) {
                  return o1.compareTo(o2);
                  //return o2.compareTo(o1);

              }
          });
        System.out.println(names);

        List<PersonVO> vos = new ArrayList<>();
        PersonVO vo = new PersonVO();
        vo.setNum(1);
        vo.setName("kim");
        vo.setAge(33);
        vos.add(vo);
        vo = new PersonVO();
        vo.setNum(2);
        vo.setName("han");
        vo.setAge(55);
        vos.add(vo);
        vo = new PersonVO();
        vo.setNum(3);
        vo.setName("yang");
        vo.setAge(22);
        vos.add(vo);
        System.out.println(vos);

        //이름의 오름차순 정렬
        vos.sort(new Comparator<PersonVO>() {
            @Override
            public int compare(PersonVO o1, PersonVO o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(vos);

        //나이의 내림차순 정렬
        vos.sort(new Comparator<PersonVO>() {
            @Override
            public int compare(PersonVO o1, PersonVO o2) {
                return o2.getAge()- o1.getAge();
            }
        });
        System.out.println(vos);

        //MemberVO를 이용해서 ArrayList에 추가하고
        List<MemberVO> vos2 = new ArrayList<>();
        MemberVO mb = new MemberVO();
        mb.setNum(1);
        mb.setName("kim");
        mb.setTel("0101");
        vos2.add(mb);
        mb = new MemberVO();
        mb.setNum(2);
        mb.setName("lee");
        mb.setTel("0103");
        vos2.add(mb);
        mb = new MemberVO();
        mb.setNum(3);
        mb.setName("han");
        mb.setTel("0102");
        vos2.add(mb);

        //이름으로 내림차순 정렬
        vos2.sort(new Comparator<MemberVO>() {
            @Override
            public int compare(MemberVO o1, MemberVO o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println(vos2);

        //전화번호로 오름차순 정렬
        vos2.sort(new Comparator<MemberVO>() {
            @Override
            public int compare(MemberVO o1, MemberVO o2) {
                return o1.getTel().compareTo(o2.getTel());
            }
        });
        System.out.println(vos2);

        //3.Map - HashMap, HashTable

    }//end main
}//end class


//배열의 길이: 속성 - length
//문자열의 길이: 메소드 - length()
//컬렉션의 길이: 메소드 - size()