package day18_whileLoop_DoWhileLoop;

public class C07_DoWhileLoop {

    public static void main(String[] args) {

        /*

            do-while ile while 
         */



        int baslangic = 10;
        int bitis = 20;
        int toplam = 0;

        // while loop ile baslangic değeri ile bitiş değeri arasındaki sayıları toplayıp yazdırın.(sınırlar dahil)


        while (baslangic <= bitis){
            toplam += baslangic;
            baslangic++;
        }

        System.out.println("While Loop ile Aradaki Sayıların Toplamı: " + toplam);

        // şimdi de do while loop ile yapalım.
        baslangic = 10;
        bitis = 20;
        toplam = 0;

        do {
            toplam += baslangic;
            baslangic++;

        }while (baslangic <= bitis);

        System.out.println("Do While Loop ile Aradaki Sayıların Toplamı: " + toplam);

    }




}
