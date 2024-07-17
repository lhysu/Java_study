package test.com.member;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO {

    public List<MemberVO> list = new ArrayList<>();
    public MemberDAOImpl(){
        for (int i = 0; i < 5; i++) {
            MemberVO vo = new MemberVO();

            vo.setNum(1+i);
            vo.setId("admin"+(i+1));
            vo.setPw("hellojava"+(i+1));
            vo.setName("kim"+(i+1));
            vo.setTel("010"+(i+1));

            list.add(vo);
        }
    }



    @Override
    public int insert(MemberVO vo) {
        int flag = 0;
        System.out.println("insert()...");
        System.out.println(vo);
        if(list.size()==0){
            vo.setNum(1);
        }else {
            vo.setNum(list.get(list.size()-1).getNum()+1);
        }
        list.add(vo);

        flag = 1;

        return flag;
    }

    @Override
    public int update(MemberVO vo) {
        int flag = 0;
        System.out.println("update()...");
        System.out.println(vo);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum()==vo.getNum()){
                list.set(i,vo);
                flag = 1;
            }
        }

        return flag;
    }

    @Override
    public int delete(MemberVO vo) {
        int flag = 0;
        System.out.println("delete()...");
        System.out.println(vo);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum()==vo.getNum()){
                list.remove(i);
                flag = 1;
            }
        }
        return flag;
    }

    @Override
    public MemberVO selectOne(MemberVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        MemberVO vo2 = null;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum()==vo.getNum()){
                vo2 = list.get(i);
            }
        }

        return vo2;
    }

    @Override
    public List<MemberVO> selectAll() {
        System.out.println("selectAll()...");
        return list;
    }

    @Override
    public List<MemberVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        List<MemberVO> list2 = new ArrayList<>();
        if(searchKey.equals("id")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getId().contains(searchWord)){
                    list2.add(list.get(i));
                }
            }
        }else if(searchKey.equals("name")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getName().contains(searchWord)){
                    list2.add(list.get(i));
                }
            }
        }else{
            list2 = list;
        }

        return list2;
    }
}
