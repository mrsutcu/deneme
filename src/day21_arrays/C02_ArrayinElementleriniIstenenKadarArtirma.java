package day21_arrays;

import java.util.Arrays;

public class C02_ArrayinElementleriniIstenenKadarArtirma {
    public static void main(String[] args) {

        int[] arr = {125,4575,12,2,5};
        int artis = 4;

        // verilen array'in tüm elementlerini
        // artış miktarı kadar artırın

        for (int i = 0; i < arr.length; i++) { // i array'deki indexleri gezer

            arr[i] += artis;

        }
        System.out.println(Arrays.toString(arr));

        int[] sayilar = {5,8,2};
        System.out.println(Arrays.toString(elementleriArtir(sayilar,5)));


    }

    public static int[] elementleriArtir(int[] arr, int artis){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] += artis;
        }
        return arr;
    }


}
