package product;

import test.com.BoardVO;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOimpl implements ProductDAO{

    public List<ProductVO> list = new ArrayList<>();

    public ProductDAOimpl() {
        for (int i = 0; i < 5; i++) {
            ProductVO vo = new ProductVO();

            vo.setNum(1+i);
            vo.setPname("pname"+i);
            vo.setModel("model"+i);
            vo.setPrice(100+i);
            vo.setCount(200+i);

            list.add(vo);
        }

    }

    @Override
    public int insert(ProductVO vo) {
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
    public int update(ProductVO vo) {
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
    public int delete(ProductVO vo) {
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
    public ProductVO selectOne(ProductVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        ProductVO vo2 = null;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum()==vo.getNum()){
                vo2 = list.get(i);
            }
        }

        return vo2;
    }

    @Override
    public List<ProductVO> selectAll() {
        System.out.println("selectAll()...");
        return list;
    }

    @Override
    public List<ProductVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        List<ProductVO> list2 = new ArrayList<>();
        if(searchKey.equals("pname")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getPname().contains(searchWord)){
                    list2.add(list.get(i));
                }
            }
        }else if(searchKey.equals("model")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getModel().contains(searchWord)){
                    list2.add(list.get(i));
                }
            }
        }else{
            list2 = list;
        }

        return list2;
    }
}
