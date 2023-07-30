package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_ArrayOlustur {
    public static void main(String[] args) {

        // Soru 5- Kullanıcıdan Array'in boyutunu ve elementlerini alıp
        //         Array'i oluşturan ve bize döndüren bir method oluşturun.

        System.out.println(Arrays.toString(arrayOlustur()));




    }

    public static int[] arrayOlustur(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Array'in uzunluğunu giriniz");

        int uzunluk = scanner.nextInt();

        int[] arr = new int[uzunluk]; // [0,0,0,0,0 ....]

        for (int i = 0; i < arr.length ; i++) {
            scanner = new Scanner(System.in); // for loop ile her seferinde değer alabilmesi için
                                              // var olan scanner objesine yeniden değer atayalım.
            System.out.println("Array için element giriniz");
            arr[i] = scanner.nextInt();

        }

        return arr;



    }



}
