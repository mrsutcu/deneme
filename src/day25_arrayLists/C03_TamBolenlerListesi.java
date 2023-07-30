package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenlerListesi {
    public static void main(String[] args) {

        // Soru- Verilen pozitif bir tam sayıyı,
        //       tam bölebilen tüm pozitif tam sayıları
        //       bir liste olarak bize döndüren bir method oluşturun.


        System.out.println(pozitifTamBolenlerListesi(20)); // [1, 2, 4, 5, 10, 20]
        System.out.println(pozitifTamBolenlerListesi(720));// [1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18, 20, 24, 30, 36, 40, 45, 48, 60, 72, 80, 90, 120, 144, 180, 240, 360, 720]
        System.out.println(pozitifTamBolenlerListesi(1325)); // [1, 5, 25, 53, 265, 1325]
        System.out.println(pozitifTamBolenlerListesi(71)); // [1, 71]

    }
    
    public static List<Integer> pozitifTamBolenlerListesi(int sayi){
        
        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <= sayi ; i++) {

            if (sayi % i == 0){
                tamBolenlerListesi.add(i);
            }
        }
        
        return tamBolenlerListesi;
    }
    
    
    
}
