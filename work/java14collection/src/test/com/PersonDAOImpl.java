package test.com;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO{

    List<PersonVO> list = new ArrayList<>();

    @Override
    public int insert(PersonVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        list.add(vo);
        return 0;
    }

    @Override
    public int update(PersonVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        for(PersonVO x : list){
            if(x.getNum() == vo.getNum()){
                x.setName(vo.getName());
            }
        }

        return 0;
    }

    @Override
    public int delete(PersonVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum() == vo.getNum()){
                list.remove(i);
            }
        }
        return 0;
    }

    @Override
    public PersonVO selectOne(PersonVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        PersonVO vo2 = new PersonVO();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum() == vo.getNum()){
                vo2 = list.get(i);
            }
        }
        return vo2;
    }

    @Override
    public List<PersonVO> selectAll() {
        System.out.println("selectAll()..");

        return list;
    }

    @Override
    public List<PersonVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()....");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<PersonVO> vos = new ArrayList<>();
        if(searchKey=="name"){

            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getName().contains(searchWord)){
                    vos.add(list.get(i));
                }
            }
        }else{
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getAge()==Integer.parseInt(searchWord)){
                    vos.add(list.get(i));
                }
            }

        }



        return vos;
    }
}