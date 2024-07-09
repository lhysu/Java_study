package test.com;

public class BoardVO {

    private int num;
    private String title;
    private String content;
    private String writer;
    private String wdate;

    public void setNum(int num){
        this.num = num;
    }       //setter-속성 값 변경
    public int getNum(){
        return num;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return content;
    }

    public void setWriter(String writer){
        this.writer = writer;
    }
    public String getWriter(){
        return writer;
    }

    public void setWdate(String wdate){
        this.wdate = wdate;
    }
    public String getWdate(){
        return wdate;
    }



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
