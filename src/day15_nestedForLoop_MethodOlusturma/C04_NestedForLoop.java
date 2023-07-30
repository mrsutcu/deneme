package day15_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*

            Kullanıcıdan satır sayısı olarak bir rakam alın
            ve aşağıdaki gibi bir şekil çizdirin.

            *
            *  *
            *  *  *
            *  *  *  *
            *  *  *  *  *


         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz");
        int satir = scanner.nextInt();


        for (int i = 1; i <= satir ; i++) {     // satır

            for (int j = 1; j <= i ; j++) { // sütun

                System.out.print("*  ");

            }
            System.out.println("");
        }




    }


}
