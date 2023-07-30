package day12_StringManipulations;

public class C01_IndexOf {
    public static void main(String[] args) {

        String str = "Ali topu at, topu at Ali";

        // ilk top metin parçasının index'ini yazdırın
        System.out.println(str.indexOf("top"));

        // ikinci top metin parçasının index'ini yazdırın
        System.out.println(str.indexOf("top",5));
        System.out.println(str.indexOf("top",str.indexOf("top")+1));

        // at kelimesinin iki kere kullanılıp kullanılmadığını metne bakmadan bulun

        int ilkIndex = str.indexOf("at");// ya -1 olur ya da doğal sayı olur

        if (ilkIndex == -1){
            System.out.println("2 kere kullanılmamış");
        }else{ // en az 1 kere kullanılmış

            int ikinciIndex = str.indexOf("at",ilkIndex+1);
            // -1 veya 2.defa kullanılmışsa doğal sayı olur
            if (ikinciIndex == -1){// sadece 1 kere kullanılmış, 2. kullanım yok
                System.out.println("2 kere kullanılmamış");
            }else{
                System.out.println("2 defa veya daha fazla kullanılmamış");
            }







        }




    }
}
