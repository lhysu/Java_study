package test.com;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");


        StudentVO vo = new StudentVO();
        StudentDAO dao = new StudentDAOimpl();

        //1.insert
        int result = dao.insert(vo);
        System.out.println(result);

        //2.update
        result = dao.update(vo);
        System.out.println(result);

        //3.delete
        result = dao.delete(vo);
        System.out.println(result);

        //4.selectOne
        StudentVO vo1 = dao.selectOne(vo);
        System.out.println(vo1);

        //5.selectAll
        StudentVO[] vos = dao.selectAll();
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
        }

        //6.searchList
        StudentVO[] vos2 = dao.searchList("name","kim");
        for (int i = 0; i < vos2.length; i++) {
            System.out.println(vos2[i]);
        }




    }//end main
}//end class
