package test.com;

public class Student {
    int number;
    String name;
    int kor;
    int eng;
    int math;

    public Student(){
        number = 1;
        name = "kim";
        kor = 99;
        eng = 99;
        math = 99;
    }

    public Student(int number, String name, int kor, int eng, int math){
        this.number = number;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
