package test.com.comments;

import java.sql.Date;

public class CommentsVO {
    private int num;
    private String content;
    private String writer;
    private Date wdate;
    private int bnum;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getWdate() {
        return wdate;
    }

    public void setWdate(Date wdate) {
        this.wdate = wdate;
    }

    public int getBnum() {
        return bnum;
    }

    public void setBnum(int bnum) {
        this.bnum = bnum;
    }

    @Override
    public String toString() {
        return "CommentsVO [num=" + num + ", content=" + content + ", writer=" + writer + ", wdate=" + wdate + ", bnum=" + bnum + "]";
    }
}
