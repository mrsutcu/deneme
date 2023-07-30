package day20_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturma {
    public static void main(String[] args) {

        int[] sayilar = {2,4,6,8};

        String harfler[] = {"a","f","e"};

        System.out.println(sayilar[1]); // 4  (4 sayılar variable'ında 1.indexte)
        System.out.println(harfler[2]); // e  (e harfler variable'ınde 2.indexte)

        String[] ogrenciList = {"Burhan", "Ramazan", "Samet", "Senol"};
        System.out.println(ogrenciList[1]);

        // 5 kişilik bir sınıf oluşturun

        String[] sinifListesi1 = {null, null, null, null, null};
        String[] sinifListesi2 = new String[5];

        /*
            Bir array oluşturulurlen 2 şey mutlaka belirtilmelidir.
            1- içine yazılacak dataların türü
            2- Array'in uzunluğu ( Bir array'e oluşturulurken yazılan uzunluğundan daha fazla element konulamaz.)
         */

        // bir array'in tümünü nasıl yazdırabiliriz ?

        System.out.println(sayilar);

        // döngü ile yazdıralım

        for (int i = 0; i < sayilar.length ; i++) {
            System.out.print(sayilar[i] + " "); // 2 4 6 8
        }
        System.out.println("");
        // Array'in tamamını yazdırmak isterseniz
        // Arrays class'ından hazır method kullanırız

        System.out.println(Arrays.toString(sayilar));

        // for loop ile elementleri yazdırırız.
        // Arrays.toString() ile bize array'in kendisini yazdırırız.

        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.toString(sinifListesi1));
        System.out.println(Arrays.toString(sinifListesi2));

        int[] notlar = new int[4];
        System.out.println(Arrays.toString(notlar));

        boolean[] bllist = new boolean[8];
        System.out.println(Arrays.toString(bllist));

    }
}
