package day23_multiDimensionalArrays;

public class C02_TekSayilariYazdir {
    public static void main(String[] args) {

        int[][] arr = {{3,6,8},{2,5,9},{1,3},{12,23,24}};

        // verilen array'deki tek sayıları
        // aralarında bir boşluk bırakarak yanyana yazdırın
        // en sona da "toplam ... sayı yazdırıldı" şeklinde açıklama yazdırın

        int toplam = 0;
        int sayac = 0;

        for (int i = 0; i < arr.length ; i++) { // outer array'i kontrol eder

            for (int j = 0; j < arr[i].length ; j++) { // inner array'i kontrol eder.

                // arr[i][j] tüm elementleri sırasıyla getirin

                if (arr[i][j] % 2 == 1){
                    System.out.print(arr[i][j] + " ");
                    sayac++;
                }

            }
        }
        System.out.println("\nToplam " + sayac + " adet sayı yazdırıldı");

    }
}
