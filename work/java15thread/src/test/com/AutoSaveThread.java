package test.com;

public class AutoSaveThread extends Thread{
    public void save() {
        System.out.println("save()...");
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("run()...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // throw new RuntimeException(e);
                break;  // 오류 발생하기위한 반복문 탈출용 브레이크
            }
            save();
        }
    }
}
