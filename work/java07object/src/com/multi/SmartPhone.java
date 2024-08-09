package com.multi;

// SmartPhone 클래스 정의
public class SmartPhone {
    private String model;  // 모델명
    private int price;     // 가격
    private int weight;    // 무게
    private String version; // 버전

    // 생성자 정의
    public SmartPhone(String model, int price, int weight, String version) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.version = version;
    }

    // Getter 메서드 (선택사항)
    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getVersion() {
        return version;
    }
}
