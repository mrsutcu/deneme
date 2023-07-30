package day06_concatenation_matematikselOperatorler;

public class C02_KarsilastirmaOperatorleri {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Java'da tek = işareti karşılaştırma değil atama işaretidir.

        b = 2 * a ;

        // Java'da eşitliği kontrol etmek istersek == kullanırız.
        // == eşitliğin sol tarafı ile eşitliğin sağ taraı aynı mı diye sorar.

        System.out.println(b == 2 * a); // 20 == 20 ==> true

        // assignment'ta eşitliğin sol tarafında sadece variable bulunur.
        // sol tarafta matematiksel işlem olmaz.
        // karşılaştırma operatörlerinde(==) iki tarafta da işlem olabilir.

        System.out.println(3 * b > 5 * a); // 60 > 50 ==> true

        System.out.println(b >= b - a); // 20 >= 10 ==> true

        System.out.println(a <= b - a); // 10 <= 10 ==> true

        System.out.println(a < b); // 10 < 20 ==> true

        System.out.println(!(a < b)  ); // ! eşit değildir demek. 10 < 20 ==> sonucun tersini al. false

        System.out.println(a != b); // a eşit eğildir b'ye. 10 =! 20 ==> true




    }
}
