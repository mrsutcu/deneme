package day08_IfElseIfStatements;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("Boyunuzu giriniz");
        double boy = scanner.nextDouble();

        double endeks = kilo * 10000 / (boy * boy);

        if (endeks >= 30) {
            System.out.println("Obez");
        } else if (endeks >=25) {
            System.out.println("Kilolu");
        } else if (endeks >=20) {
            System.out.println("Normal");
        } else {
            System.out.println("Zayif");
        }







    }
}
