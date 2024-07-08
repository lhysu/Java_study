package test.com;

public class Board {
    int num;
    String title;
    String content;
    String writer;
    String date;

    public Board(){
        num = 1;
        title = "hello";
        writer = "kim";
        content = "hello java";
        date = "20240707";
    }

    public Board(int num, String title, String content, String writer, String date){
        this.num = num;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

}
