package test.com;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");

        StudentVO vo = new StudentVO();
        StudentDAO dao = new StudentDAO();



        int result = dao.insert(new StudentVO(1,"aaa",11,22,33));
        System.out.println("return: "+result);

        result = dao.update(new StudentVO(2,"aaa",11,22,33));
        System.out.println("return: "+result);

        result = dao.delete(new StudentVO(3,"aaa",11,22,33));
        System.out.println("return: "+result);


        StudentVO vo1 = dao.selectOne(new StudentVO(4,"aaa",11,22,33));
        System.out.println(vo1);

        StudentVO[] vos = dao.selectAll();

        vos = dao.searchList("aaa","bbb");

    }//end main
}//end class
