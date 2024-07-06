package test.com;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        //객체 생성 시에 생성자를 정의해서 속성 초기화 가능
        NoteBook nb = new NoteBook();

        System.out.println(nb);
        System.out.println(nb.model);
        System.out.println(nb.price);
        System.out.println(nb.size);

        nb = new NoteBook("Apple",200,5.5);

        System.out.println(nb);
        System.out.println(nb.model);
        System.out.println(nb.price);
        System.out.println(nb.size);

        nb = new NoteBook("LG",15.5);

        System.out.println(nb);
        System.out.println(nb.model);
        System.out.println(nb.price);
        System.out.println(nb.size);

        nb = new NoteBook("MM",500);

        System.out.println(nb);
        System.out.println(nb.model);
        System.out.println(nb.price);
        System.out.println(nb.size);

        //Ctrl 누른 상태에서 클래스 이름 누르면 생성자로 이동

    }//end main
}//end class
