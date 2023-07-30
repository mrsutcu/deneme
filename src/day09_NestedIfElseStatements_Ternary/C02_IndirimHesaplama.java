package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C02_IndirimHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz");
        int urunSayisi = scanner.nextInt();

        System.out.println("Lütfen liste fiyatını giriniz");
        double listeFiyati = scanner.nextDouble();

        System.out.println("Müşteri kartınız var mı? \nE : Evet , H : Hayır");
        char kartVarmi = scanner.next().toUpperCase().charAt(0);

        if (kartVarmi == 'E') { // kartı olanlar
            if (urunSayisi > 10) {
                System.out.println("%20 indirimli toplam fiyat: " + urunSayisi*listeFiyati*80/100 );
            }else {
                System.out.println("%15 indirimli toplam fiyat: " + urunSayisi*listeFiyati*85/100 );
            }


        }else if (kartVarmi == 'H') { // kartı olmayanlar
            if (urunSayisi > 10) {
                System.out.println("%15 indirimli toplam fiyat: " + urunSayisi*listeFiyati*85/100 );
            } else {
                System.out.println("%10 indirimli toplam fiyat: " + urunSayisi*listeFiyati*90/100 );
            }
        }else {
            System.out.println("Kart bilgisi hatalı");
        }


    }
}
