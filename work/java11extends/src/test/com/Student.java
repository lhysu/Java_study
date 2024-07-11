package test.com;

public class Student extends Person{

    int kor = 11;
    int eng = 22;
    int math = 33;

    String name = "han";

    public void study(){
        System.out.println("Student...study()");
    }

    @Override
    public void sleep() {
        System.out.println("Student...sleep()");
        System.out.println(name);
        System.out.println(age);
        System.out.println(kor);
        System.out.println(eng);
        System.out.println(math);
    }
}
