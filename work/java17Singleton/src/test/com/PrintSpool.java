package test.com;

public class PrintSpool {
    // 1. 전역변수(static, 접근최소)
    private static PrintSpool singleton = new PrintSpool();
    
    // 2. 싱글톤객체를 리턴해주는 static 메소드
    public static PrintSpool getInstance() {
        return singleton;
    }

    // 3. 인자없는 생성자 = private
    private PrintSpool() {}

    public void print(String txt) {
        System.out.println("print()...");
        System.out.println(txt);
    }
}
