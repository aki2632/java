package test.com;

public class MissionMain2 {
    public static void main(String[] args) {
        Member[] members = new Member[5];
        members[0] = new Member(1, "user1", "pass1", "Alice", "010-1111-1111");
        members[1] = new Member(2, "user2", "pass2", "Bob", "010-2222-2222");
        members[2] = new Member(3, "user3", "pass3", "Charlie", "010-3333-3333");
        members[3] = new Member(4, "user4", "pass4", "David", "010-4444-4444");
        members[4] = new Member(5, "user5", "pass5", "Eve", "010-5555-5555");

        System.out.println("번호\t아이디\t비밀번호\t이름\t전화번호");
        for (Member member : members) {
            System.out.printf("%d\t%s\t%s\t%s\t%s%n",
                    member.getNum(),
                    member.getId(),
                    member.getPassword(),
                    member.getName(),
                    member.getPhone());
        }
    }
}
