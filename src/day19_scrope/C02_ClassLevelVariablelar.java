package day19_scrope;

import day07_ifStatement.C02_BagimsizIfCumleleri;

public class C02_ClassLevelVariablelar {

    static boolean bls;
    boolean bli;

    static String strs = "Java";
    String stri;

    static int sayis;
    int sayii = 23;

    static char chrs = 'a';
    char chri;


    public static void main(String[] args) {

        System.out.println(bls);   // false
        System.out.println(strs);  // Java
        System.out.println(sayis); // 0
        System.out.println(chrs);  // a

        C02_ClassLevelVariablelar obj = new C02_ClassLevelVariablelar();
        System.out.println(obj.bli);   // false
        System.out.println(obj.stri);  // null
        System.out.println(obj.sayii); // 23
        System.out.println(obj.chri);  // ''




    }

    /*
            Class Level Kurallar;

        1-  Class Level Variable'lara değer atanmasa da
            hem oluşturulabilir hem de kullanılabilir.
            Değer ataması yapmadıysak Java onlara default olan değerleri atar.
            boolean ==> false
            sayısal variable'lar için ==> 0
            non-primitive variable'lar için ==> null
            char ==> '' (char olarak hiçlik, konsolda bir şey gözükmez)

        2-  Instance variable'lar static method'lar içinden direkt ulaşılamaz.
            Eğer static method içinde instance variable kullanmamız gerekirse
            o class'tan bir obje oluşturup
            o obje üzerinden instance variable'lara ulaşabiliriz.

        3-  Başka class'taki Class Level Variablelara ulaşabiliriz.
            Static variable'lar için classIsmi.staticVariableIsmi
            yazarak ulaşabiliriz.
            Instance variable'lara ulaşmak içinse
            variable'ların olduğu class'tan obje oluşturmalıyız.

            Eğer static bir variable'a obje üzerinden ulaşmak isterseniz

     */


}
