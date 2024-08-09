package test.com;

public class Main02 {
    public static void main(String[] args) {
        // 싱글톤 패턴(프로그래밍 개발 디자인패턴)
        // 클래스에서 만들수 있는 인스턴스
        // 이 객체의 접근은 어디서든지 하나로만 통일해서 제공하도록 객체생성하는 기법

        // 컨셉: 특정시스템에 많은 프린트기능이 있다라고 하고 프린트스풀은 하나여야함

        // 멀티 스레드에서의 싱글톤
        new Thread() {
            @Override
            public void run() {
                PrintSpool ps1 = PrintSpool.getInstance();
                System.out.println(ps1);
                ps1.print("hello111");
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                PrintSpool ps2 = PrintSpool.getInstance();
                System.out.println(ps2);
                ps2.print("hello222");
            }
        }.start();
    }
}
