package test.com;

public class MemberVO {

    private int num;
    private String id;
    private String pw;
    private String name;
    private String tel;

    public MemberVO() {
    }

    public MemberVO(int num, String id, String pw, String name, String tel) {
        this.num = num;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}//end class
