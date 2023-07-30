package day07_ifStatement;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not = scanner.nextDouble();

        //if (not >= 50) System.out.println("Sinifi Gectin Affferin sana");

        //if (not < 50) System.out.println("Maalesef Kaldin Calis Gel");


        //

        if (not >=50) {
            System.out.println("Sinifi Gectin");
        } else {
            System.out.println("Maalesef Kaldin");
        }


    }
}
