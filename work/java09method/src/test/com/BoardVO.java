package test.com;

public class BoardVO {

    private int num;
    private String title;
    private String content;
    private String writer;
    private String wdate;

    public BoardVO() {

    }

    public BoardVO(int num,
                   String title,
                   String content,
                   String writer,
                   String wdate) {
        this.num = num;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.wdate = wdate;

    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "content='" + content + '\'' +
                ", num=" + num +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", wdate='" + wdate + '\'' +
                '}';
    }
}

//DAO: 기능 위주의 객체
//DTO: 데이터 전달만을 하는 객체 (Value obj)
