package day05_matematikselislemler_increment;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        // ilk sayı için birler basamağını bulalım

        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        // birler basamağındadaki sayıyı aldık, artık ondan kurtulalım

        girilenSayi = girilenSayi / 10;

        // bu satıra geldiğimizde girilen sayıyı 2 basamaklı hale dönüştürdük

        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        girilenSayi = girilenSayi / 10;

        // buraya geldiğimizde artık sayımız tek basamaklı


        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        girilenSayi = girilenSayi / 10;

        System.out.println("Rakamlar toplamı: " + rakamlarToplami);





    }

}
