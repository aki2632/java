package test.com;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");

        PrintThread2 pt = new PrintThread2();
        pt.start();

        // 1초 정지
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 인터럽트 메소드 활용해 종료시키기
        pt.interrupt();

        System.out.println("end main...");
    }
}
