package test.com;

import java.util.List;


//@FunctionalInterface
//멀티 추상 메소드 가질 수 없음(추상 메소드 하나여야 함)


public interface PersonDAO {

    public int insert(PersonVO vo);
    public int update( PersonVO vo);
    public int delete( PersonVO vo);
    public PersonVO selectOne(PersonVO vo);
    public List<PersonVO> selectAll();
    public List<PersonVO> searchList(String searchKey, String searchWord);


}

//추상 클래스, 인터페이스는 상속의 구조로 객체를 생성해야 함(다형성)
//추상메소드를 포함한다면 무조건 오버라이딩, 없으면 오버라이딩 할 필요 없음.
