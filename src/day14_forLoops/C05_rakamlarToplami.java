package day14_forLoops;

import java.util.Scanner;

public class C05_rakamlarToplami {
    public static void main(String[] args) {

        //  Soru 7- Kullanicidan pozitif bir tamsayi alip, 
        //  rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlarını toplamak üzere pozitif bir tam sayı giriniz");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;  // 1453
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        int basamakSayisi = (sayi + "").length(); // 4

        for (int i = 1; i <= basamakSayisi ; i++) {

            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;


        }
        System.out.println("Girilen " + girilenSayi + " sayısının rakamları toplamı : " + rakamlarToplami);

    }
}
