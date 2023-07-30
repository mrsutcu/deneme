package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_FibonacciSayisi {
    public static void main(String[] args) {

        // Soru- Verilen pozitif n tam sayısını alarak,
        //       bize ilk n tane Fibonacci sayısını bir list olarak döndüren
        //       bir method oluşturur

        // Fibonacci serisi: 0 1 1 2 3 5 8 13 21 34 55 89 144 233

        System.out.println(fibonacciListesiOlustur(1250)); // [0, 1, 1, 2, 3, 5]

    }


    public static List<Integer> fibonacciListesiOlustur(int fibonacciSayiAdedi){
        List<Integer> fibonacciSerisi = new ArrayList<>();
        int ilk = 0;
        int ikinci = 1;
        int temp;

        if (fibonacciSayiAdedi <= 0){
            System.out.println("Lan adam akıllı sayı ver");

        }else if (fibonacciSayiAdedi ==1){
            fibonacciSerisi.add(0);
            return fibonacciSerisi;
        } else{

            fibonacciSerisi.add(ilk);
            fibonacciSerisi.add(ikinci);

            for (int i = 1; i <= fibonacciSayiAdedi-2 ; i++) {

                fibonacciSerisi.add(ilk + ikinci);
                temp = ilk + ikinci;
                ilk = ikinci;
                ikinci = temp;

            }
        }
        return fibonacciSerisi;
    }



}
