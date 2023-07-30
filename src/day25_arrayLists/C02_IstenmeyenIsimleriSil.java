package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenmeyenIsimleriSil {
    public static void main(String[] args) {

        // Soru- Verilen String bir listede
        //       istenmeyen harf içeren elementleri silip,
        //       kalan kısmını list olarak bize döndüren bir method oluşturun.

        String[] arr = {"Mehmet", "Ramazan", "Ozan", "Berk", "Nergiz", "Ayfer", "Bugra"};
        List<String> isimler = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            isimler.add(arr[i]);

        }
        System.out.println("isimler listesi: " + isimler);

        System.out.println(istenmeyenleriSil(isimler, "e")); // [Ramazan, Ozan, Bugra]

        // isimler Listesinin kalıcı olarak yeni hali almasını istersek

        System.out.println(isimler = istenmeyenleriSil(isimler, "a")); // [Mehmet, Berk, Nergiz, Ayfer]


    }

    public static List<String> istenmeyenleriSil(List<String> isimler, String istenmeyenHarf) {

        /*
            İsim sildiğimizde index kayacaktır.
            Bu da bazı elementlerin kontrol edilmesine
            ve indexOutofBounds hatasına sebep olabilir.

            Verilen listeden isim silmek yerine
            başka boş bir liste oluşturalım
            ve SİLİNMEYECEK elemanları o listeye ekleyip
            yeni listeye döndürelim
         */

        List<String> yeniList = new ArrayList<>();

        for (int i = 0; i < isimler.size() ; i++) {

            if (!isimler.get(i).contains(istenmeyenHarf)){
                yeniList.add(isimler.get(i));
            }

        }
        return yeniList;




    }

}
