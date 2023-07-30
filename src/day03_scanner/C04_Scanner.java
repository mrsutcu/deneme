package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");

        double yaricap = scanner.nextDouble();

        System.out.println("Cemberin cevresi: " + 2*3.14*yaricap);
        System.out.println("Cemberin alani : " + 3.1*yaricap*yaricap);














    }
}
