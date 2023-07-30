package day21_arrays;

public class C03_pozitifElementleriTopla {
    public static void main(String[] args) {

        // Soru 2-  Verilen bir Array'deki
        //          pozitif tam sayıları toplayıp
        //          sonucu bize döndüren bir method yazdırın


        int[] arr = {-4,5,2,0,-3}; // beklenen output: pozitif elementlerin toplamı 10

        System.out.println(pozitifElementleriTopla(arr));


    }

    public static int pozitifElementleriTopla(int[] arr){
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > 0){
                toplam += arr[i];
            }
        }
        return toplam;

    }

}
