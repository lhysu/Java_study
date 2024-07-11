package test.com;

public class NoteBookEx extends NoteBook{

    @Override
    public int insert(int x, int y) {
        System.out.println("NoteBookEx...insert()");

        return x+y;
    }

    @Override
    public String update(String name) {
        System.out.println("NoteBook...update()");
        return name+"님 안녕하세요";
    }
}
