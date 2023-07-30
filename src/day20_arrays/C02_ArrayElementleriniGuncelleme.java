package day20_arrays;

import java.util.Arrays;

public class C02_ArrayElementleriniGuncelleme {
    public static void main(String[] args) {

        int[] sayilar = new int[6];
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0, 0, 0, 0]

        //ARRAY oluştururken lenght oluşturulur. Yazdırırken index yazdırılır.


        // 2.indexdeki elementi 5 yapın

        sayilar[2] = 5;
        System.out.println(Arrays.toString(sayilar));

        // 2.indexdeki sayıyı 7 yapın

        sayilar[2] = 7;
        System.out.println(Arrays.toString(sayilar));

        // index kullanmadan bir element'e atama yapmak mümkün değildir.
        // 5.indexdeki elementi 8 yapın

        sayilar[5] = 8;
        System.out.println(Arrays.toString(sayilar));

        // 6.index'e yeni bir element ekleyelim
        sayilar[6] = 20; // run dedikten sonra bu hata oluştuğu için buna "Run Time Error" denir.

        /*
            Uzunluğu verilen bir array'de
            var olan elementler indexile update edilebilir
            ANCAK
            yeni bir element ekleyip uzunluğunu değiştirmek isterseniz
            Run Time Error oluşur
         */






    }


}
