package test.com;

public class PrintThread1 extends Thread{
    private boolean stop;   // false

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while(!stop) {
            System.out.println("Running...");
        }
        System.out.println("Stop run...");
    }
}
