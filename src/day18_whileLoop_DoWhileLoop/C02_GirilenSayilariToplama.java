package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C02_GirilenSayilariToplama {
    public static void main(String[] args) {

        // Kullancııdan toplamak üzere sayılar alın
        // Girilen sayıların toplamı 500'ü geçerse;
        // bu kadar sayı yeter, girilen sayıların toplamı ... oldu yazdırın.
        // Girilen sayı adedi 10 veya daha yüksek olursa
        // 10'dan fazla sayı giremezsin, girilen sayıların toplamı ... oldu yazdırın.
        // ve işlemi bitirin.


        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int sayi;

        while (sayac <= 10 && toplam < 500) { // while loop'un içi true oldukça çalışmaya devam edecek.

            scanner = new Scanner(System.in);
            System.out.println("Lütfen toplanmak üzere sayı girin");
            sayi = scanner.nextInt();

            toplam += sayi;
            sayac++;
        }
            // while loop bitti ise
            // şartlardan biri sağlanmadı

        if (sayac >= 10){
            System.out.println("10'dan fazla sayı giremezsin, girilen sayıların toplamı "+toplam+" oldu");
        }

        if (toplam > 500){
            System.out.println("Bu kadar sayı yeter, girilen sayıların toplamı "+toplam+" oldu");
        }




    }
}
