package day08_IfElseIfStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter = scanner.next().charAt(0);

        if (girilenKarakter >= 'A' && girilenKarakter <= 'Z') {
            System.out.println("Girilen Karakter Büyük Harf");
        } else {
            System.out.println("Girilen Karakter Büyük Harf Değil");
        }



    }
}
