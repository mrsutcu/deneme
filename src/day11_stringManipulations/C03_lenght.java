package day11_stringManipulations;

import java.util.Scanner;

public class C03_lenght {
    public static void main(String[] args) {

        // kullanıcıdan ismini alın
        // ve ortadaki harfi yazdırın
        // ismin uzunluğu çift sayı ise orta kısımdaki 2 harfi yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim = scanner.next();

        int uzunluk = isim.length();

        if (uzunluk % 2 == 0){ // uzunluk çift ise
            System.out.println("uzunluk çift, ortadaki iki harf: " +
                    isim.charAt(uzunluk/2-1) +
                    isim.charAt(uzunluk/2));

        }else{ // uzunluk tek ise
            System.out.println("uzunluk tek, ortadaki harf: " + isim.charAt((uzunluk-1)/2));
        }





    }
}
