package day11_stringManipulations;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mail adresi giriniz");
        String mail = scanner.nextLine();

        if (!mail.contains("@")){
            System.out.println("Geçersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("Mail Gmail olmalı");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("Mailde yazım hatası var");
        }




    }
}
