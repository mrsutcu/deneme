package day13_stringManipulations_forLoop;

public class C06_forLoopDikkatEdilecekler {
    public static void main(String[] args) {

        // Verdiğimiz başlangıç değeri bitiş şartını sağlamazsa

        for (int i = 0; i > 10 ; i++) {
            System.out.println(i);
        }

        // Başlangıç değeri ve değişim şekli hiçbir zaman bitiş değerine ulaşmazsa
        // sonsuz loop ulaşır


        //for (int i = 0; i >=0 ; i++) {

           // System.out.println(i + " ");

        // }

        // Kullanıcının verdiği başlanıç ve bitiş değerleri dahil olarak
        // bu sayıların arasında sayıya tam bölünebilen bir sayı varsa
        // "aranan sayı ile tam bölünebilen bir sayı var" yazdırın

        int baslangic = 201;
        int bitis = 237;

        int arananSayi = 43;

        for (int i = baslangic; i <= bitis; i++) {
            System.out.println(i);
            if (i % arananSayi == 0){
                System.out.println("aranan sayı ile tam bölünebilen bir sayı var");
                break;
            }

        }
        /*
            bir loop devam ederken eğer bir değerde istediğimiz işlem gerçekleşir ve loop'un geri kalanına
            ihtiyacımız olmazsa orada break kullanabiliriz. Java break komutunu gördüğünde loop'u çalıştırmayı bırakır.
         */






    }
}
