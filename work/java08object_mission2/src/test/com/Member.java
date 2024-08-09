package test.com;

public class Member {
    private int num;
    private String id;
    private String password;
    private String name;
    private String phone;

    public Member() {}

    public Member(int num, String id, String password, String name, String phone) {
        this.num = num;
        this.id = id;
        this.password = password;
        this.name = name;
        this.phone = phone;
    }

    // 게터와 세터
    public int getNum() { return num; }
    public String getId() { return id; }
    public String getPassword() { return password; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
}
