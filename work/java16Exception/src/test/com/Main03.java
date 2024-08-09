package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");

        //예외 처리(try~catch)와 예외전가(throws)

        try{
            test01();
        }catch (Exception ex){
            System.out.println("catch...");
        }

        test02();

        System.out.println("end main....");
    }//end main

    private static void test02() {
        BufferedReader br = null;
        InputStreamReader isr = null;
        InputStream is = null;
        try {
            //System.out.println(10/0);
            is = System.in;
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String name = br.readLine();
            System.out.println("name:"+name);
        } catch (Exception e) {
            System.out.println("Exception catch...");
        }finally {
            if(br!=null)try {  br.close(); } catch (IOException e) { }
            if(isr!=null)try {  isr.close(); } catch (IOException e) { }
            if(is!=null)try {  is.close(); } catch (IOException e) { }
        }

    }

    private static void test01() throws Exception{

        //System.out.println(10/0);
        System.out.println(Integer.parseInt("a001"));

    }


}//end class
