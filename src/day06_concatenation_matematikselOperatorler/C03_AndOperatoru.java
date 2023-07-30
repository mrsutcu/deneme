package day06_concatenation_matematikselOperatorler;

public class C03_AndOperatoru {
    public static void main(String[] args) {

        System.out.println( 5 > 3 && 6 > 4 ); // true and true ==> true

        System.out.println( 5 < 3 && 6 > 4 ); // false and true ==> false

        System.out.println( 5 > 3 && 6 <= 4 ); // true and false ==> false

        System.out.println( 5 <= 3 && 6 <=4 ); // false and false ==> false

        //bir sayının hem 2, hem 3 hem de 5 ile bölünebilmesi lazım

        int sayi = 24;

        System.out.println( sayi % 2 == 0 && sayi % 3 == 0 && sayi % 5 == 0);
        //                  true             true             false         ==> false

        //sayi 0 veya daha büyük ve 100 veya daha küçük olmalıdır.
        //sayı 0 ile 100 arasında olmalıdır (0 ve 100 dahil)

        System.out.println( sayi >= 0 && sayi <= 100);
        //                  true         true       ==> true




    }
}
