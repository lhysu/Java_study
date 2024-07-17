package test.com.board;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements BoardDAO {

    List<BoardVO> list = new ArrayList<>();

    public BoardDAOImpl(){
        for (int i = 0; i < 5; i++) {
            BoardVO vo = new BoardVO();
            vo.setNum(1+i);
            vo.setTitle("title"+(1+i));
            vo.setContent("content"+(1+i));
            vo.setWriter("writer"+(1+i));
            vo.setWdate(new Timestamp(System.currentTimeMillis()).toString());
            list.add(vo);
        }
    }


    @Override
    public int insert(BoardVO vo) {

        int flag = 0;
        System.out.println("insert()...");
        if(list.size()==0){
            vo.setNum(1);
        }else{
            vo.setNum(list.get(list.size()-1).getNum()+1);
        }
        vo.setWdate(new Timestamp(System.currentTimeMillis()).toString());

        list.add(vo);
        return flag;
    }

    @Override
    public int update(BoardVO vo) {
        int flag = 0;
        System.out.println("update()...");
        System.out.println(vo);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum()==vo.getNum()){
                list.set(i,vo);
                flag =1;
            }
        }
        return flag;
    }

    @Override
    public int delete(BoardVO vo) {
        int flag = 0;
        System.out.println("delete()...");
        System.out.println(vo);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum()==vo.getNum()){
                list.remove(i);
                flag =1;
            }
        }
        return flag;
    }

    @Override
    public BoardVO selectOne(BoardVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        BoardVO vo2 = null;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum()==vo.getNum()){
                vo2 = list.get(i);
            }
        }
        return vo2;
    }

    @Override
    public List<BoardVO> selectAll() {
        System.out.println("selectAll()...");
        return list;
    }

    @Override
    public List<BoardVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<BoardVO> list2 = new ArrayList<>();
        if(searchKey.equals("title")) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getTitle().equals(searchWord)) {
                    list2.add(list.get(i));
                }
            }
        }else if (searchKey.equals("writer")) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getWriter().equals(searchWord)){
                    list2.add(list.get(i));
                }
            }
        }


        return list2;
    }
}
