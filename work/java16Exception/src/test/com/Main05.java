package test.com;

public class Main05 {
    public static void main(String[] args) {
        // 사용자 정의 객체로 오류를 강제 발생시켜줄 수 있다.
        // throw + new My 예외객체

        try {
            //throw new MyException();    // Exception을 상속 받은 클래스
            //throw new MyException(33);    // Exception을 상속 받은 클래스
            MyException my = new MyException(33);
            System.out.println(my);
            throw  my;  // 강제 오류 발생
        } catch (Exception e) {
            System.out.println("catch...");
        }

        //System.out.println("end main...");
    }
}
