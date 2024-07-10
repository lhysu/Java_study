package test.com;

public class StudentVO {
    private int num;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentVO() {
    }

    public StudentVO(int num, String name, int kor, int eng, int math) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "eng=" + eng +
                ", num=" + num +
                ", name='" + name + '\'' +
                ", kor=" + kor +
                ", math=" + math +
                '}';
    }
}
