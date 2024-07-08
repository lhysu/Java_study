package test.com;

public class StudentDAO {

    int insert(StudentVO vo){
        System.out.println("insert()...");
        System.out.println(vo);
        return 1;
    }

    int update(StudentVO vo){
        System.out.println("update()...");
        System.out.println(vo);
        return 2;
    }

    int delete(StudentVO vo){
        System.out.println("delete()...");
        System.out.println(vo);
        return 3;
    }

    StudentVO selectOne(StudentVO vo){
        System.out.println("selectOne()...");
        System.out.println(vo);
        return new StudentVO(1,"aaa",99,88,77);
    }

    StudentVO[] selectAll(){
        System.out.println("selectAll()...");
        StudentVO[] vos = new StudentVO[3];
        for (int i = 0; i < vos.length; i++) {
            vos[i] = new StudentVO();
            System.out.println(vos[i]);
        }
        return vos;
    }

    StudentVO[] searchList(String s1,String s2){
        System.out.println("searchList()...");
        System.out.println(s1+" "+s2);
        StudentVO[] vos = new StudentVO[3];
        for (int i = 0; i < vos.length; i++) {
            vos[i] = new StudentVO(2,"bbb", 44,55,66);
            System.out.println(vos[i]);
        }
        return vos;
    }

}
