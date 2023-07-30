package day08_IfElseIfStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0){
            System.out.println("Süper Sayı");
        } else if (sayi % 3 == 0){
            System.out.println("3'ün katı");
        } else if (sayi % 5 == 0) {
            System.out.println("5'in katı");
        } else System.out.println("hassiktir lo");





    }
}
