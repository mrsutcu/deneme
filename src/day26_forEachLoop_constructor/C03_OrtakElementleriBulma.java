package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C03_OrtakElementleriBulma {
    public static void main(String[] args) {

        // Soru- Verilen iki Array'in elementlerini karşılaştırıp,
        //       ikisinde ortak olan elementleri ayrı bir liste olarak veren bir program yazın.

        int[] arr1 = {6,69,5,1,2,5,2,9,4,1};
        int[] arr2 = {3,2,16,9,6,5,4,7,4,5,9,6};

        // bir each hem arr1 hem de arr2'deki elementleri getiremez.
        // İki array'in elementlerini bana getirmesi için içiçe 2 for-each-loop oluşturalım.
        // Elementleri karşılaştırıp, eğer eşitlerse ve daha önce listeye eklenmemişse
        // listeye ekleyelim

        List<Integer> ortakElemanlarListesi = new ArrayList<>();

        for (Integer each1: arr1
             ) {

            for (Integer each2: arr2
                 ) {

                if (each1 == each2 && !ortakElemanlarListesi.contains(each1)){
                    ortakElemanlarListesi.add(each1);
                }

                
            }
            

        }

        Collections.sort(ortakElemanlarListesi);
        System.out.println(ortakElemanlarListesi);





    }
}
