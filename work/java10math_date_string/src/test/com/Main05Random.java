package test.com;

import java.util.Random;

public class Main05Random {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 문자열 배열 정의
        String[] technologies = {"java", "css", "javascript", "html", "jsp", "web"};

        // 함수 호출 및 리턴된 문자열 출력
        String randomTech = getRandomStringFromArray(technologies);
        System.out.println("Random Technology: " + randomTech);

        int diceSum = rollThreeDice();
        System.out.println("Sum of three dice rolls: " + diceSum);
    }

    // 랜덤함수를 이용해 배열의 무작위한 문자열을 리턴하는 함수
    public static String getRandomStringFromArray(String[] array) {
        // 랜덤 객체 생성
        Random random = new Random();
        // 배열의 길이 내에서 랜덤 인덱스 생성
        int randomIndex = random.nextInt(array.length);
        // 무작위한 문자열 리턴
        return array[randomIndex];
    }

    public static int rollThreeDice() {
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1; // 1부터 6까지의 수
        int dice2 = random.nextInt(6) + 1; // 1부터 6까지의 수
        int dice3 = random.nextInt(6) + 1; // 1부터 6까지의 수
        return dice1 + dice2 + dice3;
    }
}
