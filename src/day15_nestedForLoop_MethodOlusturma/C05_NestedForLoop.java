package day15_nestedForLoop_MethodOlusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        int satir = 5;
        int sutun = 7;

        // dikdörtgen biçimde satır ve sütun numaralarını yazdırın

        for (int i = 1; i <= satir ; i++) {   // satır

            for (int j = 1; j <= sutun ; j++) {    // sütun

                System.out.print(i + "," + j + "    ");

            }
            System.out.println("");
        }

        System.out.println("");

        // üçgen için satır ve sütun numaralarını yazdıralım

        for (int i = 1; i <=satir ; i++) { // satır

            for (int j = 1; j <=i ; j++) {  // sütun
                System.out.print(i + "," + j + "    ");
            }
            System.out.println("");
        }



    }
}
