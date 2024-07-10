package test2.com;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        BoardDAO dao = new BoardDAOImpl();
        BoardVO vo = new BoardVO();

        //1.insert
        vo.setNum(1);
        vo.setTitle("java...");
        vo.setContent("study...");
        vo.setWriter("admin");
        vo.setWdate("2024-12-22");
        int result = dao.insert(vo);
        System.out.println(result);

        //2.update
        result = dao.update(vo);
        System.out.println(result);

        //3.update
        result = dao.delete(vo);
        System.out.println(result);

        //4.selectOne
        BoardVO vo2 = dao.selectOne(vo);
        System.out.println(vo2);

        //5.selectAll
        BoardVO[] vos = dao.selectAll();
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
        }

        //6.searachList
        vos = dao.searchList("title","java");
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
        }



    }//end main
}//end class
