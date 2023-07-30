package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullanicidanDegerAlarakListOlusturma {
    public static void main(String[] args) {

        // Soru- Kullanıcıdan istediği kadar isim alıp,
        //       Q'ya bastığında girdiği isimleri bize liste olarak döndürecek
        //       bir method oluşturun.

        System.out.println(ListOlustur());


    }

    public static List<String> ListOlustur(){

        Scanner scanner;
        String girilenIsim;
        List<String> isimList = new ArrayList<>();

        do {
            scanner= new Scanner(System.in);
            System.out.println("Listeye eklemek için isim giriniz, \nBitirmek için Q'ya basınız");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")){
                isimList.add(girilenIsim);
            }


        }while (!girilenIsim.equalsIgnoreCase("q")); // q'ya basılmadığı sürece devam et

        return isimList;

    }
}
