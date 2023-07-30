package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C05_varOlanArrayeYeniDegerAtama {
    public static void main(String[] args) {

        /*
            Var olan bir Array'e lenght olarak belirlenenden
            daha fazla element atanamaz.

            Ancak;
            Var olan bir Array'e
            Başka bir Array'i değer olarak atayabiliriz.
         */

        int[] arr = {3,4,5,6,8,1};
        System.out.println(arr.length); // 6

        // 7. elementi bu Array'e atayabilir miyiz?
        // arr[6] = 13; // ArrayIndexOutOfBoundsException

        arr = new int[8];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0, 0, 0]

        String[] harfler = {"a", "n", "y"};
        String[] yeniHarfler = {"k", "l", "m", "n"};

        harfler = yeniHarfler;
        System.out.println(Arrays.toString(harfler)); // [k, l, m, n]

        System.out.println(Arrays.toString(yeniHarfler)); // [k, l, m, n]

        // Eğer var olan bir Array'e yeni değer ataması için
        // Liste yazmak istiyorsak aşağıdaki gibi bir atama yapabilirsiniz

        harfler = new String[]{"x"};
        System.out.println(Arrays.toString(harfler));



    }
}
