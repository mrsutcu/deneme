package day08_IfElseIfStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi = scanner.nextInt();


        if (sayi % 3 == 0 && sayi % 5 == 0) System.out.println("Süper sayı");

        else if (sayi % 5 == 0 ) System.out.println("5'in katı");

        else if (sayi % 3 == 0 && sayi % 5 == 0); System.out.println("3'ün katı");

        //else System.out.println("Yaramaz Sayi");



    }
}
