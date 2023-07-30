package day14_forLoops;

import java.util.Scanner;

public class C04_faktoriyel {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoriyel degerini hesaplayin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("20'den küçük pozitif bir tam sayı girin");
        int sayi = scanner.nextInt();

        int carpim = 1;

        for (int i = 1; i <= sayi ; i++) {

            carpim *= i;
        }

        System.out.println("Girilen sayı olan " + sayi + "! = " + carpim);








    }
}
