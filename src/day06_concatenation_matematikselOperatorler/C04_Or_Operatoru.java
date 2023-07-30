package day06_concatenation_matematikselOperatorler;

public class C04_Or_Operatoru {

    public static void main(String[] args) {

        System.out.println( 3 > 5 || 6 > 4 ); //false || true ==> true

        System.out.println( 3 < 5 || 6 > 4 ); // true || true ==> true

        System.out.println( 3 < 5 || 6 < 4 ); // true || false ==> true

        System.out.println( 3 > 5 || 6 < 4 ); // false || false ==> false

        //sayı 3e veya 5e bölünmelidir.

        int sayi = 24;

        System.out.println( sayi % 3 == 0 || sayi % 5 == 0); // true || false ==> true

        //sayı 0'dan büyük veya 100'den küçük olmalıdır.

        System.out.println( sayi > 0 || sayi < 100); // true || true







    }
}
