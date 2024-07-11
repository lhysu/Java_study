package test.com;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        //1.NoteBook을 상속받는 클래스 NoteBookEx
        NoteBookEx nbx = new NoteBookEx();
        int sum = nbx.insert(11,22);
        System.out.println("sum:"+sum);
        System.out.println(nbx.update("kim"));

        //2.Anonymous inner
        NoteBook nb = new NoteBook() {
            @Override
            public int insert(int x, int y) {
                System.out.println("inner class...insert()");

                return x*y;
            }

            @Override
            public String update(String name) {
                System.out.println("inner class...update()");
                return "hello "+name;
            }
        };
        System.out.println(nb.insert(33,44));
        System.out.println(nb.update("lee"));






    }//end main
}//end class
