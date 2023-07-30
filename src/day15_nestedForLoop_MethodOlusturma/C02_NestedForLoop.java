package day15_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        /*
            Kullanıcıdan 2 rakam alın.
            İlk rakam satır
            İkinci rakam sütun olmak üzere aşağıdaki şekli çizin:

            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Oluşturulacak şeklin satır sayısını giriniz");
        int satir = scanner.nextInt();

        System.out.println("Oluşturulacak şeklin sütun sayısını giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) { // satırları kontrol eder

            for (int j = 1; j <= sutun ; j++) { // sütunları kontrol eder

                System.out.print("*  ");

            }

            System.out.println("");
        }




    }
}
