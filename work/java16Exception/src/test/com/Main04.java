package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main04 {
    public static void main(String[] args) {
        // 오류를 강제 발생시켜줄 수 있다.
        // throw + new 예외객체

        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch...");
        }

        //System.out.println("end main...");
    }
}
