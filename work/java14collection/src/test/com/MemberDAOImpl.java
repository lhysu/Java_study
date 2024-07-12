package test.com;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO{

    List<MemberVO> list = new ArrayList<>();

    @Override
    public int insert(MemberVO vo) {
        int flag = 0;
        System.out.println("insert()...");
        System.out.println(vo);
        if (list.size()==0){
            vo.setNum(1);
        }else vo.setNum(list.get(list.size()-1).getNum()+1);
        list.add(vo);
        flag = 1;
        return flag;
    }

    @Override
    public int update(MemberVO vo) {
        int flag=0;
        System.out.println("update()...");
        System.out.println(vo);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum() == vo.getNum()){
                list.set(i,vo);
                flag = 1;
            }
        }
        return flag;
    }

    @Override
    public int delete(MemberVO vo) {
        int flag=0;
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
    public MemberVO selectOne(MemberVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);


        MemberVO vo2 = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum()==vo.getNum()){
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
        System.out.println(searchKey);
        System.out.println(searchWord);

        List<MemberVO> list2 = new ArrayList<>();
        if(searchKey.equals("id")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getId()==searchWord){
                    list2.add(list.get(i));
                }
            }
        } else if (searchKey.equals("name")) {
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getName().contains(searchWord)){
                    list2.add(list.get(i));
                }
            }

        } else if (searchKey.equals("tel")) {
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getTel().contains(searchWord)){
                    list2.add(list.get(i));
                }
            }
        }


        return list2;
    }
}
