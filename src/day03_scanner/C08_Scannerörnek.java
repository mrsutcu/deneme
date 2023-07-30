package day03_scanner;

import java.util.Scanner;

public class C08_Scannerörnek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("İsim giriniz");
        String isim = scanner.nextLine();

        System.out.println("Soyisim giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Yaşınızı giriniz");
        int yas = scanner.nextInt();

        System.out.println("Kaydınız başarıyla tamamlanmıştır.");




    }
}
