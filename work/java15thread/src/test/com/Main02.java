package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        PrintThread1 pt = new PrintThread1();
        pt.start();

        // 1초 정지
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 스레드 종료
        pt.setStop(true);

        System.out.println("end main...");
    }
}
