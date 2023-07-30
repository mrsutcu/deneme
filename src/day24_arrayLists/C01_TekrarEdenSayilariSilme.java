package day24_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_TekrarEdenSayilariSilme {
    public static void main(String[] args) {

        // verilen bir Array'de tekrar eden elementleri silin
        // Array'i unique değerlerden oluşan haline dönüştürün

        int[] arr = {2,4,5,3,2,5,1,5,3,7};

        // [2,4,5,3,1,7]

        /*
            Array'in en büyük problemi uzunluğunun değişememesidir.
            Bunun için Java, Array altyapısını kullanan
            ama uzunluğu esnek olan ArrayList class'ını oluşturmuştur.

         */

        List<Integer> tekrarsizList = new ArrayList<>();

        System.out.println(tekrarsizList); // []

        // benzersiz elementlerden oluşan bir list için
        // for loop ile array'deki tüm elementleri ele alıp
        // ele aldığımız element listede yoksa listeye ekleyebilirsiniz.


        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizList.contains(arr[i])){

                tekrarsizList.add(arr[i]);

            }

        }
        System.out.println(tekrarsizList); // [2, 4, 5, 3, 1, 7]

        // Array'i unique değerlerden oluşan haline dönüştürün

        arr = new int[tekrarsizList.size()];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]

        // bir loop ile listedeki elementleri Array'e atayabiliriz.

        for (int i = 0; i < arr.length; i++) {

            arr[i] = tekrarsizList.get(i);

        }

        System.out.println(Arrays.toString(arr)); // [2, 4, 5, 3, 1, 7]









    }
}
