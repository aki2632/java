package test.com;

import com.multi.SmartPhone;

public class Main06 {
    // main 메서드에서 생성자 호출 및 초기화
    public static void main(String[] args) {
        // 생성자 호출을 통해 SmartPhone 객체 생성 및 초기화
        SmartPhone phone = new SmartPhone("iphone14", 1000, 100, "2.0.0");

        // 객체의 상태를 출력
        System.out.println("Model: " + phone.getModel());
        System.out.println("Price: " + phone.getPrice());
        System.out.println("Weight: " + phone.getWeight());
        System.out.println("Version: " + phone.getVersion());
    }
}
