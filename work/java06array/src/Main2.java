public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String[] names = new String[]{"kin", "lee", "han"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println("names.length" + names.length);

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for(String x: names) {
            System.out.println(x);
        }
    }
}