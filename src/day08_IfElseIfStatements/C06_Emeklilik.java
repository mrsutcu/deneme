package day08_IfElseIfStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz. Erkek: E , Kadın: K");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("Erkek Emekli Olabilir");
        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("Erkek Emekli Olamaz " + (65-yas) + " yıl daha çalışmalısınız");
        } else if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("Kadın Emekli Olabilir");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("Kadın Emekli Olamaz " + (60-yas) + " yıl daha çalışmalısınız");
        }




    }
}
