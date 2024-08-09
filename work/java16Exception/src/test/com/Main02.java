package test.com;

public class Main02 {
    public static void main(String[] args) {
        // 여러개의 오류 처리를 위한 멀티캐치문
        
        // try 블럭에서의 오류 발생 유무와 상관없이 반드시 수행하는 블럭(finally)

        try {
            // NumberFormatException
            System.out.println(Integer.parseInt("a1000"));

            // NullPointerException
            String str = null;
            System.out.println(str.length());

            // ArithmeticException
            System.out.println(10/0);

            // ArrayIndexOutOfBoundsException
            int[][] suss = new int[5][5];
            System.out.println(suss[5][5]);
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("catch...ArrayIndexOutOfBoundsException");
        }catch (ArithmeticException ex) {
            System.out.println("catch...ArithmeticException");
        }catch (NullPointerException ex) {
            System.out.println("catch...NullPointerException");
        }catch (NumberFormatException ex) {
            System.out.println("catch...NumberFormatException");
        }catch (Exception ex) {
            System.out.println("catch...Exception");
        }finally {
            System.out.println("finally...");
        }

        System.out.println("end main...");
    }
}
