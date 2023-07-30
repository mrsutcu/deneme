package day05_matematikselislemler_increment;

public class C04_Preincrement_Posincrement {

    public static void main(String[] args) {

        // Java'da bir önceki class'da yaptığımız gibi
        // arttırma ve atama veya arttırma ve yazdırma beraber olabilir.

        int a = 20;
        int b = 10;

        System.out.println(b = 2 * a); // --> a'yı 2 ile çarp sonra b'ye ata. Cevap=40 var olan değerin üstüne ekleme yapmaz

        System.out.println(a = b -5); // --> b'nin güncel değeri 40. b'nin güncel değerini 5 azalt ve a'ya ata.

        // nadiren de olsa bu tarz yazım şekli de olabilir.



        // önce a'nın değerini b'ye ata, sonra a'yı arttır.
        a = 10;
        b = a++;
        System.out.println("a: " + a + " b: " + b); // a: 11 b:10



        // önce a'nın değerini 1 arttır sonra a'nın değerini b'ye ata
        a = 10;
        b = ++a;
        System.out.println("a: " + a + " b: " + b);

        /*
            Bu kullanım sadece a++ a-- ++a --a için geçerlidir.
            Burada ++ veya --'yi önce mi yoksa sonra mı kullanacağımıza bizden istenen duruma göre karar veririz.

            arttırma önce ise ++a
            arttırma sonra ise a++
         */

        a = 20;
        System.out.println(a++); // önce a'yı 1 arttır sonra a'yı yazdır
        System.out.println(a); // a'nın güncel yazdır.

        a = 20;
        System.out.println(--a); // a'yı 1 eksilt sonra a'yı yazdır.
        System.out.println(a);  // a'nın güncel halini yazdır.

        int c = b++ + a; // --> önce b ile a'yı topla, sonucu c'ye ata, sonra b'yi 1 arttır.


    }
}
