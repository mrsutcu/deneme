package day23_multiDimensionalArrays;

public class C01_TumElementleriToplama {
    public static void main(String[] args) {

        int[] arrTek = {3,7,1,23};
        // Bu Array'in tüm elementlerini toplayın

        int toplam = 0;

        for (int i = 0; i < arrTek.length ; i++) {

            //  arrTek[i] index değiştikçe bize Array'deki tüm elementleri getirir.

            toplam += arrTek[i];

        }

        System.out.println("arrTek'in elementleri toplamı: " + toplam);

        int[][] sayilar = {{1,5,6},{3},{5,8},{6,8,5},{4,7,1}};

        // arr[i] inner array'leri geritirir.
        // arr[i][j] bize int elementleri verir.
        // yani katsayısı kadar index'e yani forloop'a ihtiyacımız var.

        toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) { // dışardaki forLoop outer Array'i kontrol eder.

            for (int j = 0; j < sayilar[i].length ; j++) { // içerdeki forLoop inner array'leri kontrol eder.

                // sayilar[i][j] sırasıyla her bir int elementi bana getirir.

                toplam += sayilar[i][j];
                
            }

        }
        System.out.println("arrTek'in elementleri toplamı: " + toplam);

    }
}
