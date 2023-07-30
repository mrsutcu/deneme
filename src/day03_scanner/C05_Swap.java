package day03_scanner;

import java.util.Scanner;

public class C05_Swap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz");

        int ilkSayi = scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");

        int ikincisayi = scanner.nextInt();

        int temp = ilkSayi;

        ilkSayi= ikincisayi;

        ikincisayi = temp;

        System.out.println("ilk sayinin yeni degeri: " + ilkSayi);
        System.out.println("ikinci sayinin yeni degeri: " + ikincisayi);




    }



}
