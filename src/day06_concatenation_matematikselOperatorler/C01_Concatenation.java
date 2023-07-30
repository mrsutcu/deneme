package day06_concatenation_matematikselOperatorler;

public class C01_Concatenation {
    public static void main(String[] args) {

        /*
            Concatenation = Birleştirme

            Bir String'i başka bir String veya primitive değer(int, double, byte, short vs.) ile + işareti kullanarak işleme sokarsak
            Java bu değişkenleri birleştirerek yeni bir Sring oluşturur.

            Önemli Not:
            Eğer matematiksel bir işlemin içinde String kullanılırsa;
            matematikteki öncelikler dikkate alınarak işlem yapılır.
            Sıra String ile toplamaya geldiğinde toplama yerine Concatenation uygulanır.




         */




        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";
        int a = 3;
        int b = 5;

        System.out.println( s1 + a + b ); //"Java35"

        System.out.println( s1 + a * b ); //"Java15"

        System.out.println( a + b + s2 ); // "8Candir"

        System.out.println( b + (a+s1) ); // "53Java"

        System.out.println( s4 + b + a + s1 ); // "53Java"

        System.out.println( b + s4 + a + s1 ); // "52Java"

        System.out.println( a + s4 + b + s3 + s1 ); // "35 Java"





    }
}
