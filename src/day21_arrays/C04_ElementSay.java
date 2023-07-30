package day21_arrays;

public class C04_ElementSay {
    public static void main(String[] args) {

        // Soru 4- Verilen bir Array'de istenen bir elemanın var olup olmadığını
        //         ve varsa kaç kere kullanıldığını yazdıran bir method oluşturun.

        int[] arr = {3,5,2,3,5,6,7,1,8};
        int arananSayi = 2;

        elemanSay(arr,arananSayi);

    }

    public static void elemanSay(int[] arr, int arananSayi){

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arananSayi){
                sayac++;
            }
        }

        if(sayac == 0){
            System.out.println("Aranan sayı Array'de yok");
        }else{
            System.out.println("Aranan " + arananSayi +" sayısı Array'de " +
                                sayac+ " kere kullanılmış");
        }

    }


}
