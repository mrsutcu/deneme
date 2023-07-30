package day15_nestedForLoop_MethodOlusturma;

public class C06_KendiSubStringimiz {
    public static void main(String[] args) {

        String str = "Java Candir";
        int baslangic = 3;
        int bitis = 7;

        /*

            Verilen String ve baslangic, bitis değerlerini dikkate alarak;
            1- bitis değeri baslangic değerinden küçükse hata mesajı yazdırın.
            2- baslangic veya bitis değerleri index değerleri ile uyuşmuyorsa hata mesajı verin.
            3- Değerler uygunsa başlangıç indexi'inden (dahil) bitiş index'ine (hariç) kadar karakterleri yazdırın.

         */

        if (baslangic > bitis){
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz");
        }else if (baslangic < 0 || bitis < 0 || baslangic >= str.length() || bitis >= str.length()){
            System.out.println("Index'ler hatalı");
        }else{
            for (int i = baslangic; i < bitis ; i++) {
                System.out.print(str.charAt(i));
            }
        }

        System.out.println(str.substring(baslangic,bitis));

        str.substring(5);

        /*
            Bu method bize "Candir" döndürür.
            ancak
            yazdırmazsak veya bir variable'a atamazsak
            bu method'un döndürdüğü sonuç bir işe yaramaz.
         */

        String strIstenenBolum = str.substring(5); // kaydeder ama yazdırmaz
        System.out.println(str.substring(5)); // kaydeder ve yazdırır



    }
}
