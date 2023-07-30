package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan toplanmak üzere pozitif sayılar isteyin.
        // Kullanıcı işlemi bitirmek için 0'a basmalıdır.
        // Kullanıcı 0'a bastığında kaç pozitif sayı girdiğini
        // ve toplamlarının kaç olduğunu yazdırın


        /* önce while loop ile yapalım

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int girilenSayi = 989;


        while (girilenSayi != 0) {

            scanner = new Scanner(System.in);
            System.out.println("Lütfen toplanmak üzere pozitif tam sayı giriniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0){
                toplam += girilenSayi;
                sayac++;
            }



        }

        System.out.println("Girilen " + sayac + " adet sayının toplamı: " + toplam);
        */

        // do while ile yapalım

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int girilenSayi ;

        do {
            scanner = new Scanner(System.in);
            System.out.println("Lütfen toplanmak üzere pozitif tam sayı giriniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0){
                toplam += girilenSayi;
                sayac++;
            }

        }while (girilenSayi != 0);

        System.out.println("Girilen " + sayac + " adet sayının toplamı: " + toplam);


    }



}
