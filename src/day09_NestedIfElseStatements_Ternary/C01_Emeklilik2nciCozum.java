package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C01_Emeklilik2nciCozum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz. Erkek: E , Kadın: K");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scanner.nextDouble();

        if (yas < 10 || yas > 80){
            System.out.println("Geçersiz Yaş");
        } else if (yas < 60) {
            if (cinsiyet == 'K') {
                System.out.println("Kadın emekli olabilmek için daha " + (60-yas) + " yıl daha çalışmalı");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmek için daha " + (65-yas) + " yıl daha çalışmalı");
            } else {
                System.out.println("Cinsiyet hatalı");
            }

        }else if (yas < 65) {
            if (cinsiyet == 'K') {
                System.out.println("Kadın emekli olabilir");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmek için daha " + (65-yas) + " yıl daha çalışmalı");
            } else {
                System.out.println("Cinsiyet hatalı");
            }

        }else {
            if (cinsiyet == 'K' || cinsiyet == 'E') {
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("Cinsiyet hatalı");
            }
        }



    }
}
