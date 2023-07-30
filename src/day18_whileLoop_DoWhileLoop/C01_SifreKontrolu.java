package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C01_SifreKontrolu {
    public static void main(String[] args) {


        /*
              Main method'da
              Kullanicidan bir sifre isteyip, oluşturacağımız bir method'da asagidaki sartlari kontrol edin
              method'dan true veya false döndürün

              ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin.
              Tüm sartlar saglanincaya kadar tekrar deger isteyin
              ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
            - ilk harf kucuk harf olmali
            - son karakter rakam olmali
            - sifre bosluk icermemeli
            - uzunlugu en az 10 karakter olmali

         */

        /*
            Bu soru day17'de çözüldü.
            Ama Java'da daha profesonel kodlama için iki düzeltme yapacağız.

            1-
            while loop'un içi true olduğu müddetçe true çalışır.

            bu soruda sonuç variable'ı da boolean değer içeriyor
            ama sorunun mantığı açısından sonuç false olduğu sürece loop çalışmalı

            2- while loop her çalıştığında
            Scanner scanner = new Scanner(System.in);
            String sifre = scanner.nextLine();
            çalışıyor ve yeni bir obje oluşturuyor.

            bunun yerine daha güzel olanı;
            loop'dan önce objeyi oluşturup
            loop'un içerisinde sadece değer ataması yapmaktadır.


         */


        boolean sonuc = false;
        Scanner scanner;
        String sifre;

        while (!sonuc){
            scanner = new Scanner(System.in);
            System.out.println("Lütfen şifrenizi giriniz");
            sifre = scanner.nextLine();
            sonuc = sifreKontrolEt(sifre);
        }

        System.out.println("Şifreniz başarıyla kaydedildi");






    }

    public static boolean sifreKontrolEt(String sifre){

        int sayac = 0; // sayaç hataları saysın

        // - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf >='a' && ilkHarf <= 'z')){
            System.out.println("İlk karakter küçük harf olmalı");
            sayac++;
        }

        // - son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);
        if (!(sonKarakter >='0' && sonKarakter <= '9')){
            System.out.println("Son karakter rakam olmalı");
            sayac++;
        }

        // - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
            sayac++;
        }

        // - uzunlugu en az 10 karakter olmali
        if (sifre.length() < 10){
            System.out.println("Şifrenin uzunluğu en az 10 karakter olmalıdır");
            sayac++;
        }

        if (sayac == 0){
            return true;
        }else{
            return false;
        }

    }
}
