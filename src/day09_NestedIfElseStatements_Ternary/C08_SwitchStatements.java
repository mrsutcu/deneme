package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C08_SwitchStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yazdırmak istediğiniz ay, kaçıncı ay ?");

        int ayNo = scanner.nextInt();

        if (ayNo == 1) System.out.println("Ocak");
        else if (ayNo == 2) System.out.println("Şubat");
        else if (ayNo == 3) System.out.println("Mart");
        else if (ayNo == 4) System.out.println("Nisan");
        else if (ayNo == 5) System.out.println("Mayıs");
        else if (ayNo == 6) System.out.println("Haziran");
        else if (ayNo == 7) System.out.println("Temmuz");
        else if (ayNo == 8) System.out.println("Ağustos");
        else if (ayNo == 9) System.out.println("Eylül");
        else if (ayNo == 10) System.out.println("Ekim");
        else if (ayNo == 11) System.out.println("Kasım");
        else if (ayNo == 12) System.out.println("Aralık");
        else System.out.println("Ay numarası yanlış");

        System.out.println("----------");

        switch (ayNo){

            case 1 :
                System.out.println("Ocak");
                break;
            case 2 :
                System.out.println("Şubat");
                break;
            case 3 :
                System.out.println("Mart");
                break;
            case 4 :
                System.out.println("Nisan");
                break;
            case 5 :
                System.out.println("Mayıs");
                break;
            case 6 :
                System.out.println("Haziran");
                break;
            case 7 :
                System.out.println("Temmuz");
                break;
            case 8 :
                System.out.println("Ağustos");
                break;
            case 9 :
                System.out.println("Eylül");
                break;
            case 10 :
                System.out.println("Ekim");
                break;
            case 11 :
                System.out.println("Kasım");
                break;
            case 12 :
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Ay numarası yanlış");
        }

    }
}
