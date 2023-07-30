package day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C02_TamBolenlerSayisiniBulma {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif tam bolenlerin sayısını bulmak istediğiniz sayıyı giribiz");
        int sayi = scanner.nextInt();


        System.out.println(tamBolenlerSayisi(sayi));

    }

    public static int tamBolenlerSayisi(int sayi){

        int sayac = 0;

        for (int i = 1; i <= sayi ; i++) {
            if (sayi % i == 0){
                sayac++;
            }
        }

        return sayac;

    }



}
