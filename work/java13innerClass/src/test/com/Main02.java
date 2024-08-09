package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Mother m = new Mother() {
            @Override
            public void play() {
                System.out.println("play()...1");
            }
        };
        m.play();

        test(m);
        test(new Mother() {
            @Override
            public void play() {
                System.out.println("play()...2");
            }
        });

        Mother m2 = test2();
        m2.play();
    }

    public static void test(Mother m) {
        m.play();
    }

    public static Mother test2() {
        return new Mother() {
            @Override
            public void play() {
                System.out.println("play()...3");
            }
        };
    }

}
