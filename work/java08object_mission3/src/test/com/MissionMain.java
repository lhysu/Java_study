package test.com;

public class MissionMain {
    public static void main(String[] args) {
        System.out.println("hello");

        Board[] b = new Board[5];

        for (int i = 0; i < 5; i++) {
            b[i] = new Board();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d, %s, %s, %s, %s\n",
                    b[i].num,b[i].title,b[i].content,b[i].writer,b[i].date);
        }

        System.out.println("==========================");

        for (int i = 0; i < 5; i++) {
            b[i] = new Board(i+1,"java","multi campus","lee","20240708");
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d, %s, %s, %s, %s\n",
                    b[i].num,b[i].title,b[i].content,b[i].writer,b[i].date);
        }




    }//end mission
}//end class
