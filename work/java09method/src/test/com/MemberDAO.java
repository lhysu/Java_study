package test.com;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Member;

public class MemberDAO {

    void insert(){
        System.out.println("insert()...");
    }

    void update(int x){
        System.out.println("update()...x: "+x);
    }

    void update(int x, int y){
        System.out.println("update()...x: "+x+", y: "+y);
    }

    void update(String x, int y){
        System.out.println("update()...x: "+x+", y: "+y);
    }
    void update( int x, String y){
        System.out.println("update()...x: "+x+", y: "+y);
    }

    void update(MemberVO mb){
        System.out.println("update(MemberVO)...");
        /*System.out.print(mb.num+" ");
        System.out.print(mb.id+" ");
        System.out.print(mb.pw+" ");
        System.out.print(mb.name+" ");
        System.out.println(mb.tel+" ");*/
        System.out.println(mb);     //toString을 굳이 안붙여도 Object 타입을 println하면 자동으로 toString을 붙여줌
        System.out.println(mb.toString());
    }


    void update(int num,
                String id,
                String pw,
                String name,
                String tel){
        System.out.println("update(AllArgs)...");
        System.out.print(num+" ");
        System.out.print(id+" ");
        System.out.print(pw+" ");
        System.out.print(name+" ");
        System.out.println(tel+" ");
    }

    int delete(){
        System.out.println("delete()...");
        int x = 87;
        return x;
    }

    String delete2(){
        System.out.println("delete2()...");
        String x = "kim";
        return x;
    }

    int[] delete3(){
        System.out.println("delete3()...");
        int[] x = new int[3];
        return x;
    }

    String[] delete4(){
        System.out.println("delete4()...");
        String[] x = new String[3];
        return x;
    }

    MemberVO delete5(){
        System.out.println("delete5()...");
        MemberVO mvo = new MemberVO();
        return mvo;
    }


    int select(int x, int y){
        System.out.println("select()...");
        int sum = x+y;
        return sum;
    }

    int select2(int x1, int x2, int x3, int x4){
        System.out.println("select2()...");
        return x1+x2+x3+x4;
    }

    int select3(int...x){
        System.out.println("select3()...");
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }






}
