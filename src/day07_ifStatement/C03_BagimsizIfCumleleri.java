package day07_ifStatement;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 5 == 0) {
            System.out.println("Sayi 5'in tam kati");
        }

    }
}
