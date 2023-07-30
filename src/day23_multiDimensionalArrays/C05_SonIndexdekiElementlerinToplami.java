package day23_multiDimensionalArrays;

public class C05_SonIndexdekiElementlerinToplami {
    public static void main(String[] args) {

        // Soru- Verilen 2 katlı bir Array'de
        //       her bir inner Array'in son elementlerinin
        //       toplamlarını yazdıran bir method oluşturun

        int[][] sayilar = {{3,4,5}, {1,4},{5,2,7},{1,9,0,3}};

        sonElementleriTopla(sayilar);



    }

    public static void sonElementleriTopla(int[][] sayilar){

        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i][sayilar[i].length-1];

        }
        System.out.println("inner array'lerdeki son elementlerin toplamı: " + toplam);



    }



}
