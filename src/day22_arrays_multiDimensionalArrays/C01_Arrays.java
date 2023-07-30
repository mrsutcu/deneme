package day22_arrays_multiDimensionalArrays;

public class C01_Arrays {
    public static void main(String[] args) {

        String[] isimler ={"Ayşe", "Yusuf", "Bugra", "Abdullah", "Nergiz"};
        // verilen bir Array'deki uzunluğu tek sayı olan isimleri
        // yanyana aralarında bir boşluk bırakarak yazdırın.
        // en sonda al satıra geçerek toplam kaç isim yazdırıldığını yazdırın.

        int sayac = 0;
        int kelimeUzunlugu = 0;

        for (int i = 0; i < isimler.length ; i++) {

            kelimeUzunlugu= isimler[i].length();

            if (kelimeUzunlugu % 2 != 0){
                System.out.println(isimler[i] + " ");
                sayac++;

            }

        }

        System.out.println("\nToplam " + sayac + " adet isim yazdırıldı");



    }
}
