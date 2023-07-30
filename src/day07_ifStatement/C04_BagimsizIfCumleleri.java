package day07_ifStatement;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi girin");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0) {
            System.out.println("3 ile bolunebilen sayi");
        }
        if (sayi % 5 == 0) {
            System.out.println("5 ile bolunebilen sayi");
        }


    }
}
