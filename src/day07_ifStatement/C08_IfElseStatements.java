package day07_ifStatement;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 kenar uzunlugu giriniz");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0 ) {
            System.out.println("Eskenar Ucgen");
        } else {
            System.out.println("Eskenar Degil");
        }



    }
}
