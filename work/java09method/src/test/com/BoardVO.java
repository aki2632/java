package test.com;

public class BoardVO {

    private int num;
    private String title;
    private String content;
    private String writer;
    private  String wdate;

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
                "num=" + num +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", wdate='" + wdate + '\'' +
                '}';
    }
}
