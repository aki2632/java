package test.com;

class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("RunnableImpl start run()...");

        for (int i = 200; i < 210; i++) {
            try {
                System.out.println(i);
                Thread.sleep(100);  // 300 milliseconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("end 200-210...");

        System.out.println("RunnableImpl end run()...");
    }
}
