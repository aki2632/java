package test.com;

public class Main01 {
    public static void main(String[] args) {
        // 예외처리 - 프로그램 컴파일 또는 실행시 발생할 수 있는 오류에 대해 ㄷ처하는 문법

        // 1. 배열의 범위를 벗어나서 접근할 때 오류(실행오류 - 비정상 종료)
        test01();
        System.out.println("==================");

        // 2. 0으로 나누면 발생.  by zero 실행오류
        test02();
        System.out.println("==================");

        // 3. null 값에 접근 >>> 연산자 사용시 실행오류
        test03();
        System.out.println("==================");

        // 4. 숫자모양의 문자를 정수로 변환할 때 숫자가 아닌 문자에 의한 실행오류
        test04();
        System.out.println("==================");

        System.out.println("end main...");
    }

    private static void test01() {
        System.out.println("test01...");

        int[] sus = new int[5];

        try {
            System.out.println("try...1");
            System.out.println(sus[5]);
            System.out.println("try...2");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("catch...3");
        }
    }

    private static void test02() {
        System.out.println("test02...");

        try {
            System.out.println("try...1");
            System.out.println(10/10);
            System.out.println("try...2");
        } catch (ArithmeticException ex) {
            System.out.println("catch...3");
        }
    }

    private static void test03() {
        System.out.println("test03...");

        try {
            System.out.println("try...1");
            String str = null;
            System.out.println(str.length());
            System.out.println("try...2");
        }catch (NullPointerException ex) {
            System.out.println("catch...3");
        }
    }

    private static void test04() {
        System.out.println("test04...");

        try {
            System.out.println("try...1");
            String str = "99";
            System.out.println(Integer.parseInt(str) + 100);
            System.out.println("try...2");
        }catch (NumberFormatException ex) {
            System.out.println("catch...3");
        }
    }
}
