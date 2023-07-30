package day08_IfElseIfStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz. Erkek: E , Kadın: K");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'E') {

            if (yas < 0 || yas > 100) {
                System.out.println("geçersiz yaş girişi");
            }else if (yas >= 65) {
                System.out.println("Erkek emekli olabilir");
            }else {
                System.out.println("emekli olmak için daha " + (65-yas) + " yıl daha çalışmalısın");
            }

        } else if (cinsiyet == 'K') {

            if (yas < 10 || yas > 80) {
                System.out.println("geçersiz yaş girişi");
            } else if (yas >= 60) {
                System.out.println("Kadın emekli olabilir");
            } else {
                System.out.println( "emekli olmak için daha " + (60-yas) + " yıl daha çalışmalısınız");
            }

        } else {
            System.out.println("Cinsiyet hatalı girildi");
        }






    }
}
