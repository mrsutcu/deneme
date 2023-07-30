package day25_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayiListeCevirme {
    public static void main(String[] args) {

        Integer[] arr = {1,3,5,1,5,1,5,6,9,8,2,5,9,8,5,6,5,8,7,4,5,8};

        // bu arrayi bir list olarak kaydedin

        List<Integer> forList = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            forList.add(arr[i]);

        }
        System.out.println(forList); // [1, 3, 5, 1, 5, 1, 5, 6, 9, 8, 2, 5, 9, 8, 5, 6, 5, 8, 7, 4, 5, 8]

        /*
            Arrays class'ı bize verilen Array'i List'e çeviren hazır bir method oluşturur.

            Ancak;

            Bu methodu kullanarak bir Array List'e çevirmenin 2 büyük dezavantajı var.
            1- add() ve remove() gibi list'in uzunluğunu değiştiren method'ları desteklemez.
            2- her ne kadar biz bir list oluşturmuş olsak da
             java arka planda hazır method ile oluşturulan list ve kaynak arr'yi ilişkilendirir.
             Birbirine yapılan değişiklik diğerine de işlenir.
         */

        List<Integer> hazirMethodList = Arrays.asList(arr);
        System.out.println(hazirMethodList); // [1, 3, 5, 1, 5, 1, 5, 6, 9, 8, 2, 5, 9, 8, 5, 6, 5, 8, 7, 4, 5, 8]

        forList.remove(3);
        System.out.println(forList); // [1, 3, 5, 5, 1, 5, 6, 9, 8, 2, 5, 9, 8, 5, 6, 5, 8, 7, 4, 5, 8]

        // hazirMethodList.remove(3);
        // System.out.println(hazirMethodList); // UnsupportedOperationException

        forList.set(0,10);
        System.out.println(forList); // [10, 3, 5, 5, 1, 5, 6, 9, 8, 2, 5, 9, 8, 5, 6, 5, 8, 7, 4, 5, 8]
        System.out.println(Arrays.toString(arr)); // [1, 3, 5, 1, 5, 1, 5, 6, 9, 8, 2, 5, 9, 8, 5, 6, 5, 8, 7, 4, 5, 8] array değişmedi


        hazirMethodList.set(0,20);
        System.out.println(hazirMethodList); // [20, 3, 5, 1, 5, 1, 5, 6, 9, 8, 2, 5, 9, 8, 5, 6, 5, 8, 7, 4, 5, 8]
        System.out.println(Arrays.toString(arr)); // [20, 3, 5, 1, 5, 1, 5, 6, 9, 8, 2, 5, 9, 8, 5, 6, 5, 8, 7, 4, 5, 8]


    }
}
