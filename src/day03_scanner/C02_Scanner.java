package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");

        int girilenSayi = scanner.nextInt();

        System.out.println("girilen sayinin karesi: " + girilenSayi*girilenSayi);

        ////

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Lutfen double bir sayi giriniz: ");
        double girilenDouble = scanner1.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz: ");
        int girilenTamSayi = scanner1.nextInt();

        System.out.println("Sayilarin toplamı: " + girilenDouble + girilenTamSayi);
        System.out.println("Sayilarin carpimi: " + girilenDouble * girilenTamSayi);














    }



}
