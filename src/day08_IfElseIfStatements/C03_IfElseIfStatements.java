package day08_IfElseIfStatements;

import java.util.Scanner;

public class C03_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scaner.nextDouble();

        if (not >= 85) {
            System.out.println("AA");
        } else if (not >= 65) {
            System.out.println("BB");
        } else if (not >= 50) {
            System.out.println("CC");
        } else {
            System.out.println("DD");
        }
    }
}
