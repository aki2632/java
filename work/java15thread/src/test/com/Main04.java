package test.com;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        PrintThread3 pt = new PrintThread3();
        pt.start();

        // 1초 정지
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 스레드 종료
        pt.interrupt();

        System.out.println("end main...");
    }
}
