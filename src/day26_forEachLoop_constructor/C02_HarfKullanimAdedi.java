package day26_forEachLoop_constructor;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {

        // Soru- Kullanıcıdan bir cümle ve bir harf alın.
        //       Harf, cümlede kullanılmışsa; kaç kere kullanıldığını yazın,
        //       Kullanılmamışsa; " harf cümlede kullanılmamış" yazdırın.


        String cumle = "Java her geçen gün daha zevkli hale geliyor";
        String harf = "a";

        String[] cumleArr = cumle.split(""); // Cümledeki her harfi tek tek ayırır.

        int sayac = 0;

        for (String each: cumleArr
             ) {
            if (each.equals(harf)){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Aradığınız harf cümlede kullanılmamış");
        }else {
            System.out.println("Aradığınız '" + harf + "' harfi cümlede " + sayac + " kere kullanılmış.");
        }




    }
}
