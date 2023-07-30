package day15_nestedForLoop_MethodOlusturma;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*

            1                1. satır 1'den 1'e kadar yazdır.
            1  2             2. satır 1'den 2'e kadar yazdır.
            1  2  3          3. satır 1'den 3'e kadar yazdır.
            1  2  3  4       4. satır 1'den 4'e kadar yazdır.

         */

        for (int i = 1; i <= 4 ; i++) {  // satırları kontrol eder

            for (int j = 1; j <= i; j++) {  // sütunları kontrol eder

                System.out.print(j + "  ");
            }
            System.out.println("");
        }


    }
}
