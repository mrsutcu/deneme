package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C06_ArrayeBirElemanEkleme {
    public static void main(String[] args) {

        // verilen bir Array'in uzunluğunu bir arttırarak
        // verilen bir elementi ekleyin

        int[] arr = {3,7,8};
        int eklenecekSayi = 10;

        // 1- Önce uzunluğu eski Array'den bir fazla olan yeniArr oluşturalım
        int[] yeniArr = new int[arr.length+1];

        // 2- arr'deki var olan elementleri, aynı indexlerle
        // yeniArr'ye kopyalayalım

        for (int i = 0; i < arr.length ; i++) {
            yeniArr[i] = arr[i];
        }

        // 3- eklenecek elementi, yeniArr'nin son index'ine aayalım

        yeniArr[yeniArr.length-1] = eklenecekSayi; // [3, 7, 8, 10]

        // 4- eski arr'ye yeni değeri atayalım

        arr = yeniArr;

        System.out.println("arr'nin son hali: " + Arrays.toString(yeniArr)); // arr'nin son hali: [3, 7, 8, 10]

    }

    public static int[] arrayeBirElemanEkle(int[] eskiArr , int eklenecekSayi){
        int[] yeniArr = new int[eskiArr.length+1];

        for (int i = 0; i < eskiArr.length ; i++) {
            yeniArr[i] = eskiArr[i];
        }

        yeniArr[yeniArr.length-1] = eklenecekSayi;

        eskiArr = yeniArr;

        return yeniArr;


    }
}
