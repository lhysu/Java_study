package test2.com;

public class BoardDAOImpl implements BoardDAO{
    @Override
    public int insert(BoardVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);

        return 0;
    }

    @Override
    public int update(BoardVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        return 0;
    }

    @Override
    public int delete(BoardVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        return 0;
    }

    @Override
    public BoardVO selectOne(BoardVO vo) {
        System.out.println("selectOne()...");
        vo.setNum(1);
        vo.setTitle("aaa");
        vo.setContent("bbb");
        vo.setWriter("kim");
        vo.setWdate("ccc");
        return vo;
    }

    @Override
    public BoardVO[] selectAll() {
        System.out.println("selectAll()...");
        BoardVO[] vos = new BoardVO[3];
        for (int i = 0; i < vos.length; i++) {
            BoardVO vo = new BoardVO();
            vo.setNum(1+i);
            vo.setTitle("aaa");
            vo.setContent("bbb");
            vo.setWriter("kim");
            vo.setWdate("ccc");
            vos[i] = vo;

        }
        return vos;
    }

    @Override
    public BoardVO[] searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        BoardVO[] vos = new BoardVO[3];
        for (int i = 0; i < vos.length; i++) {
            BoardVO vo = new BoardVO();
            vo.setNum(1+i);
            vo.setTitle("aaa");
            vo.setContent("bbb");
            vo.setWriter("kim");
            vo.setWdate("ccc");
            vos[i] = vo;

        }
        return vos;
    }
}
