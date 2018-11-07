public class Les {
    public static void main(String[] args) {
        metod1();
        metod2();
        String resultOfMetod2 = metod2();
        metod3(resultOfMetod2);
    }

    public static void metod1() {
        int a = 5;
        int b = 19;
        System.out.println(a + b);
    }

    public static String metod2() {
        String s1 = "s1";
        String s2 = "s2";
        String s3 = s1 + s2;
        return s3;
    }

    public static void metod3(String s) {
        if (s.isEmpty()) {
            return;

        }
        System.out.println(s);
    }


}


