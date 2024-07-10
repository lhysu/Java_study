package test.com;

public class StudentDAOimpl implements StudentDAO{
    @Override
    public int insert(StudentVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        return 0;
    }

    @Override
    public int update(StudentVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        return 0;
    }

    @Override
    public int delete(StudentVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        return 0;
    }

    @Override
    public StudentVO selectOne(StudentVO vo) {
        System.out.println("selectOne()...");
        vo.setNum(1);
        vo.setName("kim");
        vo.setKor(11);
        vo.setEng(22);
        vo.setMath(33);

        return vo;
    }

    @Override
    public StudentVO[] selectAll() {
        System.out.println("selectAll()...");
        StudentVO[] vos = new StudentVO[3];
        for (int i = 0; i < vos.length; i++) {
            StudentVO vo = new StudentVO();
            vo.setNum(1+i);
            vo.setName("kim");
            vo.setKor(11+i);
            vo.setEng(22+i);
            vo.setMath(33+i);
            vos[i] = vo;
        }
        return vos;
    }

    @Override
    public StudentVO[] searchList(String searchKey, String searchValue) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchValue);
        StudentVO[] vos = new StudentVO[3];
        for (int i = 0; i < vos.length; i++) {
            StudentVO vo = new StudentVO();
            vo.setNum(1+i);
            vo.setName("kim");
            vo.setKor(11+i);
            vo.setEng(22+i);
            vo.setMath(33+i);
            vos[i] = vo;
        }
        return vos;
    }
}
