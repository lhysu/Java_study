package test.com;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO{

    List<PersonVO> list = new ArrayList<>();

    @Override
    public int insert(PersonVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        int flag = 0;
        if(list.size()==0){
            vo.setNum(1);
        }else{
            vo.setNum(list.get(list.size()-1).getNum()+1);
        }
        list.add(vo);
        flag = 1;
        return flag;
    }

    @Override
    public int update(PersonVO vo) {
        int flag = 0;
        System.out.println("update()...");
        System.out.println(vo);
        for(PersonVO x : list){
            if(x.getNum() == vo.getNum()){
                x.setName(vo.getName());
                flag = 1;
            }
        }


        return flag;
    }

    @Override
    public int delete(PersonVO vo) {
        int flag = 0;
        System.out.println("delete()...");
        System.out.println(vo);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum() == vo.getNum()){
                list.remove(i);
                flag = 1;
            }
        }
        return flag;
    }

    @Override
    public PersonVO selectOne(PersonVO vo) {
        System.out.println("selectOne()...");
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
        if(searchKey.equals("name")){

            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getName().contains(searchWord)){
                    vos.add(list.get(i));
                }
            }
        }else if(searchKey.equals("age")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getAge()==Integer.parseInt(searchWord)){
                    vos.add(list.get(i));
                }
            }

        }else System.out.println("찾을 수 없습니다.");



        return vos;
    }
}