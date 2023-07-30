package day11_stringManipulations;

import javax.sql.rowset.spi.SyncResolver;

public class C03_substring {
    public static void main(String[] args) {

        String str = "Java Candir" ;

        /*
            substring() bize berilen bir String'in istenen parçasını alma imkanı tanır.
            İki türlü kullanımı vardır.
            1- Başlangıç index'ini verirseniz, o index'ten sona kadar olan kısmı verir.

         */

        System.out.println(str.substring(3));
        System.out.println(str.substring(7));
        System.out.println(str.substring(0));
        //System.out.println(str.substring(15));
        System.out.println(str.substring(3,6));
        System.out.println(str.substring(5,10));
        System.out.println(str.substring(1,2));
        System.out.println(str.substring(6,8).toUpperCase());
        System.out.println(str.substring(3,3));

        //son 3 harfi yazdırın
        System.out.println(str.substring(str.length()-3));


        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candır";

        System.out.println(str1 + str2 + str3);
        System.out.println(str1.concat(str2).concat(str3));
    }
}
