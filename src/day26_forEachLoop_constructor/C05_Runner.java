package day26_forEachLoop_constructor;

import java.net.http.WebSocket;
import java.util.*;

public class C05_Runner {
    public static void main(String[] args) {


        List<String> liste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Set<Integer> ogrenciListesi = new HashSet<>();
        String str = new String("Java candır");

                   C04                  obje           =             new             C04();
        //Class adı / data türü         isim     atama işareti     keyword        constructor

        System.out.println(obje.hiz);   // 0
        System.out.println(obje.kapasite);  // 0
        System.out.println(obje.ogrenciIsmi);   // null
        System.out.println(obje.sayi);  // 10
        obje.method1(); // method1 çalıştı
    }

    /*
        Herhangi bir Class'ın içinden
        başka bir Class'daki class üelerine (variable, method)
        ulaşmak isterseniz
        hedef class'dan bir obje oluşturabilirsiniz.

        Java'da bir Class'dan obje oluşturmak istediğinizde
        Mutlaka bir constructor çalışır.

        Java'da objeler class'lardan üretilir.
        Class'larda obje üretilebilmesi için CONSRUCTOR olmalıdır.
        Java bunu bildiği için, oluşturulan her class'a
        obje oluşturulmasını sağlayan DEFAULT CONSTRUCTOR yerleştirir.

        Default kelimesi, birlikte kullanıldığı kelime ile anlam kazanır.
        default değer :Class level'da oluşurulan variable'lara
                       biz değer atamazsak, java deafult değerler atar.
        default case : switch statement'da hiç bir case ile uyumlu olmayan
                       değerler için tanımlanan kodlardır.
        default access modifier: içinde bulunulan class ve içinde bulunulan pacage'da
                       erişilibilen class üyelerini belirler.

        DEFAULT CONSTRUCTOR görünmez, parametresizdir ve body'sinde kod yoktur.

        ÖNEMLİ:
        Bir class'da görünür bir Constructor yoksa
        o class'da default constructor vardır.
        Görünür bir constructor varsa
        Java, default constructor'ı siler.


     */


}
