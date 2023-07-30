package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen double bir sayi giriniz: ");
        double girilenDouble = scanner.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz: ");
        int girilenTamSayi = scanner.nextInt();

        System.out.println("Sayilarin toplamı: " + (girilenDouble + girilenTamSayi));
        System.out.println("Sayilarin carpimi: " + girilenDouble * girilenTamSayi);





    }







}
