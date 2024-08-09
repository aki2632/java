package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        // 스레드 - Thread(run 메소드, start 메소드,,,)
        // start >> 실행대기(runnable) >> 실행(run) >> sleep >> 일시정지 >> 인터럽트(interrupt) >> 실행대기(runnable) >>> 반복
        // stop: 스레드 즉시종료 - 불안전 종료를 유발하므로 미사용 권장
        // 인터럽트: 일시정지 상태의 스레드에서 InterruptedException를 발생시켜 catch문에서 실행대기 또는 종료 상태로 갈수있도록 해준다.

        // 1. ThreadEx 클래스 생성 - extends Thread
        Thread t = new ThreadEx();
        t.start();

        // 2. 익명내부클래스
        new Thread(){
            @Override
            public void run() {
                // 실제로 멀티프로세스가 동작될 코드블럭
                System.out.println("Inner start run()...");

                for (int i = 100; i < 110; i++) {
                    try {
                        System.out.println(i);
                        Thread.sleep(100);  // 1000 -> 1초
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("end 100-109...");

                System.out.println("Inner end run()...");
            }
        }.start();

        // 3-1. Runnable <--- RunnableImpl
        Runnable r = new RunnableImpl();
        new Thread(r).start();

        // 3-2. Runnable 익명내부클래스 구현
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inner2 start run()...");

                for (int i = 1000; i < 1010; i++) {
                    try {
                        System.out.println(i);
                        Thread.sleep(100);  // 300 milliseconds
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("end 1000-1010...");

                System.out.println("Inner2 end run()...");
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(100);  // 1000 -> 1초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("end 0-10...");

        System.out.println("end main...");
    }
}
